package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcMysql {
               public static String driver = "com.mysql.jdbc.Driver";
               public static String url = "jdbc:mysql://localhost:3306/hotel";
               public static String user = "root";
               public static String passwd = "";
               public Connection getConn() throws Exception{
            	   Class.forName(driver);
            	   Connection conn = DriverManager.getConnection(url,user,passwd);
            	   return conn;
               }
}
