package day03stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciseTen {

    public static void main(String[] args) {

        List<Fox> foxes = Arrays.asList(
                new Fox("Vuk", "Red fox", "red"),
                new Fox("Jeges", "Arctic fox", "white"),
                new Fox("Zöldróka","Red fox", "green"),
                new Fox("Homokszem", "Fennec fox", "light brown"),
                new Fox("Ezüstke", "Silver fox", "silver"),
                new Fox("The fantastic Mr. Fox", "Red fox", "red"),
                new Fox("Mr. Green", "Pallida fox", "green"),
                new Fox("Fakó", "Pallida fox", "pale red")

        );

        foxes.stream().filter(c -> c.getColor().equals("green")).forEach(c -> System.out.println("Zöld róka: " + c.getName()));

        foxes.stream().filter(c -> c.getColor().equals("green") && c.getType().equals("Pallida fox")).forEach(c -> System.out.println("Zöld és pallida: " + c.getName()));

    }
}
