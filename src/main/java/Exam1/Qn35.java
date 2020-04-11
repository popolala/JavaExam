package Exam1;

import java.io.*;

public class Qn35 {
    public static void main(String[] args) {
        File dir = new File("F:" + File.separator + "A" + File.separator + "B");
        System.out.println(dir.getParentFile().getParent());
    }
}

/*
File class has below 2 methods:
getParentFile() {...}  return a file object
getParent() {...} return a String
 */