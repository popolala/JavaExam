package Exam3;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class Qn30 {

    public static void main(String[] args) throws Exception {
        List<String> list = Arrays.asList("oca", null, "ocp", "java", "null"); //Line n1
        Deque<String> deque = new ArrayDeque<String>(list); //Line n2
        System.out.println(deque.size()); //Line n3
    }
}
