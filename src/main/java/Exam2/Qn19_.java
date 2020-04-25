package Exam2;

interface Printer1 {
    default void print() {
        System.out.println("Printer1");
    }
}

interface Printer2 {
    default void print() {
        System.out.println("Printer2");
    }
}

class Printer implements Printer1, Printer2 {

    public void print() {
        System.out.println("Printer");
        Printer1.super.print();
        Printer2.super.print();
    }

}

public class Qn19_ {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }
}
