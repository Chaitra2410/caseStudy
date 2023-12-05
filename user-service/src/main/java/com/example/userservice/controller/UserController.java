package com.example.userservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userservice.entity.User;
import com.example.userservice.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;


@RestController
@RequestMapping("api/users")
@AllArgsConstructor
@CrossOrigin
@Tag(
		name ="User Service - UserController",
		description="User Controller Exposes REST API's for User-Service")
public class UserController {
	
	private UserService userService;

	@Operation(summary = "Save the Rest API", description = "Post description")
	@ApiResponse(responseCode = "201", description = "201 - Created")
	@PostMapping("/signUp")
	public ResponseEntity<User> saveUser(@RequestBody User user){
		User savedUser = userService.saveUser(user);
		return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
	}
	
	
	@Operation(summary = "GET  Rest API", description = "Get description")
	@ApiResponse(responseCode = "200", description = "200 - OK")
    @GetMapping("/login/{userId}/{userpassword}")
    public String loginService(@PathVariable Long userId, @PathVariable String userpassword){
        return userService.loginService(userId, userpassword);
 
    }
}
