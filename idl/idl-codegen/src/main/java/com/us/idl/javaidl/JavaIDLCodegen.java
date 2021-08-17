package com.us.idl.javaidl;

import com.google.common.collect.Iterators;
import com.google.inject.Injector;
import com.us.idl.writers.JavaAssertionWriter;
import es.us.isa.idl.IDLStandaloneSetupGenerated;
import es.us.isa.idl.idl.*;
import es.us.isa.idl.idl.impl.*;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.PathItem;
import io.swagger.v3.oas.models.servers.Server;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.openapitools.codegen.*;
import com.us.idl.CodegenDependency;
import org.openapitools.codegen.languages.JavaClientCodegen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.*;

public class JavaIDLCodegen extends JavaClientCodegen implements CodegenConfig {

  private static final Logger LOGGER = LoggerFactory.getLogger(JavaIDLCodegen.class);
  protected String apiVersion = "1.0.0";

  /**
   * Configures the type of generator.
   *
   * @return the CodegenType for this generator
   * @see org.openapitools.codegen.CodegenType
   */
  @Override
  public CodegenType getTag() {
    return CodegenType.OTHER;
  }

  /**
   * Configures a friendly name for the generator.  This will be used by the generator
   * to select the library with the -g flag.
   *
   * @return the friendly name for the generator
   */
  @Override
  public String getName() {
    return "java-idl";
  }

  /**
   * Returns human-friendly help for the generator.  Provide the consumer with help
   * tips, parameters here
   *
   * @return A string value for the help message
   */
  @Override
  public String getHelp() {
    return "Generates a java client library with IDL dependencies.";
  }

  public JavaIDLCodegen() {
    super();
    /**
     * Template Location.  This is the location which templates will be read from.  The generator
     * will use the resource stream to attempt to read the templates.
     */
    templateDir = "java-idl";
  }

  @Override
  public void processOpts() {
    super.processOpts();
    importMapping.put("DependencyUtil", invokerPackage + ".DependencyUtil");
  }

  @Override
  public void preprocessOpenAPI(OpenAPI openAPI) {
    super.preprocessOpenAPI(openAPI);

    if (openAPI.getPaths() != null){
      for (String pathname : openAPI.getPaths().keySet()) {
        boolean dependencies = false;
        PathItem path = openAPI.getPaths().get(pathname);
        if (path.readOperations() != null) {
          for(Operation operation : path.readOperations()){
            if (operation.getExtensions()!=null && operation.getExtensions().containsKey("x-dependencies")){
              supportingFiles.add(new SupportingFile("DependencyUtil.mustache", (sourceFolder + '/' + invokerPackage).replace(".", "/"), "DependencyUtil.java"));
              dependencies = true;
              break;
            }
          }
        }
        if (dependencies)
          break;
      }
    }
  }

  @Override
  public CodegenOperation fromOperation(String path, String httpMethod, Operation operation, List<Server> servers) {
    CodegenOperation op = super.fromOperation(path, httpMethod, operation, servers);

    if(operation.getExtensions() != null && operation.getExtensions().containsKey("x-dependencies")){
      List<String> dependencies =(List<String>) operation.getExtensions().get("x-dependencies");
      List<CodegenDependency> dependencyList = new ArrayList<>();
      try {
        Injector injector = new IDLStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        Resource resource = resourceSet.createResource(URI.createURI("dummy:/example.idl"));
        JavaAssertionWriter assertionWriter = new JavaAssertionWriter();
        assertionWriter.operation = op;

        for (String dep: dependencies){
          resource.load(new ByteArrayInputStream(dep.getBytes()), resourceSet.getLoadOptions());
          String assertOperation = assertionWriter.writeDependency((Dependency) resource.getContents().get(0).eContents().get(0));

          CodegenDependency dependency = new CodegenDependency();
          dependency.idlDependency = dep;
          dependency.assertOperation = assertOperation;
          dependencyList.add(dependency);
          resource.unload();
        }

        op.vendorExtensions.put("x-dependencies",dependencyList);
        op.imports.add("DependencyUtil");

      }catch (IOException e){
        LOGGER.error("Error while processing IDL dependencies for operation: " + op.operationId + ". They will not be included");
        op.vendorExtensions.remove("x-dependencies");
      }catch (IllegalArgumentException e){
        LOGGER.error("Error while processing IDL dependencies for operation: " + op.operationId + ": " + e.getMessage());
        op.vendorExtensions.remove("x-dependencies");
      }
    }

    return op;
  }

