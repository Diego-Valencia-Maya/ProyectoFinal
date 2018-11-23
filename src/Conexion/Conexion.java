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
    private Connection conexionSqlServer;
    //protected final String UrlSqlServer="jdbc:sqlserver://ASPIRE-A515-51N:1433;databaseName=cafeteria;user=usuarioSQl;password=Bolillo123;";
        protected final String UrlSqlServer="jdbc:sqlserver://ASPIRE-A515-51N:1433;databaseName=MetropolisDeportivaPrueba;user=sa;password=m0rt4lk0mb4t;";
    protected final String DriverSqlServer="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    
    
    public Conexion() throws ClassNotFoundException {
        try{
            Class.forName(DriverSqlServer);
            conexionSqlServer=DriverManager.getConnection(UrlSqlServer);
            System.out.println("Conexion a SQLServer OK");
           
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se establecio la conexion de SQLServer\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
}

}
