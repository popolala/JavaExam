package Exam3;

import java.sql.*;

public class Qn66 {
    public static void main(String[] args) throws SQLException {


         String url = "jdbc:oracle:thin:@localhost:1521:orcl";
         String user = "c##tempUser";
         String password = "weijieno1";


        String query = "DELETE FROM MESSAGES";
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query);)
        {
            rs.next();
            System.out.println("SUCCESS");
        }
    }
}
