package day03stream;

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseThree {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

        // TODO Write a Stream Expression to get the squared value of the positive numbers from the following array:

        numbers.stream().filter(n -> n > 0).map(n -> n * n).forEach(System.out::println);
    }
}
