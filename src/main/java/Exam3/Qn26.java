package Exam3;

import java.util.concurrent.*;

public class Qn26 {

    public static void main(String[] args) throws Exception {

        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<String> f = es.submit(() -> "HELLO");
        System.out.println(f.get());
        es.shutdown();
    }
}
