package com.greenfoxacademy.bankofsymba.services;

import com.greenfoxacademy.bankofsymba.models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BankAccountService {

    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public ArrayList<BankAccount> getAllBankAccount() {
        return bankAccounts;
    }

    public void createSimba() {
        bankAccounts.add(new BankAccount());
    }

    public void createZebra() {
        bankAccounts.add(new BankAccount("Zebra", 2000, "zebra"));
    }
}
