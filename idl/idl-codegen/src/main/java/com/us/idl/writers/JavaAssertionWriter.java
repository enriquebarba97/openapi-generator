package com.us.idl.writers;

import com.google.common.collect.Iterators;
import es.us.isa.idl.idl.*;
import es.us.isa.idl.idl.impl.*;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.openapitools.codegen.CodegenOperation;
import org.openapitools.codegen.CodegenParameter;

import java.util.Iterator;

public class JavaAssertionWriter {

    public String assertOperation;
    public CodegenOperation operation;

    /**
     *  Write the assertion operation for the IDL dependency
     * @param dep
     * @return Assertion operation for the dependency
     */
    public String writeDependency(Dependency dep){
        this.assertOperation = "!";
        if(dep.getDep() instanceof ConditionalDependencyImpl) {
            writeConditionalDependency((ConditionalDependency) dep.getDep());
        }else if(dep.getDep() instanceof ArithmeticDependencyImpl){
            writeArithmeticDependency((ArithmeticDependency) dep.getDep(), true);
        } else if (dep.getDep() instanceof RelationalDependencyImpl){
            writeRelationalDependency((RelationalDependency) dep.getDep(), true);
        } else if (dep.getDep() instanceof GeneralPredefinedDependencyImpl) {
            this.assertOperation = "";
            writePredefinedDependency((GeneralPredefinedDependency) dep.getDep(), true);
        }
        return this.assertOperation;
    }

    private String writeParamName(String paramName){
        return getParameter(paramName).paramName;
    }

