package Exam3;

import java.sql.*;

public class Qn84 {
    public static void main(String[] args) throws SQLException {
         String url = "jdbc:oracle:thin:@localhost:1521:orcl";
         String user = "c##tempUser";
         String password = "weijieno1";
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ) {
            ResultSet res1 = stmt.executeQuery("SELECT * FROM EMPLOYEE ORDER BY ID");
            ResultSet res2 = stmt.executeQuery("SELECT * FROM EMPLOYEE ORDER BY ID DESC");

            if (res1.isClosed()){
                System.out.println(true);
            }

            res1.next();
            System.out.println(res1.getInt(1));
            res2.next();
            System.out.println(res2.getInt(1));
        }
    }
}
