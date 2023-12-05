package com.example.mentorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(title = "Mentor Service REST APIs",
       description = "Mentor Service REST APIs Documentation",
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
				description = "Mentor-Service Doc",
				url = ""
				))
public class MentorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MentorServiceApplication.class, args);
	}

}