    private CodegenParameter getParameter(String paramName){
        return operation.queryParams.stream().filter(p->p.baseName.equals(paramName)).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("IDL parameter \"" + paramName + "\" not found in query params for operation \"" + operation.operationId +"\""));
    }

    private boolean isParamValueRelation(Param param){
        return param.getStringValues().size() != 0 || param.getPatternString() != null || param.getBooleanValue() != null || param.getDoubleValue() != null;
    }

    private void writeClause(GeneralClause clause){
        if (clause.getPredicate() != null){
            if (clause.getNot() != null)
                this.assertOperation += "!";
            this.assertOperation += "(";
            writePredicate(clause.getPredicate());
            this.assertOperation += ")";
        }

        if (clause.getFirstElement() != null){
            if (clause.getFirstElement() instanceof RelationalDependencyImpl) {
                writeRelationalDependency((RelationalDependency) clause.getFirstElement(), false);
            } else if (clause.getFirstElement() instanceof GeneralTermImpl){
                GeneralTerm term = (GeneralTerm) clause.getFirstElement();
                Param param = (Param) term.getParam();
                CodegenParameter parameter = getParameter(param.getName());

                if(term.getNot() != null)
                    this.assertOperation += "!";
                this.assertOperation += "(";

                this.assertOperation += parameter.paramName + " != null";
                if (parameter.isArray)
                    this.assertOperation += " && !" + parameter.paramName + ".isEmpty()";

                if(isParamValueRelation(param)){
                    this.assertOperation += " && ";
                    if (param.getBooleanValue() != null){
                        if (param.getBooleanValue().equals("false"))
                            this.assertOperation += "!";
                        this.assertOperation += parameter.paramName;
                    } else if (param.getDoubleValue() != null){
                        this.assertOperation += parameter.paramName + param.getRelationalOp() + Double.parseDouble(param.getDoubleValue());
                    } else if (param.getStringValues().size() != 0){
                        this.assertOperation += "(";
                        if (parameter.isArray){
                            for(String s: param.getStringValues()) {
                                this.assertOperation += parameter.paramName + ".contains(" + "\"" + s + "\") || ";
                            }
                        } else {
                            for(String s: param.getStringValues()) {
                                this.assertOperation += parameter.paramName + ".equals(" + "\"" + s + "\") || ";
                            }
                        }
                        this.assertOperation = this.assertOperation.substring(0, this.assertOperation.length()-4);
                        this.assertOperation += ")";
                    }else if (param.getPatternString() != null){
                        //TODO assert pattern
                    }
                }
                this.assertOperation += ")";

            } else if (clause.getFirstElement() instanceof ArithmeticDependencyImpl){
                writeArithmeticDependency((ArithmeticDependency) clause.getFirstElement(), false);
            } else if (clause.getFirstElement() instanceof GeneralPredefinedDependencyImpl){
                writePredefinedDependency((GeneralPredefinedDependency) clause.getFirstElement(), false);
            }

        }
    }

    private void writePredicate(GeneralPredicate predicate){
        writeClause(predicate.getFirstClause());

        if (predicate.getClauseContinuation() != null) {
            if (predicate.getClauseContinuation().getLogicalOp().equals("AND")){
                this.assertOperation += " && ";
            }else if (predicate.getClauseContinuation().getLogicalOp().equals("OR")){
                this.assertOperation += " || ";
            }
            writePredicate(predicate.getClauseContinuation().getAdditionalElements());
        }
    }

    /**
     * Write conditional dependency (IF condition THEN consequence) as
     * (!(condition) || (consequence)) in Java syntax
     * @param dep
     * @return
     */
    private void writeConditionalDependency(ConditionalDependency dep) {
        this.assertOperation += "(!";
        writePredicate(dep.getCondition());
        this.assertOperation += " || ";
        writePredicate(dep.getConsequence());
        this.assertOperation += ")";

    }

    /**
     * Write a relational dependency (e.g. p1<p2) in Java syntax
     * @param dep
     * @param alone
     * @return
     */
    private void writeRelationalDependency(RelationalDependency dep, boolean alone){
        if(alone)
            this.assertOperation += "(!(" + writeParamName(dep.getParam1().getName()) + " != null && " + writeParamName(dep.getParam2().getName()) + " != null) || (" +
                    writeParamName(dep.getParam1().getName()) + dep.getRelationalOp() + writeParamName(dep.getParam2().getName()) + "))";
        else this.assertOperation += "(" + writeParamName(dep.getParam1().getName()) + " != null && " + writeParamName(dep.getParam2().getName()) + " != null && " +
                writeParamName(dep.getParam1().getName()) + dep.getRelationalOp() + writeParamName(dep.getParam2().getName()) + ")";
    }

    /**
     * Writes arithmetic dependency (e.g. p1+p2<100) in Java syntax
     * @param dep
     * @param alone
     * @return
     */
    private void writeArithmeticDependency(ArithmeticDependency dep, boolean alone){
        this.assertOperation += "(";
        if (alone)
            this.assertOperation += "!(";
        Iterator params = IteratorExtensions.toIterable(Iterators.filter(dep.eAllContents(), Param.class)).iterator();

        while(params.hasNext()){
            Param param = (Param) params.next();
            this.assertOperation += writeParamName(param.getName()) + " != null && ";
        }

        if (alone) {
            this.assertOperation = this.assertOperation.substring(0, this.assertOperation.length()-4);
            this.assertOperation += ") || (";
        }

        writeOperation(dep.getOperation());
        this.assertOperation += dep.getRelationalOp();
        this.assertOperation += Double.parseDouble(dep.getResult());
        this.assertOperation += ")";
        if (alone)
            this.assertOperation += ")";
    }

    private String writeOperation(es.us.isa.idl.idl.Operation operation){
        if(operation.getOpeningParenthesis() == null){
            this.assertOperation += writeParamName(operation.getFirstParam().getName());
            writeOperationContinuation(operation.getOperationContinuation());
        } else {
            this.assertOperation += "(";
            writeOperation(operation.getOperation());
            this.assertOperation += ")";
            if (operation.getOperationContinuation() != null)
                writeOperationContinuation(operation.getOperationContinuation());
        }

        return this.assertOperation;
    }

    private void writeOperationContinuation(OperationContinuation opCont){
        this.assertOperation += opCont.getArithOp();
        if(opCont.getAdditionalParams() instanceof ParamImpl){
            Param param = (Param) opCont.getAdditionalParams();
            this.assertOperation += writeParamName(param.getName());
        } else {
            writeOperation((es.us.isa.idl.idl.Operation) opCont.getAdditionalParams());
        }

    }

    /**
     * Writes a predefined dependency (e.g ZeroOrOne(p1,p2)) as a call to a static method in Java
     * @param dep
     * @return
     */
    private void writePredefinedDependency(GeneralPredefinedDependency dep, boolean alone){
        if (!alone ^ dep.getNot() != null)
            this.assertOperation += "!";
        this.assertOperation += "DependencyUtil.doNotSatisfy" + dep.getPredefDepType() + "Dependency(";

        for(GeneralPredicate depElement:dep.getPredefDepElements()){
            writePredicate(depElement);
            this.assertOperation += ",";
        }
        this.assertOperation = this.assertOperation.substring(0, this.assertOperation.length()-1);
        this.assertOperation += ")";

    }

}
