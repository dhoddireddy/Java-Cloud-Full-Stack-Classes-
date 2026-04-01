package inputoutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class InNIoDemo {

    public static void main(String[] args) {

        System.out.println("Start");

        try {
            // 🔹 Read file
            List<String> lines = Files.readAllLines(Path.of("data.txt"));

            // 🔹 Print file content
            for (String line : lines) {
                System.out.println(line);
            }

            // 🔹 Write to another file
            Files.write(Path.of("output.txt"), lines);
            System.out.println("Data written to output.txt");

        } catch (IOException e) {
            System.out.println("File error occurred!");
            e.printStackTrace();
        }

        System.out.println("End");
    }
}