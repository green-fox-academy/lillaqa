package day1ObjectOriented.preClassTask.dominoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Dominoes {

    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        /*
        for(int i; i < dominoes.size(); i++) {
            new Domino(5, 2);
            getValues, új tömb, ha ennek a második eleme megegyik egy másik első elemével

            megoldás for ciklusok és a getvalues használata
        }*/

        System.out.println(dominoes);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }




}


/*You have the list of Dominoes
Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
eg: [2, 4], [4, 3], [3, 5] ...*/