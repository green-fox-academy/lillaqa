package com.greenfox.aze.reddit.reddit.repository;

import com.greenfox.aze.reddit.reddit.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByUsername(String username);
}
