package ControlFlow;

import java.util.Scanner;

public class PartyIndicator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many girls are coming?");
        int girls = scanner.nextInt();
        System.out.println("How many boys are coming?");
        int boys = scanner.nextInt();
        scanner.close();

        int allParticipant = boys + girls;


        if((girls == boys) && (allParticipant > 20)) {
            System.out.println("The party is exellent!");
        }
        else if((girls != boys) && (allParticipant > 20)) {
            System.out.println("Quite cool party!");
        }
        else if(allParticipant < 20) {
            System.out.println("Average party...");
        }
        else if(girls == 0) {
            System.out.println("Sausage party");
        }

    }
}
