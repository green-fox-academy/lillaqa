package com.greenfox.aze.reddit.reddit.repository;

import com.greenfox.aze.reddit.reddit.model.Posts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Posts, Long> {

	Posts findById();

	List<Posts> findAll();

}
