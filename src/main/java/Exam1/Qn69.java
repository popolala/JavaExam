package Exam1;

import java.sql.*;

public class Qn69 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ocp";
        String user = "root";
        String password = "password";
        String query = "Select ID, FIRSTNAME, LASTNAME, SALARY FROM EMPLOYEE WHERE SALARY > 14900 ORDER BY ID";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(query);) {
            rs.absolute(2);
            rs.updateDouble("SALARY", 20000);

            //rs.updateRow();

        } catch (SQLException ex) {
            System.out.println("Error");
        }
    }
}

//in order to update record in database, you need to have rs.updateRow();
