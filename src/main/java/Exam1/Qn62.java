package Exam1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Qn62 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        //List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.removeIf(i -> i % 2 == 1);
        System.out.println(list);
    }
}

//Note that arrays.asList do not support add/remove operation. it is a list backed by an array