  /**
   *  Write the assertion operation for the IDL dependency
   * @param dep
   * @param operation
   * @return Assertion operation for the dependency
   */
  public String writeDependency(Dependency dep, CodegenOperation operation){
    String assertion = "";
    if(dep.getDep() instanceof ConditionalDependencyImpl) {
      assertion = writeConditionalDependency((ConditionalDependency) dep.getDep(), operation, assertion);
    }else if(dep.getDep() instanceof ArithmeticDependencyImpl){
      assertion = writeArithmeticDependency((ArithmeticDependency) dep.getDep(), true, operation, assertion);
    } else if (dep.getDep() instanceof RelationalDependencyImpl){
      assertion = writeRelationalDependency((RelationalDependency) dep.getDep(), true, operation, assertion);
    } else if (dep.getDep() instanceof GeneralPredefinedDependencyImpl) {
      assertion = writePredefinedDependency((GeneralPredefinedDependency) dep.getDep(), operation, assertion);
    }
    return assertion;
  }

  private String writeParamName(String paramName, CodegenOperation operation){
    return getParameter(paramName, operation).paramName;
  }

  private CodegenParameter getParameter(String paramName, CodegenOperation operation){
    return operation.queryParams.stream().filter(p->p.baseName.equals(paramName)).findFirst()
            .orElseThrow(() -> new IllegalArgumentException("IDL parameter \"" + paramName + "\" not found in query params for operation \"" + operation.operationId +"\""));
  }

  private boolean isParamValueRelation(Param param){
    return param.getStringValues().size() != 0 || param.getPatternString() != null || param.getBooleanValue() != null || param.getDoubleValue() != null;
  }

  private String writeClause(GeneralClause clause, CodegenOperation operation, String assertOperation){
    if (clause.getPredicate() != null){
      if (clause.getNot() != null)
        assertOperation += "!";
      assertOperation += "(";
      assertOperation = writePredicate(clause.getPredicate(), operation, assertOperation);
      assertOperation += ")";
    }

    if (clause.getFirstElement() != null){
      if (clause.getFirstElement() instanceof RelationalDependencyImpl) {
        assertOperation = writeRelationalDependency((RelationalDependency) clause.getFirstElement(), false, operation, assertOperation);
      } else if (clause.getFirstElement() instanceof GeneralTermImpl){
        GeneralTerm term = (GeneralTerm) clause.getFirstElement();
        Param param = (Param) term.getParam();
        CodegenParameter parameter = getParameter(param.getName(), operation);

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
        assertOperation = writeArithmeticDependency((ArithmeticDependency) clause.getFirstElement(), false, operation, assertOperation);
      } else if (clause.getFirstElement() instanceof GeneralPredefinedDependencyImpl){
        assertOperation = writePredefinedDependency((GeneralPredefinedDependency) clause.getFirstElement(), operation, assertOperation);
      }

    }
    return assertOperation;
  }

  private String writePredicate(GeneralPredicate predicate, CodegenOperation operation, String assertOperation){
    assertOperation = writeClause(predicate.getFirstClause(), operation, assertOperation);

    if (predicate.getClauseContinuation() != null) {
      if (predicate.getClauseContinuation().getLogicalOp().equals("AND")){
        assertOperation += " && ";
      }else if (predicate.getClauseContinuation().getLogicalOp().equals("OR")){
        assertOperation += " || ";
      }
      assertOperation = writePredicate(predicate.getClauseContinuation().getAdditionalElements(), operation, assertOperation);
    }

    return assertOperation;
  }

  /**
   * Write conditional dependency (IF condition THEN consequence) as
   * (!(condition) || (consequence)) in Java syntax
   * @param dep
   * @param operation
   * @param assertOperation
   * @return
   */
  private String writeConditionalDependency(ConditionalDependency dep, CodegenOperation operation, String assertOperation) {
    assertOperation += "(!";
    assertOperation = writePredicate(dep.getCondition(), operation, assertOperation);
    assertOperation += " || ";
    assertOperation = writePredicate(dep.getConsequence(), operation, assertOperation);
    assertOperation += ")";

    return assertOperation;
  }

