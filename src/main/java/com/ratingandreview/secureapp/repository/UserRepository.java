package com.ratingandreview.secureapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ratingandreview.secureapp.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
