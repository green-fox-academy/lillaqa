package com.greenfoxacademy.bankofsymba.controllers;

import com.greenfoxacademy.bankofsymba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @RequestMapping(value = "/show")
    public BankAccount show() {
        return new BankAccount();
    }
}
