package day03stream;

import java.util.List;
import java.util.stream.Collectors;

public class ExerciseFive {

    public static void main(String[] args) {

        String findUpperCase = "Let's Find The Uppercase Letters, Shall We? YES of COURSE";

        List<Character> uppercaseLetters = findUpperCase.chars().filter(c-> c >= 'A' && c <= 'Z').mapToObj(c -> (char) c).collect(Collectors.toList());

        System.out.println(uppercaseLetters);

    }
}
