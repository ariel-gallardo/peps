/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frm.oce.peps.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
/**
 *
 * @author ariel
 */
@Entity
public class Stock implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long cantidad;
    private boolean vendido;
    @OneToOne(cascade = CascadeType.ALL)
    private Valor valor;
    public Stock() {
    }

    public Stock(long cantidad) {
        this.cantidad = cantidad;
    }

    public Stock(long cantidad, Valor valor) {
        this.cantidad = cantidad;
        this.valor = valor;
        this.vendido = false;
    }

    public Stock(long cantidad, boolean vendido, Valor valor) {
        this.cantidad = cantidad;
        this.vendido = vendido;
        this.valor = valor;
    }

    public Stock(long id, long cantidad, boolean vendido, Valor valor) {
        this.id = id;
        this.cantidad = cantidad;
        this.vendido = vendido;
        this.valor = valor;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }
    
}
