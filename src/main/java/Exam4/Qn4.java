package Exam4;

enum Flags {
    TRUE, FALSE , HAPPY;

    private Flags() {
        System.out.println("HELLO");
    }
}

public class Qn4 {
    public static void main(String[] args) {
        Flags flags = Flags.TRUE;

        System.out.println("AAA");

        Flags flagsB = Flags.FALSE;
    }
}
