package Exam3;

import java.io.File;
import java.io.FileNotFoundException;

class MyException extends RuntimeException {
    public void log() {
        System.out.println("Logging MyException");
    }
}

class YourException extends RuntimeException {
    public void log() {
        System.out.println("Logging YourException");
    }
}


public class Qn75 {
    public static void main(String[] args) {
        try {
            throw new MyException();
        } catch(MyException | YourException ex){

            if (ex instanceof RuntimeException){
                System.out.println("Runtime Exception");
            } else{
                System.out.println(ex.getClass());
            }
           // ex.log();
        }
    }
}
