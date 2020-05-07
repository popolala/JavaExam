package Exam4;

public class Qn13 {

    private static<T extends Number> void print(T t) {
        System.out.println(t.intValue());
    }

    public static void main(String[] args) {
        print(new Double(5.5));
    }
}
