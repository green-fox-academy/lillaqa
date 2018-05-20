package day03stream;

import java.util.stream.Collectors;

public class ExerciseSeven {

    public static void main(String[] args) {

        String frequency = "Elegance is usually confused with superficiality, fashion, lack of depth. This is a serious mistake: human beings need to have elegance in their actions and in their posture because this word is synonymous with good taste, amiability, equilibrium and harmony. (Paulo Coelho)";

        System.out.println(frequency.chars().boxed().collect(Collectors.groupingBy(i -> (char) (int) i, Collectors.counting())));

    }
}
