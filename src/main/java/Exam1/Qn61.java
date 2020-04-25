package Exam1;

class A {
    public void someMethod(final String name) {
        class B {
            void print() {
                System.out.println("Hello " + name);
            }
        }
        new B().print();

    }
}


public class Qn61 {
    public static void main(String[] args) {
        new A().someMethod("World!");
    }
}

//one important law of inner class is that it cannot have explicit access modifiers