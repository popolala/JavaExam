package Exam1;

import java.util.ArrayList;
import java.util.List;

public class Qn77 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.stream().anyMatch(s -> s.length() > 0));
        System.out.println(list.stream().allMatch(s -> s.length() > 0));
        System.out.println(list.stream().noneMatch(s -> s.length() > 0));
    }
}

/*
allMatch and noneMatch return true if stream is empty
anyMatch return false if stream is empty
 */