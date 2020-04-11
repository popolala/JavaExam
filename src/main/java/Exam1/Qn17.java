package Exam1;


class Resource1 {
    public void close() {
        System.out.println("Resource1");
    }
}

class Resource2 {
    public void close() {
        System.out.println("Resource2");
    }
}


public class Qn17 {
    public static void main(String[] args) {
       /* try(Resource1 r1 = new Resource1(); Resource2 r2 = new Resource2()) {
            System.out.println("Test");
        }*/
    }
}

 //  Classes used in try-with-resources statement must implement java.lang.AutoCloseable or its sub interfaces such as java.io.Closeable.