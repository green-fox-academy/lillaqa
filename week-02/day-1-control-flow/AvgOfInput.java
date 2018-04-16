package main.controlflow;

import java.util.Scanner;


public class AvgOfInput {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            System.out.println("Number " + (i+1) + " :");
            array[i] = scanner.nextInt();

            sum +=array[i];
        }

        int avg = sum / (array.length);

        System.out.println("The sum is: " + sum + " , the average is: " + avg);
    }
}
