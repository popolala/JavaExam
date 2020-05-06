package Exam3;

interface Sellable {
    double getPrice();
}


public class Qn67 {
    private static void printPrice(Sellable sellable) {
        System.out.println(sellable.getPrice());
    }

    public static void main(String[] args) {
        printPrice(null);
    }
}
