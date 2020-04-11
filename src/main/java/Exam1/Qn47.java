package Exam1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Qn47 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<String> c = new Callable<String>() {
            @Override
            public String call() throws Exception {
                try {
                    Thread.sleep(3000);
                } catch(InterruptedException e) {}
                return "HELLO";
            }
        };

        ExecutorService es = Executors.newFixedThreadPool(10);
        List<Callable<String>> list = Arrays.asList(c,c,c,c,c);
        List<Future<String>> futures = es.invokeAll(list);
        System.out.println(futures.size());
        es.shutdown();
    }
}

//Note that callable is used together with Future. Callable is able to return a value. Runnable does not return a value