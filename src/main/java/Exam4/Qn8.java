package Exam4;




public class Qn8 {
    private static String s;
    public static void main(String[] args) {
        try {
            System.out.println(s.length());
        } catch(NullPointerException | IndexOutOfBoundsException ex) {
            System.out.println("DONE");
        }
    }
}
