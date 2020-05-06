package Exam2;

class J {
    private int o = 99;
}


class X {

    private int cde = 20;

    class Y {

        private int abc = 10;

        private void m() {
            System.out.println("INNER");
            System.out.println(cde);
        }
    }

    public void invokeInner() {
        Y y = new Y(); //Line 9
        y.m(); //Line 10

        System.out.println("The answer is "+y.abc);
    }
}

public class Qn54 {
    public static void main(String[] args) {

        X x = new X();
        x.invokeInner();

        System.out.println("End");
    }
}
