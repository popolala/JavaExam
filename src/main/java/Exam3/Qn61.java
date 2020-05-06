package Exam3;


import java.util.function.Function;

public class Qn61 {
    public static void main(String[] args) {
        Function<Integer, Integer> f = x -> x + 10;
        Function<Integer, Integer> g = y -> y * y;

        Function<Integer, Integer> fog = g.compose(f); //Line 8
        System.out.println(fog.apply(10));
    }
}
