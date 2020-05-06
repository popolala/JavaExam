package Exam2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;

public class Qn41 {
    public static void main(String[] args) throws IOException{
        Path path = Paths.get("F:\\A\\B");


        System.out.println(Files.isDirectory(path));
        //System.out.println(File.isDirectory(path));
        System.out.println(path.toFile().isDirectory());
        //System.out.println(new File(path).isDirectory());
        System.out.println(Files.getAttribute(path, "isDirectory"));
    }

}
