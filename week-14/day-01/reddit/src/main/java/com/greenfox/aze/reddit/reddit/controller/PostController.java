package com.greenfox.aze.reddit.reddit.controller;

import com.greenfox.aze.reddit.reddit.model.Posts;
import com.greenfox.aze.reddit.reddit.service.PostServiceClass;
import com.greenfox.aze.reddit.reddit.service.UserServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

	@Autowired
	PostServiceClass postServiceClass;

	@Autowired
	UserServiceClass userServiceClass;

	@PostMapping("")
	public List<Posts> postNewPost(@RequestBody Posts[] postsToCreate, @RequestHeader("username") String username) {
		for (Posts post : postsToCreate) {
			post.setOwner(username);
			postServiceClass.createNewPost(post);
		}
		return postServiceClass.getAllPosts();
	}
}
