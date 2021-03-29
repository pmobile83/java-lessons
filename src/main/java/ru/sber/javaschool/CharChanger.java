package ru.sber.javaschool;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CharChanger {
    public static void main(String[] args) throws IOException {
        String inputfileName = "./src//main//java//files//original.txt";
        String outputfileName = "./src//main//java//files//output.txt";

        readFile(inputfileName);
        writeFile(inputfileName, outputfileName);
        readFile(outputfileName);
    }

    private static void readFile(String fileName) throws IOException {
        {
            Path path = Paths.get(fileName);
            BufferedReader br = Files.newBufferedReader(path);
            String line;

            System.out.println("Файл " + fileName);
            while ((line = br.readLine()) != null) {

                System.out.println(line);
            }
            System.out.println();
            br.close();
        }
    }

    private static void writeFile(String inputfileName, String outputfileName) throws IOException {
        Files.write(
                Paths.get(outputfileName),
                (Iterable<String>) Files.lines(Paths.get(inputfileName))
                        .map(s -> s.replace(';', ' '))::iterator
        );
    }

}