package com.project.springapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.springapp.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserName(String username);
	
}
