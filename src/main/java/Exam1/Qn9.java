package Exam1;

import java.util.stream.IntStream;

public class Qn9 {
    public static void main(String[] args) {
        IntStream stream = "OCP".chars();
        stream.forEach(c -> System.out.print((char)c));
        //System.out.println(stream.count()); //Line 9
    }
}

//ForEach, count, toArray, reduce, collect, findFirst, findAny, anyMatch, allMatch, sum, min, max, average are considered
// terminal operation.