package day03stream;

public class Fox {


    String name;
    String type;
    String color;

    public Fox(String name, String type, String color) {
        this.name = name;
        this.type = type;
        this.color = color;
    }

    public Object getColor() {
        return color;
    }

    public Object getName() {
        return name;
    }

    public Object getType() {
        return type;
    }
}
