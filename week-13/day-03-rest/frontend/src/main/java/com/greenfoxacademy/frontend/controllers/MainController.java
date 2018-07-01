package com.greenfoxacademy.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @GetMapping("")
    public String index() {
        return "index";
    }

    @GetMapping("doubling")
    public int doubling(@RequestParam(value = "input", required= false) Integer input) {
        Integer result = input * 2;
        return result;
    }

}
