/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.filter.concrete;

import java.util.ArrayList;
import java.util.List;
import mx.edu.uttt.filter.criteria.Criteria;
import mx.edu.uttt.filter.entidad.Producto;

/**
 *
 * @author Diego
 */
public class CriteriaProveedor implements Criteria{
     String b;
    public String obtener(String Busqueda){
        b=Busqueda;
        return b;
    }
    @Override
    public List<Producto> meetCriteria(List<Producto> productos) {
        
        List<Producto> producto = new ArrayList<Producto>();
        for(Producto product : productos){
            if (product.getProveedores().equalsIgnoreCase(b)) {
                producto.add(product);
            }
        }
        return producto;
    }
}
