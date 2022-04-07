/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.edu.ucsi.gym;

/**
 *
 * @author Fares
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class SQLConnection {
  public static Connection ConnectorDb() {
    try {
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymapp", "root", "Fares@1962");
      return con;
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, e);
    }
    return null;
  }
}
