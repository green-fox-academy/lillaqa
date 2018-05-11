package day3Inhertence.greenFoxOrg;

public class Mentor extends Person {

    String level;

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    public void introduce() {
        super.introduce();
        System.out.println(level + " mentor.");
    }
}


/*
* fields:
level: the level of the mentor (junior / intermediate / senior)
methods:

introduce(): "Hi, I'm name, a age year old gender level mentor."
The Mentor class has the following constructors:

Mentor(name, age, gender, level)
Mentor(): sets name to Jane Doe, age to 30, gender to female, level to intermediate*/