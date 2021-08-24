package com.us.idl.javaidl;

import com.us.idl.CodegenDependency;
import io.swagger.parser.OpenAPIParser;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.parser.core.models.ParseOptions;
import org.junit.Assert;
import org.junit.Test;
import org.openapitools.codegen.ClientOptInput;
import org.openapitools.codegen.CodegenOperation;
import org.openapitools.codegen.DefaultGenerator;
import org.openapitools.codegen.config.CodegenConfigurator;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/***
 * This test allows you to easily launch your code generation software under a debugger.
 * Then run this test under debug mode.  You will be able to step through your java code 
 * and then see the results in the out directory. 
 *
 * To experiment with debugging your code generator:
 * 1) Set a break point in JavaIdlGenerator.java in the postProcessOperationsWithModels() method.
 * 2) To launch this test in Eclipse: right-click | Debug As | JUnit Test
 *
 */
public class JavaMSF4JServerIDLCodegenTest {

  // use this test to launch you code generator in the debugger.
  // this allows you to easily set break points in MyclientcodegenGenerator.
  @Test
  public void launchCodeGenerator() {
    // to understand how the 'openapi-generator-cli' module is using 'CodegenConfigurator', have a look at the 'Generate' class:
    // https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator-cli/src/main/java/org/openapitools/codegen/cmd/Generate.java 
    final CodegenConfigurator configurator = new CodegenConfigurator()
              .setGeneratorName("msf4j-server-idl") // use this codegen library
              .setInputSpec("youtubeIDL.yaml") // sample OpenAPI file
              // .setInputSpec("https://raw.githubusercontent.com/openapitools/openapi-generator/master/modules/openapi-generator/src/test/resources/2_0/petstore.yaml") // or from the server
              .setOutputDir("out/msf4j-server-idl"); // output directory

    final ClientOptInput clientOptInput = configurator.toClientOptInput();
    DefaultGenerator generator = new DefaultGenerator();
    generator.opts(clientOptInput).generate();
  }

  @Test
  public void insertDependencies(){
    OpenAPI openAPI = new OpenAPIParser().readLocation("youtubeIDL.yaml", null, new ParseOptions()).getOpenAPI();
    JavaMSF4JServerIDLCodegen codegen = new JavaMSF4JServerIDLCodegen();

    String path = "/youtube/v3/commentThreads";
    Operation operation = openAPI.getPaths().get(path).readOperations().get(0);
    CodegenOperation op = codegen.fromOperation(path,"get",operation,openAPI.getServers());

    List<CodegenDependency> dependencies = (List<CodegenDependency>) op.vendorExtensions.get("x-dependencies");
    Assert.assertEquals(dependencies.size(),6);

    for (CodegenDependency dep: dependencies){
      Assert.assertNotNull(dep.assertOperation);
    }
  }

  @Test
  public void testErrorsInIDL(){
    OpenAPI openAPI = new OpenAPIParser().readLocation("youtubeIDLerrors.yaml", null, new ParseOptions()).getOpenAPI();
    JavaMSF4JServerIDLCodegen codegen = new JavaMSF4JServerIDLCodegen();

    String path = "/youtube/v3/commentThreads";
    Operation operation = openAPI.getPaths().get(path).readOperations().get(0);
    CodegenOperation op = codegen.fromOperation(path,"get",operation,openAPI.getServers());

    Assert.assertNull(op.vendorExtensions.get("x-dependencies"));
  }

  @Test
  public void updatedSupportingFiles(){
    OpenAPI openAPI = new OpenAPIParser().readLocation("youtubeIDL.yaml", null, new ParseOptions()).getOpenAPI();
    JavaMSF4JServerIDLCodegen codegen = new JavaMSF4JServerIDLCodegen();

    codegen.preprocessOpenAPI(openAPI);

    Assert.assertTrue(codegen.supportingFiles().stream().anyMatch(f -> f.getDestinationFilename().equals("DependencyUtil.java")));
  }

  @Test
  public void testGeneratedFiles() throws Exception{
    File output = Files.createTempDirectory("test").toFile();

    final CodegenConfigurator configurator = new CodegenConfigurator()
            .setGeneratorName("msf4j-server-idl") // use this codegen library
            .setInputSpec("youtubeIDL.yaml") // sample OpenAPI file
            .setOutputDir(output.getAbsolutePath().replace("\\", "/")); // output directory

    final ClientOptInput clientOptInput = configurator.toClientOptInput();
    DefaultGenerator generator = new DefaultGenerator();
    List<File> files = generator.opts(clientOptInput).generate();

    Assert.assertEquals(196, files.size());

    Path path = output.toPath().resolve("src/gen/java/org/openapitools/api/DependencyUtil.java");
    Assert.assertTrue("File '" + path.toAbsolutePath().toString() + "' was not found in the list of generated files", files.contains(path.toFile()));
  }
}