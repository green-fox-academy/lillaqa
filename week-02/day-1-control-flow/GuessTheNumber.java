package ControlFlow;

import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int guessThis = 8;

        System.out.println("Guess the number:");
        int userGuess = scanner.nextInt();

        while(guessThis != userGuess){

            if(userGuess < guessThis){
                System.out.println("The stried number is lower");
                userGuess = scanner.nextInt();
            }
            else if(userGuess > guessThis){
                System.out.println("The stored number is higher");
                userGuess = scanner.nextInt();
            }
        }
        System.out.println("You found the number: " + guessThis);
        scanner.close();
    }

}


// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8
