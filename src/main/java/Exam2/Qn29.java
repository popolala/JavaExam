package Exam2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Qn29 {

    public static void main(String[] args) {
        try(PrintWriter bw = new PrintWriter("filename.txt"))
        {
            bw.close();
            bw.write(1);
        } catch(IOException e) {
            e.printStackTrace();
            System.out.println("IOException");
        }
    }
    }


