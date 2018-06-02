package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    @ResponseBody
    public String getHello() {
        return new String("Szia világ!");
    }
}
