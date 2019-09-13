package com.ratingandreview.secureapp.service;

import org.springframework.stereotype.Service;

import com.ratingandreview.secureapp.DTO.UserDTO;
import com.ratingandreview.secureapp.models.User;

@Service
public interface IUserService {
	
	public User saveUser(UserDTO user);
	
}
