package Exam1;

import java.util.Arrays;

public class Qn15 {
    public static void main(String[] args) {
        String [] cities = {"Seoul", "Tokyo", "Paris", "London",
                "Hong Kong", "Singapore"};
        Arrays.stream(cities).sorted((s1,s2) -> s2.compareTo(s1))
                .forEach(System.out::println);
    }
}


/*

(s1,s2) -> s2.compareTo(s1) sort on descending

(s1,s2) -> s1.compareTo(s2) sort on ascending



 */