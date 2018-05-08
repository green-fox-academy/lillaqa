package day1ObjectOriented.preClassTask.petrolStation;

public class Main  {

    public static void main(String[] args) {

        Station bestStation = new Station();
        
        Cars car1 = new Cars();
        car1.gasAmount = 25;
        Cars car2 = new Cars();

        bestStation.refill(car2);
        System.out.println(car2.gasAmount);

        bestStation.refill(car1);
        System.out.println(car1.gasAmount);

    }
}
