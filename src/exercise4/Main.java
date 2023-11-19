package exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class Main {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("./Byron.txt");

        Path write = Files.write(path, "Hello, students!".getBytes(), StandardOpenOption.CREATE);

        System.out.println(Files.readAllLines(write));

    }
}
