package day03stream;

import java.util.stream.Collectors;

public class ExerciseNine {

    public static void main(String[] args) {

        char[] charsToString = {'t','e', 's','t', 'i', 'n', 'g', '_', 'i', 's', '_', 'f', 'u', 'n'};

        String stringVersion = new String(charsToString).chars().mapToObj(l -> (char) l).map(Object::toString).collect(Collectors.joining());
        System.out.println(stringVersion);
    }
}

