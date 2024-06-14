package groupby.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection dbConn;

    public static Connection getConnection() {
        if (dbConn == null) {
            try {
                String user = "hr";
                String pw = "hr";
                String url = "jdbc:oracle:thin:@localhost:1521:xe"; 

                Class.forName("oracle.jdbc.driver.OracleDriver");
                dbConn = DriverManager.getConnection(url, user, pw);
            } catch (ClassNotFoundException cnfe) {
                System.out.println("DB 드라이버 로딩 실패 :" + cnfe.toString());
            } catch (SQLException sqle) {
                System.out.println("DB 접속 실패 : " + sqle.toString());
            }
        }
        return dbConn;
    }

    public static void closeConnection() {
        if (dbConn != null) {
            try {
                dbConn.close();
                dbConn = null;
            } catch (SQLException sqle) {
                sqle.printStackTrace();
            }
        }
    }
}
