package com.us.idl.pythonidl;

import com.google.common.collect.Iterators;
import com.google.inject.Injector;
import com.us.idl.CodegenDependency;
import com.us.idl.writers.AssertionWriter;
import com.us.idl.writers.PythonAssertionWriter;
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
import org.openapitools.codegen.languages.PythonFastAPIServerCodegen;
import org.openapitools.codegen.languages.PythonFlaskConnexionServerCodegen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PythonFastApiIDLCodegen extends PythonFastAPIServerCodegen implements CodegenConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(PythonFastApiIDLCodegen.class);
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
        return "python-fastapi-idl";
    }

    /**
     * Returns human-friendly help for the generator.  Provide the consumer with help
     * tips, parameters here
     *
     * @return A string value for the help message
     */
    @Override
    public String getHelp() {
        return "Generates a Flask server stub with IDL dependencies.";
    }

    public PythonFastApiIDLCodegen() {
        super();
        /**
         * Template Location.  This is the location which templates will be read from.  The generator
         * will use the resource stream to attempt to read the templates.
         */
        templateDir = "fastapi-idl";
    }

    @Override
    public void processOpts() {
        super.processOpts();
        importMapping.put("DependencyUtil", "from " + this.packageName + ".dependency_util import *");
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
                            supportingFiles.add(new SupportingFile("dependency_util.mustache", "src" + File.separator + this.packageName.replace('.', File.separatorChar), "dependency_util.py"));
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
                AssertionWriter assertionWriter = new PythonAssertionWriter(op);

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
            }catch (IllegalArgumentException | NullPointerException e){
                LOGGER.error("Error while processing IDL dependencies for operation: " + op.operationId + ". Check the syntax: " + e.getMessage());
                op.vendorExtensions.remove("x-dependencies");
            }
        }

        return op;
    }
}
