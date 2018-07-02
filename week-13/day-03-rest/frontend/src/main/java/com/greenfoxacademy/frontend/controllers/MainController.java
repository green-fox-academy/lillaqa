package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.model.Doubling;
import com.greenfoxacademy.frontend.model.ErrorMessage;
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
    public Doubling doubling(@RequestParam(value = "input", required= true) Integer input) {
        Doubling doubling = new Doubling(input);
        return doubling;
    }
}
