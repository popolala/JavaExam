package Exam4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Qn16 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));

        list.stream().map(s -> s + 1);

        System.out.println(list);
    }
}
