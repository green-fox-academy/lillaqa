package com.greenfoxacademy.bankofsymba.controllers;

import com.greenfoxacademy.bankofsymba.models.BankAccount;
import com.greenfoxacademy.bankofsymba.services.BankAccountService;
import com.greenfoxacademy.bankofsymba.services.BankService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @RequestMapping(value = "/show")
    public BankAccount show() {
        return new BankAccount();
    }


}
