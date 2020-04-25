package Exam2;

import java.sql.*;

public class Qn9 {
    public static void main(String[] args) throws SQLException {
        String url = ConnectionDetails.url;
        String user = ConnectionDetails.user;
        String password = ConnectionDetails.password;
        String query = "Select ID, MESSAGE FROM LOG";
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ) {
            stmt.executeUpdate("INSERT INTO LOG VALUES(1001, 'Login Successful')");
            stmt.executeUpdate("INSERT INTO LOG VALUES(1002, 'Login Failure')");

            con.setAutoCommit(false);

            stmt.executeUpdate("INSERT INTO LOG VALUES(1003, 'Not Authorized')");
        }
    }
}
