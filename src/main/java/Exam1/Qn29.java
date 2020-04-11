package Exam1;


import java.util.function.ToIntFunction;

public class Qn29 {
    public static void main(String[] args) {
        String text = "Aa aA aB Ba aC Ca";
        ToIntFunction<String> func = text::indexOf;
        System.out.println(func.applyAsInt("a"));
    }
}

//:: is able to pass the implementation of a method to a functional interface
