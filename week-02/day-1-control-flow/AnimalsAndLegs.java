package main.controlflow;

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args){

        Scanner scannerChick = new Scanner(System.in);
        Scanner scannerPig = new Scanner(System.in);

        System.out.println("Please enter the number of chickens:");
        int chickenCount = scannerChick.nextInt();

        System.out.println("Please enter the number of pigs:");
        int pigCount = scannerPig.nextInt();
        scannerPig.close();

        int legsCount = chickenCount * 2 + pigCount * 4;

        System.out.println("The total number of legs: " + legsCount);
    }
}

// Write a program that asks for two integers
// The first represents the number of chickens the farmer has
// The second represents the number of pigs owned by the farmer
// It should print how many legs all the animals have