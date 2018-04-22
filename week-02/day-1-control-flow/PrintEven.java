package ControlFlow;

public class PrintEven {

    public static void main(String[] args){

        int number = 1;

        while(number <= 500){
            if(number % 2 == 0){
                System.out.println(number);
            }
            number = number +1;
        }

    }
}



// Create a program that prints all the even numbers between 0 and 500