package Exam3;

class Outer {
    public static void sayHello() {}
    static {
        class Inner {
           Inner(){
               System.out.println("Hello");
           }
        }
        new Inner();
    }
}

public class Qn87 {
    public static void main(String[] args) {
        //Outer.sayHello();
        new Outer();
    }
}
