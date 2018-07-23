package ControlFlow;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Multiple this:");
		int num = scanner.nextInt();
		scanner.close();

		for (int i = 1; i <= 15; i++) {

			System.out.println(i + " x " + num + " = " + i * num);

		}

	}

}

