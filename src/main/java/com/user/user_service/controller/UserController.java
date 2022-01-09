package com.user.user_service.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.user_service.entity.User;
import com.user.user_service.entity.UserContact;
import com.user.user_service.service.UserDaoService;

@RestController
public class UserController {
	
	@Autowired
	UserDaoService userDaoService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		return userDaoService.add(user);
	}
	
	@GetMapping("/user")
	public List<User> findAll() {
		List<User> list = userDaoService.getAll();
		//List contacts = restTemplate.getForObject("http://contact-service/contact", List.class);
//		list.stream().map(u->u.getName())
//		.forEach(user -> user.setContacts(contacts));
		

		
		
		list.stream().forEach(user ->
		user.setContacts(
				restTemplate.getForObject("http://contact-service/contact/"+user.getId(), List.class))
				);
		
//		for(User u: list) {
//			u.setContacts(contacts);
//		}
		return list;
	}
	
	@GetMapping("/user/{id}")
	public User findOneuser(@PathVariable("id") int id) {
		User user = userDaoService.findOne(id);
		List forObject = restTemplate.getForObject("http://contact-service/contact/"+id, List.class);
		
		user.setContacts(forObject);
		return user;
	}

}