  /**
   * Write a relational dependency (e.g. p1<p2) in Java syntax
   * @param dep
   * @param alone
   * @param operation
   * @param assertOperation
   * @return
   */
  private String writeRelationalDependency(RelationalDependency dep, boolean alone, CodegenOperation operation, String assertOperation){
    if(alone)
      assertOperation += "(!(" + writeParamName(dep.getParam1().getName(),operation) + " != null && " + writeParamName(dep.getParam2().getName(),operation) + " != null) || (" +
              writeParamName(dep.getParam1().getName(),operation) + dep.getRelationalOp() + writeParamName(dep.getParam2().getName(),operation) + "))";
    else assertOperation += "(" + writeParamName(dep.getParam1().getName(),operation) + " != null && " + writeParamName(dep.getParam2().getName(),operation) + " != null && " +
            writeParamName(dep.getParam1().getName(),operation) + dep.getRelationalOp() + writeParamName(dep.getParam2().getName(),operation) + ")";
    return assertOperation;
  }

  /**
   * Writes arithmetic dependency (e.g. p1+p2<100) in Java syntax
   * @param dep
   * @param alone
   * @param operation
   * @param assertOperation
   * @return
   */
  private String writeArithmeticDependency(ArithmeticDependency dep, boolean alone, CodegenOperation operation, String assertOperation){
    assertOperation += "(";
    if (alone)
      assertOperation += "!(";
    Iterator params = IteratorExtensions.toIterable(Iterators.filter(dep.eAllContents(), Param.class)).iterator();

    while(params.hasNext()){
      Param param = (Param) params.next();
      assertOperation += writeParamName(param.getName(),operation) + " != null && ";
    }

    if (alone) {
      assertOperation = assertOperation.substring(0,assertOperation.length()-4);
      assertOperation += ") || (";
    }

    assertOperation = writeOperation(dep.getOperation(), operation, assertOperation);
    assertOperation += dep.getRelationalOp();
    assertOperation += Double.parseDouble(dep.getResult());
    assertOperation += ")";
    if (alone)
      assertOperation += ")";

    return assertOperation;
  }

  private String writeOperation(es.us.isa.idl.idl.Operation operation, CodegenOperation op, String assertOperation){
    if(operation.getOpeningParenthesis() == null){
      assertOperation += writeParamName(operation.getFirstParam().getName(),op);
      assertOperation = writeOperationContinuation(operation.getOperationContinuation(), op, assertOperation);
    } else {
      assertOperation += "(";
      assertOperation = writeOperation(operation.getOperation(), op, assertOperation);
      assertOperation += ")";
      if (operation.getOperationContinuation() != null)
        assertOperation = writeOperationContinuation(operation.getOperationContinuation(), op, assertOperation);
    }

    return assertOperation;
  }

  private String writeOperationContinuation(OperationContinuation opCont, CodegenOperation operation, String assertOperation){
    assertOperation += opCont.getArithOp();
    if(opCont.getAdditionalParams() instanceof ParamImpl){
      Param param = (Param) opCont.getAdditionalParams();
      assertOperation += writeParamName(param.getName(), operation);
    } else {
      assertOperation = writeOperation((es.us.isa.idl.idl.Operation) opCont.getAdditionalParams(), operation, assertOperation);
    }

    return assertOperation;
  }

  /**
   * Writes a predefined dependency (e.g ZeroOrOne(p1,p2)) as a call to a static method in Java
   * @param dep
   * @param operation
   * @param assertOperation
   * @return
   */
  private String writePredefinedDependency(GeneralPredefinedDependency dep, CodegenOperation operation, String assertOperation){
    if (dep.getNot() != null)
      assertOperation += "!";
    assertOperation += "DependencyUtil." + dep.getPredefDepType() + "Dependency(";

    for(GeneralPredicate depElement:dep.getPredefDepElements()){
      assertOperation = writePredicate(depElement, operation, assertOperation);
      assertOperation += ",";
    }
    assertOperation = assertOperation.substring(0,assertOperation.length()-1);
    assertOperation += ")";

    return assertOperation;
  }

}