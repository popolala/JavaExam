package Exam1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Qn26 {
    public static void main(String[] args) throws IOException {

        //'Files.readAllLines(Paths.get("F:\\Book.java"))' returns List<String> object.
        Files.readAllLines(Paths.get("C:\\1z0809.txt")).stream().forEach(System.out::println);

        //'Files.lines(Paths.get("F:\\Book.java"))' returns Stream<String> object.
        Files.lines(Paths.get("C:\\1z0809.txt")).forEach(System.out::println);
    }
}
