package DataStructures;

public class TodoPrint {

    public static void main(String... args) {

        String todoText = " - Buy milk\n";

        todoText = new StringBuilder(todoText).insert(0, "My todo:\n").insert(21, " - Download games\n    - Diablo").toString();


        System.out.println(todoText);
    }
}
