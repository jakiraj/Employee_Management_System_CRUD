
package util;

import java.sql.*;
public class DBConnect {
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_crud","root","root");
            return con;
        } catch (Exception e) {
            System.err.println("Connection error");
            return null;
        }
    }
}
