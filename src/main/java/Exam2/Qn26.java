package Exam2;

import java.util.concurrent.*;

class Printer3 implements Runnable {
    public void run() {
        System.out.println("Printing");
    }
}



public class Qn26 {

    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(1);

        es.submit(new Printer3());

        es.shutdown();
    }
}
