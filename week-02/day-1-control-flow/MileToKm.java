package ControlFlow;

import java.util.Scanner;

public class MileToKm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("The distance you travelled so far in Km:");
        int km = scanner.nextInt();
        scanner.close();

        double miles = km * 0.62;
        System.out.println("the distance in miles: " + miles);

    }
}

