package com.example.coursemicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(title = "Course Service REST APIs",
       description = "Course Service REST APIs Documentation",
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
				description = "Course Service Doc",
				url = ""
				))
public class CourseMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseMicroserviceApplication.class, args);
	}

}
