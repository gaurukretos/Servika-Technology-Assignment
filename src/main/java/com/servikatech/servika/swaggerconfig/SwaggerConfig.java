package com.servikatech.servika.swaggerconfig;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI productApiDocumentation() {
        return new OpenAPI()
                .info(new Info()
                        .title("Product API")
                        .description("RESTful API for managing products")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Servika Tech")
                                .email("dabigaurav05@gmail.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://www.apache.org/licenses/LICENSE-2.0.html")));
    }
}
