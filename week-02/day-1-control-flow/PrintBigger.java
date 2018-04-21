package ControlFlow;

import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide us two numbers to compare:");
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        scanner.close();

        if(firstNum > secondNum){
            System.out.println(firstNum + " has higher value");
        }

        else {
            System.out.println(secondNum + " has higher value");
        }

    }
}
