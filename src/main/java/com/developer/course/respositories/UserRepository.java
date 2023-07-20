package com.developer.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developer.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
