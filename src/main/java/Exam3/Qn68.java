package Exam3;

interface OperatorA<T> {
    public abstract T operation(T t1, T t2);
}


interface OperatorB {
    public abstract int operation(int t1, int t2);
}

public class Qn68 {
    public static void main(String[] args) {
        System.out.println((OperatorA<String>)(String s1, String s2) -> s1 + s2);
    }
}
