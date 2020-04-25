package Exam1;

import java.io.*;

public class Qn76 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fis = new FileInputStream("F:\\orig.png");
             FileOutputStream fos = new FileOutputStream("F:\\copy.png"))
         {
            int res;
            byte [] arr = new byte[500000]; //Line 10
            while((res = fis.read(arr)) != -1){ //Line 11
                fos.write(arr); //Line 12
            }
        }
    }
}
