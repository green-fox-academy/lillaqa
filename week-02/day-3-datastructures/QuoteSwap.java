package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;

public class QuoteSwap {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create I do not understand."
    }

    public static ArrayList quoteSwap(ArrayList list) {
        list.set(3, "create");
        list.set(2, list.set(5, list.get(2)));
        return list;
    }
}
