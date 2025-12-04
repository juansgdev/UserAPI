package com.juca.usersapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juca.usersapi.entity.User;
import com.juca.usersapi.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	private UserService userService;
	
	public UserController (UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping
	List<User> list () {
		return userService.getUsers();
	}
	
	@PostMapping
	List<User> create (@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@PutMapping
	List<User> update (@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@DeleteMapping("{id}")
	List<User> delete (@PathVariable("id") Long id) {
		return userService.deleteUser(id);
	}
}
