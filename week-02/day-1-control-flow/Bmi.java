package main.controlflow;

public class Bmi {

    public static void main(String[] args){

        double massInKg = 81.2;
        double heightInM = 1.78;

        // Print the Body mass index (BMI) based on these values

        double heightSquare = heightInM * heightInM;
        double bmi = massInKg / heightSquare;

        System.out.println(bmi);
    }
}
