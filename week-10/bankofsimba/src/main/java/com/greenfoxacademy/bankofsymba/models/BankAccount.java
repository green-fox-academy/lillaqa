package com.greenfoxacademy.bankofsymba.models;

public class BankAccount {

    private String name;
    private int balance;
    private String animalType;

    public BankAccount() {
        this.name = "Simba";
        this.balance = 2000;
        this.animalType = "Lion";
    }

    public BankAccount(String name, int balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }
}
