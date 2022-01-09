package com.user.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.user_service.entity.User;
import com.user.user_service.entity.UserContact;

public interface UserRepository extends JpaRepository<User, Integer>{
	public User findById(int id);
}
