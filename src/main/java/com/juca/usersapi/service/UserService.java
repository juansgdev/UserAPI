package com.juca.usersapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juca.usersapi.entity.User;
import com.juca.usersapi.repository.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<User> getUsers () {
		return userRepository.findAll();
	}
	
	public List<User> createUser (User user) {
		userRepository.save(user);
		return getUsers();
	}
	
	public List<User> updateUser (User user) {
		userRepository.save(user);
		return getUsers();
	}
	
	public List<User> deleteUser (Long id) {
		userRepository.deleteById(id);
		return getUsers();
	}
}
