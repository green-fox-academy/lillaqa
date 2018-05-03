package day1ObjectOriented.preClassTask.animal;

public class Animal {

    String animalName;
    String animalType;
    int thirst;
    int hunger;

    public Animal(String animalName, String animalType) {
        this.animalName = animalName;
        this.animalType = animalType;
        thirst = 50;
        hunger = 50;

    }

    void eat() {
        hunger++;
    }

    void drink() {
        thirst++;
    }

    void play() {
        hunger++;
        thirst++;
    }
}
