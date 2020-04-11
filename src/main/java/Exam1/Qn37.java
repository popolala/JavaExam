package Exam1;

import java.util.OptionalDouble;

class MyException extends RuntimeException{}


public class Qn37 {
    public static void main(String[] args) {
        OptionalDouble optional = OptionalDouble.empty();
        System.out.println(optional.orElseThrow(MyException::new));
    }
}

//orElseThrow will throw exception if there are no result.