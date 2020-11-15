/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frm.oce.peps.controlador;

import frm.oce.peps.vista.VistaPEPS;
import javax.persistence.Persistence;

/**
 *
 * @author ariel
 */
public final class ControladorPrincipal {


    private static ControladorPEPS controladorPEPS;
    
    public static void main(String[] args) {
        /*
            Producto p = new Producto("Memoria Ram");
            HashMap stock = new HashMap<Date,Stock>();
                stock.put(new Date(120,10,14), new Stock(500, new Valor(3000, 10)));
                stock.put(new Date(), new Stock(800,new Valor(4000, 10)));
            p.setStock(stock);
            persistirObjeto(p);
        */
        controladorPEPS = new ControladorPEPS(new VistaPEPS());
    }
    

}
