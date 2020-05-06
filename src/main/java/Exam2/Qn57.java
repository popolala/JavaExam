package Exam2;


import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Qn57 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("F:\\A\\B\\C\\");
        System.out.printf("%d, %s, %s", path.getNameCount(), path.getFileName(), path.getName(2));
    }
}
