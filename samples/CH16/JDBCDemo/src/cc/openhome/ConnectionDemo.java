package cc.openhome;

import static java.lang.System.out;
import java.sql.*;

public class ConnectionDemo {
    public static void main(String[] args)
                              throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String jdbcUrl = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String passwd = "openhome";
        try(Connection conn = 
                DriverManager.getConnection(jdbcUrl, user, passwd)) {
            out.printf("已%s資料庫連線%n", 
                    conn.isClosed() ? "關閉" : "開啟");
        } 
    }
}
