package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class FoxServices {

    protected HashMap<String, Fox> foxDb;
    protected ArrayList<String> tricks=new ArrayList<>();
    protected ArrayList<String> drinks=new ArrayList<>();
    protected ArrayList<String> foods=new ArrayList<>();

    public void FoxService(){
        this.foxDb = new HashMap<>();
        this.tricks.add("Write HTML");
        this.tricks.add("Code Java");
        this.tricks.add("Play CSS");
        this.drinks.add("cola");
        this.drinks.add("wine");
        this.drinks.add("cold water");
        this.foods.add("pizza");
        this.foods.add("cheese");
        this.foods.add("salad");
    }

    public void createFox(String name) {
        if (!foxDb.containsKey(name)) {
            foxDb.put(name, new Fox(name));
        }
    }

    public Fox getFox(String name) {
        return foxDb.get(name);
    }

}
