package day1ObjectOriented.preClassTask.animal;

public class AnimalTestIt {

    public static void main(String[] args) {

        Animal testA = new Animal("Tesztecske", "kecske");
        testA.eat();
        testA.drink();
        testA.play();
        System.out.println(testA.hunger);
        System.out.println(testA.thirst);

    }
}
