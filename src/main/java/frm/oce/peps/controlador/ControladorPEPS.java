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
public class ControladorPEPS {
    private final VistaPEPS vistaPEPS;

    public ControladorPEPS(VistaPEPS vistaPEPS) {
        this.vistaPEPS = vistaPEPS;
        this.vistaPEPS.setVisible(true);
    }
    
}
