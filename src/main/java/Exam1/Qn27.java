package Exam1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Qn27 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(-80, 100, -40, 25, 200);
        Predicate<Integer> predicate = num -> {
            int ctr = 1;
            boolean result = num > 0;
            System.out.print(ctr++ + ".");
            return result;
        };

        list.stream().filter(predicate).findFirst(); //stop at 100

    }
}
