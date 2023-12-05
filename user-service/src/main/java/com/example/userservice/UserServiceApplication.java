package com.example.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(title = "User Service REST APIs",
       description = "User Service REST APIs Documentation",
       version = "v1.0",
contact = @Contact(
		name = "Chaitra",
		email = "",
		url = "https://www.w3schools.com"
	), license = @License(
			name = "Apache 2.0",
			url = ""
			)),
externalDocs = @ExternalDocumentation(
				description = "User Service Doc",
				url = ""
				))
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
