package com.example.userservice.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.userservice.entity.User;
import com.example.userservice.repository.UserRepository;
import com.example.userservice.service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {	
		return userRepository.save(user);
	}

	public String loginService(Long userId, String password) {
		 
        if (userRepository.existsById(userId)) {
         
            User user = userRepository.findById(userId).get();
            String userpassword = user.getPassword();
            if (password.equals(userpassword)) {
                return "success";
            } 
        }
        return null;
    }

}
