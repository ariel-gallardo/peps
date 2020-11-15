/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frm.oce.peps.controlador;

import frm.oce.peps.modelo.Producto;
import frm.oce.peps.modelo.Stock;
import frm.oce.peps.modelo.Valor;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author ariel
 */
public class ControladorProducto extends ControladorDAO {

    public ControladorProducto() {

    }
    
    public void cargar(){
        Producto p = new Producto("Memoria Ram");
        HashMap stock = new HashMap<Date, Stock>();
        stock.put(new Date(120, 10, 14), new Stock(500, new Valor(3000, 10)));
        stock.put(new Date(), new Stock(800, new Valor(4000, 10)));
        p.setStock(stock);
        persistirObjeto(p);
    }

    public List<Producto> getProductos() {
        return entityManager.createNamedQuery("Producto.TODOS", Producto.class).getResultList();
    }

}
