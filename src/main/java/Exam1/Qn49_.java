package Exam1;

interface Printerr1 {

    default void print() {
        System.out.println("Printer1");
    }

   //public void eat();
}

/*
interface Printerr3 {
    default void print() {
        System.out.println("Printer1");
    }

    //public void eat();
}
*/


class Printerr2 {
    public void print() {
        System.out.println("Printer2");
    }
    // Part 2
    /*public void eat(){
        System.out.println("sass");
    }*/
}


class Printerr extends Printerr2 implements Printerr1 {


}


public class Qn49_ {
    public static void main(String[] args) {
        Printerr printer = new Printerr();
        printer.print();
    }
}

// if you have a super class and an interface that implement the same method with default, the default method will not be used. The default method is like a backup only

// if i extends Printer2 and implements Printerr1 , do i still have to implement the eat method ? No , because printerr2 already have eat method.