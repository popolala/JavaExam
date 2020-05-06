package Exam3;

import java.util.stream.Stream;

public class Qn71 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("ocp");
        stream.flatMapToInt(s -> s.chars()).forEach(i -> System.out.print((char)i));
    }
}
