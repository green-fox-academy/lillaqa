package day3Inhertence.greenFoxOrg;

public class Main {

    public static void main(String[] args) {

        Person lilla = new Person("Lilla", 32, "female");

        lilla.introduce();

        Student rego = new Student("Regő", 5, "male", "Waldorf Ovi");
        rego.introduce();

        Mentor testingLady = new Mentor();
        testingLady.introduce();

        Student smileFace = new Student();
        smileFace.introduce();
    }
}
