package Exam1;

class MyResource implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Closing");
    }
}

public class Qn7 {
    public static void main(String[] args) {
        try(AutoCloseable resource = new MyResource()) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//Remember that AutoCloseable have close method throwing Exception
