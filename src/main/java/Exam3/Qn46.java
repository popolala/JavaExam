package Exam3;

import java.sql.SQLException;

public class Qn46 {
    private static void m() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            throw null; //Line 10
        }
    }

    public static void main(String[] args) {
        try {
            m(); //Line 16
        } catch(SQLException e) {
            System.out.println("Caught Successfully.");
        }
    }
}
