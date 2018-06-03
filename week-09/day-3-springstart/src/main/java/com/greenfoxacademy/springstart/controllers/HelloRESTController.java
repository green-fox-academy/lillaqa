package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
    Greetings hello = new Greetings(1, "Hello, World!");

    @RequestMapping(value = "/greetings")
    public Greetings greetings() {
        hello.getId();
        hello.getContent();
        return hello;
    }
}
