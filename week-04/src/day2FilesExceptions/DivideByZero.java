package day2FilesExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("gimme a number please");


        try {
            int divideBy = scanner.nextInt();
            scanner.close();
            int result = 10 / divideBy;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Integers can't be divided by 0");
        } catch (InputMismatchException e) {
            System.out.println("String can't be divided, please add a number");
        }

    }
}
