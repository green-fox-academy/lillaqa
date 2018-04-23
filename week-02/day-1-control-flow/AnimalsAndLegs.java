package ControlFlow;

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of chickens:");
        int chickenCount = scanner.nextInt();

        System.out.println("Please enter the number of pigs:");
        int pigCount = scanner.nextInt();
        scanner.close();

        int legsCount = chickenCount * 2 + pigCount * 4;

        System.out.println("The total number of legs: " + legsCount);
    }
}
