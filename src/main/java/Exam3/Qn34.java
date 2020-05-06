package Exam3;


import java.util.concurrent.*;

class MyCallable implements Callable<Integer> {
    private Integer i;

    public MyCallable(Integer i) {
        this.i = i;
    }

    public Integer call() throws Exception {
        return --i;
    }
}

public class Qn34 {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newSingleThreadExecutor();
        MyCallable callable = new MyCallable(1);
        System.out.println(es.submit(callable).get());
        es.shutdown();
    }
}
