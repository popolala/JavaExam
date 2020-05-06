package Exam2;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Qn36 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        BiConsumer<Integer, Integer> consumer = (k, v) -> {
            System.out.println(k + ":" + v);
        };

        BiFunction<Integer, Integer, Integer> function = (k, v) -> {
            System.out.println(k + ":" + v);
            return null;
        };
        //Line n1

        map.forEach(consumer);
    }
}
