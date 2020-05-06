package Exam2;

import java.util.stream.Stream;

public class Qn55 {
    public static void main(String[] args) {
        System.out.println(Stream.of(10, 0, -10).sorted().findAny().orElse(-1));
    }
}
