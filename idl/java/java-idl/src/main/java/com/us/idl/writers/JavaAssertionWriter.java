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
        assertOperation = "";
        if(dep.getDep() instanceof ConditionalDependencyImpl) {
            writeConditionalDependency((ConditionalDependency) dep.getDep());
        }else if(dep.getDep() instanceof ArithmeticDependencyImpl){
            writeArithmeticDependency((ArithmeticDependency) dep.getDep(), true);
        } else if (dep.getDep() instanceof RelationalDependencyImpl){
            writeRelationalDependency((RelationalDependency) dep.getDep(), true);
        } else if (dep.getDep() instanceof GeneralPredefinedDependencyImpl) {
            writePredefinedDependency((GeneralPredefinedDependency) dep.getDep());
        }
        return assertOperation;
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
                assertOperation += "!";
            assertOperation += "(";
            writePredicate(clause.getPredicate());
            assertOperation += ")";
        }

        if (clause.getFirstElement() != null){
            if (clause.getFirstElement() instanceof RelationalDependencyImpl) {
                writeRelationalDependency((RelationalDependency) clause.getFirstElement(), false);
            } else if (clause.getFirstElement() instanceof GeneralTermImpl){
                GeneralTerm term = (GeneralTerm) clause.getFirstElement();
                Param param = (Param) term.getParam();
                CodegenParameter parameter = getParameter(param.getName());

                if(term.getNot() != null)
                    assertOperation += "!";
                assertOperation += "(";

                assertOperation += parameter.paramName + " != null";
                if (parameter.isArray)
                    assertOperation += " && !" + parameter.paramName + ".isEmpty()";

                if(isParamValueRelation(param)){
                    assertOperation += " && ";
                    if (param.getBooleanValue() != null){
                        if (param.getBooleanValue().equals("false"))
                            assertOperation += "!";
                        assertOperation += parameter.paramName;
                    } else if (param.getDoubleValue() != null){
                        assertOperation += parameter.paramName + param.getRelationalOp() + Double.parseDouble(param.getDoubleValue());
                    } else if (param.getStringValues().size() != 0){
                        assertOperation += "(";
                        if (parameter.isArray){
                            for(String s: param.getStringValues()) {
                                assertOperation += parameter.paramName + ".contains(" + "\"" + s + "\") || ";
                            }
                        } else {
                            for(String s: param.getStringValues()) {
                                assertOperation += parameter.paramName + ".equals(" + "\"" + s + "\") || ";
                            }
                        }
                        assertOperation = assertOperation.substring(0,assertOperation.length()-4);
                        assertOperation += ")";
                    }else if (param.getPatternString() != null){
                        //TODO assert pattern
                    }
                }
                assertOperation += ")";

            } else if (clause.getFirstElement() instanceof ArithmeticDependencyImpl){
                writeArithmeticDependency((ArithmeticDependency) clause.getFirstElement(), false);
            } else if (clause.getFirstElement() instanceof GeneralPredefinedDependencyImpl){
                writePredefinedDependency((GeneralPredefinedDependency) clause.getFirstElement());
            }

        }
    }

    private void writePredicate(GeneralPredicate predicate){
        writeClause(predicate.getFirstClause());

        if (predicate.getClauseContinuation() != null) {
            if (predicate.getClauseContinuation().getLogicalOp().equals("AND")){
                assertOperation += " && ";
            }else if (predicate.getClauseContinuation().getLogicalOp().equals("OR")){
                assertOperation += " || ";
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
        assertOperation += "(!";
        writePredicate(dep.getCondition());
        assertOperation += " || ";
        writePredicate(dep.getConsequence());
        assertOperation += ")";

    }

    /**
     * Write a relational dependency (e.g. p1<p2) in Java syntax
     * @param dep
     * @param alone
     * @return
     */
    private void writeRelationalDependency(RelationalDependency dep, boolean alone){
        if(alone)
            assertOperation += "(!(" + writeParamName(dep.getParam1().getName()) + " != null && " + writeParamName(dep.getParam2().getName()) + " != null) || (" +
                    writeParamName(dep.getParam1().getName()) + dep.getRelationalOp() + writeParamName(dep.getParam2().getName()) + "))";
        else assertOperation += "(" + writeParamName(dep.getParam1().getName()) + " != null && " + writeParamName(dep.getParam2().getName()) + " != null && " +
                writeParamName(dep.getParam1().getName()) + dep.getRelationalOp() + writeParamName(dep.getParam2().getName()) + ")";
    }

    /**
     * Writes arithmetic dependency (e.g. p1+p2<100) in Java syntax
     * @param dep
     * @param alone
     * @return
     */
    private void writeArithmeticDependency(ArithmeticDependency dep, boolean alone){
        assertOperation += "(";
        if (alone)
            assertOperation += "!(";
        Iterator params = IteratorExtensions.toIterable(Iterators.filter(dep.eAllContents(), Param.class)).iterator();

        while(params.hasNext()){
            Param param = (Param) params.next();
            assertOperation += writeParamName(param.getName()) + " != null && ";
        }

        if (alone) {
            assertOperation = assertOperation.substring(0,assertOperation.length()-4);
            assertOperation += ") || (";
        }

        writeOperation(dep.getOperation());
        assertOperation += dep.getRelationalOp();
        assertOperation += Double.parseDouble(dep.getResult());
        assertOperation += ")";
        if (alone)
            assertOperation += ")";
    }

    private String writeOperation(es.us.isa.idl.idl.Operation operation){
        if(operation.getOpeningParenthesis() == null){
            assertOperation += writeParamName(operation.getFirstParam().getName());
            writeOperationContinuation(operation.getOperationContinuation());
        } else {
            assertOperation += "(";
            writeOperation(operation.getOperation());
            assertOperation += ")";
            if (operation.getOperationContinuation() != null)
                writeOperationContinuation(operation.getOperationContinuation());
        }

        return assertOperation;
    }

    private void writeOperationContinuation(OperationContinuation opCont){
        assertOperation += opCont.getArithOp();
        if(opCont.getAdditionalParams() instanceof ParamImpl){
            Param param = (Param) opCont.getAdditionalParams();
            assertOperation += writeParamName(param.getName());
        } else {
            writeOperation((es.us.isa.idl.idl.Operation) opCont.getAdditionalParams());
        }

    }

    /**
     * Writes a predefined dependency (e.g ZeroOrOne(p1,p2)) as a call to a static method in Java
     * @param dep
     * @return
     */
    private void writePredefinedDependency(GeneralPredefinedDependency dep){
        if (dep.getNot() != null)
            assertOperation += "!";
        assertOperation += "DependencyUtil." + dep.getPredefDepType() + "Dependency(";

        for(GeneralPredicate depElement:dep.getPredefDepElements()){
            writePredicate(depElement);
            assertOperation += ",";
        }
        assertOperation = assertOperation.substring(0,assertOperation.length()-1);
        assertOperation += ")";

    }

}
