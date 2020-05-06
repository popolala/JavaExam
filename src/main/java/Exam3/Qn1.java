package Exam3;

public class Qn1 {

    private static void div(int i, int j) throws Exception {
        try {
            System.out.println(i / j);
        } catch(ArithmeticException e) {
            throw (Exception)e;
        }
    }
    public static void main(String[] args) {
        try {
            div(5, 0);
        } catch(ArithmeticException e) {
            System.out.println("AE");
        } catch(RuntimeException e) {
            System.out.println("RE");
        } catch(Exception e) {
            System.out.println("OO");
        }
    }
}
