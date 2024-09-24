package com.devjola.springboot.todoapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("roman");
		boolean isValidPassword = password.equalsIgnoreCase("123456");
		
		return isValidUserName && isValidPassword;
		
	}
	
}
