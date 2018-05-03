package day1ObjectOriented.preClassTask.sharpie;

public class Main {

    public static void main(String[] args) {
        Sharpie testSharpie = new Sharpie("Green", 5);
        testSharpie.use();
        System.out.println(testSharpie.inkAmmount);
    }

}
