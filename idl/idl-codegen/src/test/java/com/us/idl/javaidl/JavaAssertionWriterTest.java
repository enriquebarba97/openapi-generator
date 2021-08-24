package com.us.idl.javaidl;

import com.us.idl.CodegenDependency;
import com.us.idl.writers.JavaAssertionWriter;
import io.swagger.parser.OpenAPIParser;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.parser.core.models.ParseOptions;
import org.junit.Assert;
import org.junit.Test;
import org.openapitools.codegen.CodegenOperation;
import org.openapitools.codegen.languages.JavaClientCodegen;

import java.util.ArrayList;
import java.util.List;

public class JavaAssertionWriterTest {

    @Test
    public void generateAssertions(){
        OpenAPI openAPI = new OpenAPIParser().readLocation("example.yaml", null, new ParseOptions()).getOpenAPI();
        JavaIDLCodegen codegen = new JavaIDLCodegen();

        String path = "/example1/singular";
        Operation operation = openAPI.getPaths().get(path).readOperations().get(0);
        CodegenOperation op = codegen.fromOperation(path,"get",operation,openAPI.getServers());

        List<CodegenDependency> dependencies = (List<CodegenDependency>) op.vendorExtensions.get("x-dependencies");

        for (CodegenDependency dep: dependencies){
            Assert.assertNotNull(dep.assertOperation);
            System.out.println("Dependency: " + dep.idlDependency + "\t Assertion: " + dep.assertOperation);
        }
    }
}
