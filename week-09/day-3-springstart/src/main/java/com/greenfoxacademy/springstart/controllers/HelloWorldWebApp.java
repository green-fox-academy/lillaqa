package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

import static com.greenfoxacademy.springstart.controllers.WebGreeting.hellos;
import static com.greenfoxacademy.springstart.controllers.WebGreeting.random;

@Controller
public class HelloWorldWebApp {

    static AtomicLong countCalls = new AtomicLong();


    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam (name = "name", required = true) String name, Model model) {
        model.addAttribute("name", name);
        String hello = WebGreeting.hellos[random(1, 50)];
        String color = WebGreeting.colors[random(1, 143)];
        model.addAttribute("hello", hello);
        model.addAttribute("countCalls", countCalls.incrementAndGet());
        model.addAttribute("color", color);
        model.addAttribute("fontsize", random(10, 120));
        return "greeting";
    }


}

