package com.user.user_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.user_service.entity.User;
import com.user.user_service.entity.UserContact;
import com.user.user_service.repository.UserRepository;

@Service
public class UserDaoService {

	@Autowired
	UserRepository userRepository;
	
	public User add(User user) {
		return userRepository.save(user);
	}
	
	public List<User> getAll() {
		return userRepository.findAll();
	}
	
	public User findOne(int id) {
		return userRepository.findById(id);
	}
}
