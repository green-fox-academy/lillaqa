package com.greenfoxacademy.foxclub.models;

import java.util.ArrayList;

public class Fox {

    protected String name;
    protected String food;
    protected String drink;
    protected ArrayList<String> tricks;

    public Fox(String name) {
        this.name = name;
        this.food = "salad";
        this.drink = "water";
        this.tricks = new ArrayList<>();
    }

    public Fox() {
    }

    public boolean knowsATrick() {
        boolean knowsTricks;
        if(tricks.size() == 0) {
            knowsTricks = false;
        } else {
            knowsTricks = true;
        }
        return knowsTricks;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }
}
