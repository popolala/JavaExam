package Exam4;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Qn19 {
    public static void main(String[] args) {

        Path file1 = Paths.get("F:\\A\\B\\C");

        Path file2 = Paths.get("Book.java");
        Path file3 = Paths.get("F:\\A\\B\\D");

        System.out.println(file1.resolve(file2));
        System.out.println(file1.resolveSibling(file2));

        System.out.println(file2.resolve(file1));
        System.out.println(file2.resolveSibling(file1));
    }
}
