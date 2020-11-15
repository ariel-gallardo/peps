/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frm.oce.peps.controlador;
import frm.oce.peps.vista.VistaPEPS;


/**
 *
 * @author ariel
 */
public final class ControladorPrincipal {


    private static ControladorPEPS controladorPEPS;
    
    public static void main(String[] args) {
        controladorPEPS = new ControladorPEPS(new VistaPEPS());
    }
    

}
