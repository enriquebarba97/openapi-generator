package com.us.idl.writers;

import es.us.isa.idl.idl.Dependency;
import es.us.isa.idl.idl.GeneralClause;
import org.openapitools.codegen.CodegenOperation;

public interface AssertionWriter {

    public String assertOperation = "";
    public CodegenOperation operation = null;

    String writeDependency(Dependency dep);

}
