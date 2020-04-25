package Exam2;

import java.util.function.Function;
import java.util.function.Supplier;

public class Qn27 {

    static int a = 10000;

    static {
        --a;
    }

    {
        ++a;
    }


    public static void main(String[] args) {


        Qn27 bb = new Qn27();

        System.out.println(bb.a);
    }

}
