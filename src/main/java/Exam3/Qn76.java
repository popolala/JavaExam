package Exam3;


import java.io.IOException;
import java.sql.SQLException;

class MyResource implements AutoCloseable {
    @Override
    public void close() throws IOException{
        throw new IOException("IOException");
    }

    public void execute() throws SQLException {
        throw new SQLException("SQLException");
    }
}

class MyResource2 implements AutoCloseable {
    @Override
    public void close() throws IOException{
        throw new IOException("POKEException");
    }

    public void execute() throws SQLException {
        throw new SQLException("SQLException");
    }
}



public class Qn76 {
    public static void main(String[] args) {
        try(
                MyResource2 resource2 = new MyResource2();
                MyResource resource = new MyResource()) {
            resource.execute();
        } catch(Exception e) {

            Throwable[] t = e.getSuppressed();
            System.out.println(e.getSuppressed()[0].getMessage());
        }
    }
}
