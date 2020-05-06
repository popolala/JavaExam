package Exam3;

import java.util.function.Consumer;

class Counter {
    static int count = 1;
}

public class Qn74 {
    public static void main(String[] args) {
        Consumer<Integer> add = i -> {
            Counter.count += i;
            System.out.println(Counter.count);
        } ;
        Consumer<Integer> print = System.out::println;
        add.andThen(print).accept(10); //Line 10
    }
}
