package day01Testing.extension;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Extension {

    public int add(int a, int b) {
        return a+b;
    }

    public int maxOfThree(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else if (c > a && c > b) {
            return c;
        }
        return a;
    }

    public int median(List<Integer> pool) {
        Collections.sort(pool);
        int medianN;
        if (pool.size() % 2 == 0) {
            medianN = (pool.get((pool.size() / 2)) +
                    ((pool.get((pool.size() /2) -1)))) / 2;
        } else {
            medianN = pool.get(pool.size() / 2);
        }
        return medianN;
    }
    // TODO this is still missing
    public boolean isVowel(char c) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
    }
    // TODO the mistake it has to have different vowels, vowels can't be the last character
    public String translate(String hungarian) {
        String teve = hungarian;
        int length = teve.length();
        for (int i = 0; i < length; i++) {
            char c = teve.charAt(i);
            if (isVowel(c)) {
                teve = String.join(c + "v" + c, teve.split(""+c));
                i+=2;
                length+=2;
            }
        }
        return teve;
    }
}
