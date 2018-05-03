package day1ObjectOriented.preClassTask.sharpie;

public class Sharpie {

    String color;
    float width;
    float inkAmmount;

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
        inkAmmount = 100;
    }

    void use() {
        inkAmmount--;
    }
}
