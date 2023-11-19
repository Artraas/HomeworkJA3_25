package exercise2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        if (!Files.exists(Path.of("./Text.txt"))) {

            Files.createFile(Path.of("./Text.txt"));
        }

        Path pathToFile = Paths.get("./Text.txt");

        List<String> list = Files.readAllLines(pathToFile);

        System.out.println(list);
    }
}