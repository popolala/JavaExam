package Exam2;

import java.sql.*;
import java.util.Properties;

public class Qn6 {

    static String url = "jdbc:oracle:thin:@localhost:1521:orcl";

    public static void main(String[] args) throws SQLException {

        Properties prop = new Properties();
        prop.put("username", "c##tempUser");
        prop.put("password", "weijieno1");
        String query = "Select ID, FIRSTNAME, LASTNAME, SALARY FROM EMPLOYEE ORDER BY ID";

        try (Connection con = DriverManager.getConnection(url, prop);
             Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = stmt.executeQuery(query);) {
            rs.relative(1);
            System.out.println(rs.getString(2));
        }
    }

}
