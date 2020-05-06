package Exam3;

import java.util.Optional;

public class Qn33 {
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.of(null); //Line 8
        System.out.println(optional.orElse(-1)); //Line 9
    }
}
