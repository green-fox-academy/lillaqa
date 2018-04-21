package ControlFlow;

import java.util.Scanner;

public class HelloTasks {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //HelloMe task
        System.out.println("Hello, Lilla!");

        //HelloOthers task
        System.out.println("Hello, Laura!");
        System.out.println("Hello, Klára!");
        System.out.println("Hello, Ivett!");

        //HelloUser task
        System.out.println("What is your user name?");
        String userName = scanner.nextLine();
        scanner.close();

        System.out.println("Hello, " + userName + "!");


    }
}
