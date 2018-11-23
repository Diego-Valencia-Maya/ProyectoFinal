/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.filter.criteria;

import java.util.List;
import mx.edu.uttt.filter.entidad.Producto;
/**
 *
 * @author Diego
 */
public interface Criteria {
    public List<Producto> meetCriteria(List<Producto> productos);
}
