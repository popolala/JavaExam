package Exam1;

import java.util.Arrays;
import java.util.List;

public class Qn20 {
    public static void main(String[] args) {
        List<String> codes = Arrays.asList("1st", "2nd", "3rd", "4th");
        System.out.println(codes.stream().filter(
                s -> s.endsWith("d")).reduce((s1, s2) -> s1 + s2));
    }
}

//all terminal operations of stream will return Optional if there is a potential of result. Reduce return Optional