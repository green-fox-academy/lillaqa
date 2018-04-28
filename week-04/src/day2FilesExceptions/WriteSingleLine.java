package day2FilesExceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

public class WriteSingleLine {

    public static void main(String[] args) {

        Path myFile = Paths.get("lilla-file.txt");
        String myName = "Lilla";

        try {
            Files.write(myFile, Collections.singleton(myName));

        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }

    }
}
