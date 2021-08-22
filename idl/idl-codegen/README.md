# OpenAPI Generator with IDL dependencies

## Overview
This project contains a series of extension classes for some of the Java and Python generators in OpenAPI Generator. This extensions generates assertions for inter-parameter dependencies in an operation, returning error responses when this dependencies are not satisfied.

In case you are not familiar with the concept, an inter-parameter dependency is when the presence or value of one or more parameters in an API request forces other parameters to be present or have a specific value. For example, we could have two optional parameters p1 and p2, but the presence of p1 in the request forces p2 to also be included. If not, APIs usually return a 400 Bad Request response.

Currently, the expression of these dependencies is handled using the Inter-parameter Dependency Language (IDL). More information on IDL and the current implementation of this feature for OpenAPI generator can be found in the following links:

- IDL repository, including [examples of IDL dependencies](https://github.com/isa-group/IDL/tree/master/es.us.isa.interparamdep/resources/expressiveness_evaluation?rgh-link-date=2021-02-16T09%3A15%3A27Z): [isa-group/IDL](https://github.com/isa-group/IDL)
- [Research paper on IDL](https://www.researchgate.net/publication/348280988_Specification_and_Automated_Analysis_of_Inter-Parameter_Dependencies_in_Web_APIs)
- [Issue in the OpenAPI Generator repository](https://github.com/OpenAPITools/openapi-generator/issues/8722), including examples and implementation details.
- [Pull request of the feature for the Java client libraries and servers](https://github.com/OpenAPITools/openapi-generator/pull/10131) supported in this extension

Check out [OpenAPI-Spec](https://github.com/OAI/OpenAPI-Specification) for additional information about the OpenAPI project, including additional libraries with support for other languages and more. 

## How do I use this?
First, you must compile the project into a jar package. This can be done using the following command in the project folder (with maven installed)
```
mvn package
```

A single jar file will be produced in `target`. You can now use that with [OpenAPI Generator](https://openapi-generator.tech):

For mac/linux:
```
java -cp /path/to/openapi-generator-cli.jar:/path/to/idl-codegen-openapi-generator-1.0.0.jar org.openapitools.codegen.OpenAPIGenerator generate -g java-idl -i /path/to/openapi.yaml -o ./test
```
(Do not forget to replace the values `/path/to/openapi-generator-cli.jar`, `/path/to/idl-codegen-openapi-generator-1.0.0.jar` and `/path/to/openapi.yaml` in the previous command)

For Windows users, you will need to use `;` instead of `:` in the classpath, e.g.
```
java -cp /path/to/openapi-generator-cli.jar;/path/to/your.jar org.openapitools.codegen.OpenAPIGenerator generate -g java-idl -i /path/to/openapi.yaml -o ./test
```

Now the IDL generators are available to the client generator.

The supported generators are the following:

- Java Client `-g java-idl --library=libraryname`. The supported libraries are:
  - google-api-client
  - jersey2
  - native
  - okhttp-gson
  - resteasy
  - resttemplate
  - webclient
- Spring Server `-g spring-idl`
- MSF4J Server `-g msf4j-server-idl`
- Python FastAPI Server `-g python-fastapi-idl`
