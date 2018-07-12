package com.greenfox.aze.reddit.reddit.service;

import com.greenfox.aze.reddit.reddit.model.User;
import com.greenfox.aze.reddit.reddit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceClass {

	@Autowired
	UserRepository userRepository;

	public List<User> getAllUser() {
		return (List<User>) userRepository.findAll();
	}

	public User getUserById(Long userId) {
		return userRepository.findById(userId).get();
	}

	public User getUserByName(String username) {
		return userRepository.findByUsername(username);
	}

	public void createUser(String username) {
		User newUser = new User(username);
		userRepository.save(newUser);
	}

}
