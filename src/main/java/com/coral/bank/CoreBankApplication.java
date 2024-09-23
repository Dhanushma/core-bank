package com.coral.bank;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info =
@Info(
		title = "Core Bank Microservices",
		description = "Core Bank API Documentation",
		version = "v1"
))
public class CoreBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreBankApplication.class, args);
	}

}
