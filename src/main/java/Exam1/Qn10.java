package Exam1;

import java.util.Scanner;

public class Qn10 {
    public static void main(String[] args) {
        System.out.print("Enter some text: ");
        try(Scanner scan = new Scanner(System.in)) {
            String s = scan.nextLine();
            System.out.println(s);
            scan.close();
            scan.close();
        }
    }
}

//scanner class implement Autoclosable interface