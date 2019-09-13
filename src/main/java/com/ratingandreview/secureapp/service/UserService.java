package com.ratingandreview.secureapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratingandreview.secureapp.DTO.UserDTO;
import com.ratingandreview.secureapp.models.RatingAndReview;
import com.ratingandreview.secureapp.models.User;
import com.ratingandreview.secureapp.repository.UserRepository;

@Service
public class UserService implements IUserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(UserDTO userDto) {
		
		User user = new User();
		user.setUsername(userDto.getUsername());
		user.setAddress(userDto.getAddress());
		user.setDob(userDto.getDob());
		user.setEmail(userDto.getEmail());
		user.setEnabled(false);
		user.setGender(userDto.getGender());
		user.setMobile(userDto.getMobile());
		
		user.setRatingAndReview(null);
		System.out.println(user);
		return userRepository.save(user);
	}
	
	
}
