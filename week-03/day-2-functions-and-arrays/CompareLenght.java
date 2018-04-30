package ArraysAndFunctions;

public class CompareLenght {

    public static void main(String[] args) {

        int p1[] = {1, 2, 3};
        int p2[] = {4, 5};

        if(p1.length < p2.length) {
            System.out.println("P1 is a longer list");
        }
        else {
            System.out.println("P2 is a longer list");
        }
    }
}
