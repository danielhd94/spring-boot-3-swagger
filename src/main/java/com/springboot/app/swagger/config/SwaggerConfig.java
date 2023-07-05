package com.springboot.app.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {
	
	private static final String API_TITLE = "Spring Boot 3 API -------";
    private static final String API_DESCRIPTION = "Sample app Spring Boot 3 with Swagger";
    private static final String TERMS_OF_SERVICE_URL = "http://swagger.io/terms/";
    private static final String LICENSE_NAME = "Apache 2.0";
    private static final String LICENSE_URL = "http://springdoc.org";
    private static final String API_VERSION = "0.17";
    
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title(API_TITLE)
                        .version(API_VERSION)
                        .description(API_DESCRIPTION)
                        .termsOfService(TERMS_OF_SERVICE_URL)
                        .license(new License().name(LICENSE_NAME).url(LICENSE_URL)));
    }
}
