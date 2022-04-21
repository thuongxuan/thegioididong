/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thegioididong;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author duong
 */
public class Connect {
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    public static Connection openConnection(){
        
        String dbURL = "jdbc:mysql://localhost/thegioididong";
        String username = "root";
        String password = "";
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            return conn;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
   }
}
