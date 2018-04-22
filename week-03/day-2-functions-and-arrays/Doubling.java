package ArraysAndFunctions;

public class Doubling {

    public static void main(String[] args) {

        int ak = 123;
        System.out.println(doubling(ak));

    }

    static int doubling(int num){

        num = num*2;
        return num;

    }
}


// - Create an integer variable named `ak` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(ak)`