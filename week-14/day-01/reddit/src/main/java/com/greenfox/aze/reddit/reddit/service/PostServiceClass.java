package com.greenfox.aze.reddit.reddit.service;

import com.greenfox.aze.reddit.reddit.model.Posts;
import com.greenfox.aze.reddit.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceClass {

	@Autowired
	PostRepository postRepository;

	public List<Posts> getAllPosts() {
		return postRepository.findAll();
	}


	public Posts getPostById(Long id) {
		return postRepository.findById(id).get();
	}

	public void createNewPost(Posts createdPost) {
		postRepository.save(createdPost);
	}

}
