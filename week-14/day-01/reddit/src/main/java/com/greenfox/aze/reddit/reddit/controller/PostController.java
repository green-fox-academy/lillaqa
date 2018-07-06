package com.greenfox.aze.reddit.reddit.controller;

import com.greenfox.aze.reddit.reddit.model.Posts;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @PostMapping("")
    public Posts createPost() {
        return new Posts();
    }
}
