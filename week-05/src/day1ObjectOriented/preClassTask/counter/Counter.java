package day1ObjectOriented.preClassTask.counter;

public class Counter {

    int number;
    int input;

    public Counter() {
        this.number = 0;
    }

    public Counter(int number) {
        this.number = number;
    }

    void add(int i) {
        this.input = i;
        number = number + i;
    }

    void get() {
        System.out.println(number);
    }

    void reset() {
        number = number - input;
    }

}

