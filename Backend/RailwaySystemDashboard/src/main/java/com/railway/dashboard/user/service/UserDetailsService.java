package com.railway.dashboard.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railway.dashboard.user.entity.UserDetails;

@Service
public class UserDetailsService {

	@Autowired
	private UserDetailsRepository userDetailsRepository;
	
	public void saveUser(UserDetails user) {
		//user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
		userDetailsRepository.save(user);
	}
	
}
