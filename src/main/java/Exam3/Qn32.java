package Exam3;

import java.util.stream.IntStream;

public class Qn32 {
    public static void main(String[] args) {
        int res = IntStream.rangeClosed(1, 1000).parallel()
                .filter( i -> i > 50).findFirst().getAsInt();
        System.out.println(res);
    }
}
