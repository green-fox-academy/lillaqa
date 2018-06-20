package com.greenfoxacademy.foxclub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public String loggedIn() {
        return "index";
    }
}

/*
create 2 /login endpoint (GET and POST)
GET method should render the login.html
POST method should receive name value as @RequestParam like this, then it should redirect to the main page / with the value of the @RequestParam
 */