package com.example.userservice.service;

import com.example.userservice.entity.User;

public interface UserService {

	User saveUser(User user);
	
	String loginService(Long userId, String password);
	
}