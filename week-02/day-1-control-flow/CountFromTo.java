package ControlFlow;

import java.util.Scanner;

public class CountFromTo {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add two numbers please:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        scanner.close();


        if(number1 > number2){
            System.out.println("The second number should be bigger");
        }
        else{

            for (int i = number1; i < number2; i++){
                System.out.println(i);
            }
        }


    }
}


// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//