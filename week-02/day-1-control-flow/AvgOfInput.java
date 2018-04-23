package ControlFlow;

import java.util.Scanner;


public class AvgOfInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numbers = 5;
        int sum = 0;

        for (int i = 0; i < numbers; i++) {
            System.out.println("Number " + (i+1) + " :");
            sum += scanner.nextInt();
        }
        scanner.close();

        int avg = sum / numbers;

        System.out.println("The sum is: " + sum + " , the average is: " + avg);
    }
}
