package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.model.Doubling;
import com.greenfoxacademy.frontend.model.Greeter;
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

    @GetMapping("greeter")
    public Greeter greeting(@RequestParam(value = "name") String nameForGreeter, @RequestParam(value = "title") String titleForGreeter) {
        Greeter greeting = new Greeter(nameForGreeter, titleForGreeter);
        return greeting;
    }
}
