package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class Controller {
    private String name;

    @RequestMapping(method = RequestMethod.GET, value="/greetings")
    //azért emelte ki márk a getet, mert a request mindenre működik
    public ArrayList<String> getHellos() {
        return new ArrayList<>(
                Arrays.asList(
                        "bonjour",
                        "holá",
                        "szia",
                        "hello"
                )
        );
    }

}
