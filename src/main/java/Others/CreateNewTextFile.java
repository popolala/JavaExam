package Others;

import java.io.File;
import java.io.FileWriter;

public class CreateNewTextFile {

    public static void main(String[] args) throws Exception {
        File file = new File("C:\\JavaTempFolder\\testFile1.txt");

//Create the file
        if (file.createNewFile())
        {
            System.out.println("File is created!");
        } else {
            System.out.println("File already exists.");
        }

//Write Content
        FileWriter writer = new FileWriter(file);
        writer.write("Test data");
        writer.close();
    }
}
