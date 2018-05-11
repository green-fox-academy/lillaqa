package day3Inhertence.greenFoxOrg;

public class Mentor extends Person {

    String level;

    public Mentor() {
        super("Jane Doe", 32, "female");
        this.level = "intermediate";
    }

    public Mentor(String name, int age, String gender, String level) {

    }

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    public void introduce() {
        super.introduce();
        System.out.println(" " + level + " mentor.");
    }
}

