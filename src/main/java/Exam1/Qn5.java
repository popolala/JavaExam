package Exam1;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


interface StringConsumer extends Consumer<String> {
    @Override
    public default void accept(String s) {
        System.out.println(s.toUpperCase());
    }
}

public class Qn5 {
    public static void main(String[] args) {

      /*  StringConsumer consumer = s -> System.out.println(s.toLowerCase);
        List<String> list = Arrays.asList("Dr", "Mr", "Miss", "Mrs");
        list.forEach(consumer);
*/
    }
}
