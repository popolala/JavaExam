package Exam1;

import java.util.concurrent.*;

class Player extends Thread {

    CyclicBarrier cb;

    public Player(){
        super();
    }

    public Player(CyclicBarrier cb) {
        this.cb = cb;
        this.start();
    }

    public void run() {
        try {
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {}
    }
}

class Match implements Runnable {
    public void run() {
        System.out.println("Match is starting...");
    }
}

public class Qn46 {
    public static void main(String[] args) {
        Match match = new Match();
        CyclicBarrier cb = new CyclicBarrier(2, match);
        Player p1 = new Player(cb);
        /*INSERT*/
    }
}
