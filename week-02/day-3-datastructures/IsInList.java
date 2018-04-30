package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;

public class IsInList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        checkNums(list);

    }

    public static void checkNums(ArrayList<Integer> list){

        if (list.contains(4) && list.contains(8) && list.contains(12) && list.contains(16)) {
            System.out.println("True");
        }
        else {
            System.out.println("false");
        }
    }
}
