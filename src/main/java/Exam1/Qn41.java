package Exam1;

import java.util.stream.IntStream;

public class Qn41 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10).parallel()
                .forEachOrdered(System.out::println);
    }
}

//forEachOrdered will process the elements of the stream in the order specified by its source