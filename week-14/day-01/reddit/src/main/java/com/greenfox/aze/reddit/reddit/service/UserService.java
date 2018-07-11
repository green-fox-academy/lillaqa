package com.greenfox.aze.reddit.reddit.service;

import com.greenfox.aze.reddit.reddit.model.User;

import java.util.List;

public interface UserService {

	List<User> getAllUser();
	User getUserById(Long userId);
	User getUserByName(String username);
	void createNewUser(String username);

}
