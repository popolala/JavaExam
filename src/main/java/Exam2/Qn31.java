package Exam2;

import java.sql.SQLException;

public class Qn31 {
    private static void m() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            //e = new SQLException(); //comment this line to try
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            m();
        } catch(SQLException e) {
            System.out.println("Caught Successfully.");
        }
    }
}
