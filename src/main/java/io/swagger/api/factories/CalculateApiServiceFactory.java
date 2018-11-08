package io.swagger.api.factories;

import io.swagger.api.CalculateApiService;
import io.swagger.api.impl.CalculateApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-08T18:12:46.829Z[GMT]")
public class CalculateApiServiceFactory {
    private final static CalculateApiService service = new CalculateApiServiceImpl();

    public static CalculateApiService getCalculateApi() {
        return service;
    }
}
