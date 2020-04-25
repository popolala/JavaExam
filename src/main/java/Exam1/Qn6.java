package Exam1;

import java.sql.*;

public class Qn6 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String user = "c##tempUser";
        String password = "weijieno1";
        String query = "select * from MESSAGES";
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement())
        {
            System.out.println(stmt.execute(query));
            ResultSet rs = stmt.getResultSet();

            while(rs.next()) {
                System.out.println("here");
            }
        }
    }
}

// execute(String) return true if first result is a resultSet Object
// execute(String) return false if it is update count or there are no result
// delete sql query return number of deleted records , which is not a  resultSet