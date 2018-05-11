package day3Inhertence.greenFoxOrg;

public class Student extends Person {

    String previousOrganization;
    int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }


    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void introduce() {
        super.introduce();
        System.out.println(" from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    void skipDays(int numberofDays) {
        skippedDays = skippedDays + numberofDays;
    }
}
