package Exam1;

import java.sql.*;

public class Qn28_JDBC {
    public static void main(String[] args) {
        String url = ConnectionDetails.url;
        String user = ConnectionDetails.user;
        String password = ConnectionDetails.password;
        String query = "Select * from MESSAGES";
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ) {
            ResultSet rs = stmt.executeQuery(query);
            rs.relative(-3);
            rs.relative(1);
            System.out.println(rs.getInt(1));
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

/*
'rs.relative(-3);' doesn't throw any exception but keeps the cursor just before the 1st record.
According to javadoc of relative method, "Attempting to move beyond the first/last row in the result set positions the cursor
 before/after the first/last row". Same is true for absolute method as well.
 */