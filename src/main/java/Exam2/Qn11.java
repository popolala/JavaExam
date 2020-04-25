package Exam2;

import java.io.*;

public class Qn11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number between 1 and 10: ");
        int num = br.read();
        System.out.println(num);
    }
}
