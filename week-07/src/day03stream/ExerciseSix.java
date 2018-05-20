package day03stream;

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseSix {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

        System.out.println(cities.stream().filter(c -> cities.toString().startsWith("A") && cities.toString().endsWith("I")));

    }
}
