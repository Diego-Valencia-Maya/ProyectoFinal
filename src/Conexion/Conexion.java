/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class Conexion {
     static Connection con = null;
    
    public  static Connection obtenerConexion() {
        String url = "jdbc:sqlserver://LocalHost:1433;databaseName=BDVentas";
       // String url = "jdbc:sqlserver://Equipo-bd:1433;databaseName=BDVentas";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"No se Pudo Establecer Conexion.... Revision Driver  " + e.getMessage(),
            "Error de Conexion  ",JOptionPane.ERROR_MESSAGE);
        }
        try {
           // con = DriverManager.getConnection(url,"sa","Cisco10");
            con = DriverManager.getConnection(url,"sa","1234");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"ERROR" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
    public static ResultSet Consulta(String consulta){
        Connection con = obtenerConexion();
        Statement declara;
        try {
            declara = con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta; 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"ERROR" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
