/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.filter.entidad;

/**
 *
 * @author Diego
 */
public class Producto {
     private int id ;
    private String nombre;
     private float precio;
     private int stock;
    private String caducidad;
    private String proveedores;

    public Producto(int id, String nombre, float precio, int stock, String caducidad, String proveedores) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.caducidad = caducidad;
        this.proveedores = proveedores;
    }
    
     public Producto(int id) {
      this.id= id;
    }
    
     public Producto(String nombre) {
      this.nombre= nombre;
    }
     
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public String getProveedores() {
        return proveedores;
    }

    public void setProveedores(String proveedores) {
        this.proveedores = proveedores;
    }
    
    
}
