package ArraysAndFunctions;

import java.lang.reflect.Array;

public class ChangeElement {

    public static void main(String[] args) {

        int[] s = {1, 2, 3, 8, 5, 6};
        Array.setInt(s,3,4);
        System.out.println(s[3]);
    }
}
