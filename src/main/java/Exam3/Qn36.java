package Exam3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Qn36 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("M", "R", "A", "P");
        Collections.sort(list, null);
        list.stream().forEach(System.out::print);
    }
}
