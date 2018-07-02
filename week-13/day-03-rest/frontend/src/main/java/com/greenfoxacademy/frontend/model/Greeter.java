package com.greenfoxacademy.frontend.model;

public class Greeter {

    public String nameForGreeter;
    public String titleForGreeter;
    public String welcome_message;

    public Greeter(String nameForGreeter, String titleForGreeter) {
        this.nameForGreeter = nameForGreeter;
        this.titleForGreeter = titleForGreeter;
        this.welcome_message = "Oh, hi there " + nameForGreeter + ", my dear " + titleForGreeter + "!";
    }

    public String getWelcome_message() {
        return welcome_message;
    }
}
