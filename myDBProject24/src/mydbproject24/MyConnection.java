package mydbproject24;

import java.sql.*;
import javax.swing.JOptionPane;

public class MyConnection {
    static Connection con = null;
    
    // 변수 con을 사용하기위해 static으로 선언
    public static Connection makeConnection(String id, String pw){
        // Load and register the Driver
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            JOptionPane.showMessageDialog(null, "Driver is loaded and registered");
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error! Driver is not loaded and registered");
        }
        
        // Getting Connected
        String url = "jdbc:sqlserver://재영:1433;databaseName=GYM_DB";
        try {
            con = DriverManager.getConnection(url, id, pw);
            JOptionPane.showMessageDialog(null, "Connection");
            return con;
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error! No connection");
            return null;
        }

    }
}
