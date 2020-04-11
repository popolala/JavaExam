package Exam1;

import java.util.function.Consumer;

public class Qn45 {
    public static void main(String[] args) {
        Consumer<Integer> consumer = System.out::print;
        Integer i = 5;
        consumer.andThen(consumer).accept(i++); //Line 7
    }
}

//consumer.andThen(consumer) literally means the value 5 will be "consumer.accept(5); consumer.accept(5)"