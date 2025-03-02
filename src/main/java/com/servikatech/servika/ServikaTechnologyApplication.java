package com.servikatech.servika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Servika Tech Assignment API", version = "3.0", description = "Servika Tech API Server"))

public class ServikaTechnologyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServikaTechnologyApplication.class, args);
	}

}
