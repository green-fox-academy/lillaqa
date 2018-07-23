package ControlFlow;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int guessThis = 8;

		System.out.println("Guess the number:");
		int userGuess = scanner.nextInt();

		while (guessThis != userGuess) {

			if (userGuess < guessThis) {
				System.out.println("The stried number is lower");
				userGuess = scanner.nextInt();
			} else if (userGuess > guessThis) {
				System.out.println("The stored number is higher");
				userGuess = scanner.nextInt();
			}
		}
		System.out.println("You found the number: " + guessThis);
		scanner.close();
	}

}

