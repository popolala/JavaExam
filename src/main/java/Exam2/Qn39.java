package Exam2;

import java.util.ArrayDeque;
import java.util.Deque;

public class Qn39 {
    public static void main(String[] args) {
        ArrayDeque<Character> chars = new ArrayDeque<>();
        chars.add('A');
        chars.remove();
        chars.remove();

        System.out.println(chars);
    }
}
