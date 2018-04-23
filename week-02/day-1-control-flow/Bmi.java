package main.controlflow;

public class Bmi {

    public static void main(String[] args){

        double massInKg = 81.2;
        double heightInM = 1.78;


        double heightSquare = heightInM * heightInM;
        double bmi = massInKg / heightSquare;

        System.out.println(bmi);
    }
}
