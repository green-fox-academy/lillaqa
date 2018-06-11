package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWorldWebApp {

    static AtomicLong countCalls = new AtomicLong();

    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam (name = "name", required = true) String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("countCalls", countCalls.incrementAndGet());
        return "greeting";
    }
}

/*
A%20kurva%20anyádba%20menjél%20el%20légyszi!
 */