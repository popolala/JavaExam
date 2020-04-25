package Exam1;

import java.util.stream.Stream;

public class qn73 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, i -> i + 1);

        System.out.println(stream.anyMatch(i -> i > 1));
    }
}
