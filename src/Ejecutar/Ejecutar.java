/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutar;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mx.edu.uttt.filter.concrete.CriteriaCaducidad;
import mx.edu.uttt.filter.concrete.CriteriaID;
import mx.edu.uttt.filter.concrete.CriteriaNombre;
import mx.edu.uttt.filter.concrete.CriteriaPrecio;
import mx.edu.uttt.filter.concrete.CriteriaProveedor;
import mx.edu.uttt.filter.concrete.CriteriaStock;
import mx.edu.uttt.filter.criteria.Criteria;
import mx.edu.uttt.filter.entidad.Producto;
/**
 *
 * @author Diego
 */
public class Ejecutar extends Conexion{
     private Connection conexionSqlServer;
    private PreparedStatement pdst;
    List<Producto> products = new ArrayList<Producto>();
    
    
    
     public void buscarArticulos(String campo, String valor) {
         
        try {
            Statement st = conexionSqlServer.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM productos where "+campo+"= "+valor);
            while (rs.next()) {
              int id= rs.getInt(1);
              String nombre=rs.getString(2);
              float precio=rs.getFloat(3);
              int stock=rs.getInt(4);
              String caducidad=rs.getString(5);
              String proveedor=rs.getString(6);
              products.add(new Producto(id, nombre, precio, stock, caducidad, proveedor));
                
            }


        } catch (SQLException ex) {
           
        }

    }
    public static void main(String[] args) {
        String campo= null;
        String dato= null;
        campo=JOptionPane.showInputDialog("Ingresa el campo que quieres buscar");
        dato=JOptionPane.showInputDialog("Ingresa el dato que quieres buscar");
        Ejecutar ej = new Ejecutar();
        ej.buscarArticulos(campo, dato);
        Criteria id = new CriteriaID();
        Criteria nombre = new CriteriaNombre();
        Criteria precio = new CriteriaPrecio();
        Criteria stock = new CriteriaStock();
        Criteria caducidad = new CriteriaCaducidad();
        Criteria proveedor = new CriteriaProveedor();
        
    }
}
