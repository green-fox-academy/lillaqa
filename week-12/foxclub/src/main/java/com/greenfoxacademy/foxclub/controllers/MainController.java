package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.services.FoxServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    FoxServices foxServices;

    @RequestMapping(method = RequestMethod.GET, value = "/info")
    public String index(@RequestParam("name") String name, Model model) {
        foxServices.createFox(name);
        model.addAttribute("name", foxServices.getFox(name));
        model.addAttribute("drink", foxServices.getFox(name).getDrink());
        model.addAttribute("food", foxServices.getFox(name).getFood());
        return "index";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public String loggedIn(@ModelAttribute("name") String name) {

        return "redirect:/info/?name="+name;
    }
    // todo: return "redirect:/?name="+name;

    @RequestMapping(method = RequestMethod.GET, value = "/nutritionStore")
    public String nutrition(@RequestParam("name") String name, Model model) {
        return "nutritionStore";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/trickCenter")
    public String tricks(@RequestParam("name") String name, Model model) {
        return "trickCenter";
    }
}

/*
TODO: GET method should render the login.html, POST method should receive name value as @RequestParam like this, then it should redirect to the main page / with the value of the @RequestParam
 */