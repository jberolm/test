package io.swagger.api.factories;

import io.swagger.api.MemApiService;
import io.swagger.api.impl.MemApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-08T18:12:46.829Z[GMT]")
public class MemApiServiceFactory {
    private final static MemApiService service = new MemApiServiceImpl();

    public static MemApiService getMemApi() {
        return service;
    }
}
