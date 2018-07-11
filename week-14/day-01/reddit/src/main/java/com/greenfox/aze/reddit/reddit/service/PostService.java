package com.greenfox.aze.reddit.reddit.service;

import com.greenfox.aze.reddit.reddit.model.Posts;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PostService {


	List<Posts> getAllPosts();
	Posts getPostsById(Long id);
	void createNewPosts(Posts createdPost);


}
