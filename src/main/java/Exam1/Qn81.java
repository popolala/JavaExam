package Exam1;

import java.util.function.BiPredicate;

public class Qn81 {
    public static void main(String[] args) {
        String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};
        BiPredicate<String, String> predicate = String::startsWith;

        boolean result = predicate.test("Yes", "y")        ;
        System.out.println(predicate.test("Yes", "y"));

       /* for(String str : arr) {
            if(predicate.negate().test(str, "A"))
                System.out.println(str);
        }*/
    }
}

//For bipredicate, the first arguments is used as the instance on which to call the method.
