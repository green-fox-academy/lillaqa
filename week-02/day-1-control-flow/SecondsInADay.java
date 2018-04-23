package ControlFlow;

public class SecondsInADay{

    public static void main(String[] args) {

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int allSec = 24*60*60;
        int currentTime = currentSeconds + currentMinutes*60 + currentHours*3600;
        int remainingSec = allSec - currentTime;
        System.out.println(remainingSec + " second remaining from today! hurry up!");

    }

}
