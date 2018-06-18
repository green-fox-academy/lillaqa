package com.greenfoxacademy.springstart.services;

import com.greenfoxacademy.springstart.models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BankAccountService {

    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public void add(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public ArrayList<BankAccount> getAllAccount() {
        return bankAccounts;
    }

    public void createLion() {
        bankAccounts.add(new BankAccount("Simba", 2000.0, "Lion"));
        bankAccounts.add(new BankAccount("Nala", 1520.0, "Lion"));
    }

}
