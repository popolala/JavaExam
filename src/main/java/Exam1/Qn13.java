package Exam1;

import java.io.*;

public class Qn13 {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\1zo809.txt");
        try(
                DataOutputStream os = new DataOutputStream(new FileOutputStream(file));
                DataInputStream is = new DataInputStream((new FileInputStream(file)))
        ) {
            os.writeChars("JAVA"); //write as " J A V A"
            System.out.println(is.readChar());
        }
    }
}
