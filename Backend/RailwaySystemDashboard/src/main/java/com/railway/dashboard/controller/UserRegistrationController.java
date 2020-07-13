package com.railway.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.railway.dashboard.user.entity.UserDetails;
import com.railway.dashboard.user.service.UserDetailsService;

@RestController
@RequestMapping("/api")
public class UserRegistrationController {

	@Autowired
	UserDetailsService userDetails;
	
	@PostMapping("/registerUser")
	public void registerUser(@RequestBody UserDetails user) {
		userDetails.saveUser(user);
	}
}
