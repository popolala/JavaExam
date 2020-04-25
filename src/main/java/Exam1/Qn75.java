package Exam1;

import java.util.Optional;

public class Qn75 {
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.ofNullable(null);
        System.out.println(optional); //will return optional.empty
        System.out.println(optional.isPresent());
    }
}
//Optional.OfNullable creates an empty Optional object if passed argument is null. Need to use isPresent to determine if it contains null values.
