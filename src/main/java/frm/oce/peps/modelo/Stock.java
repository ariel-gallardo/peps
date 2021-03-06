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
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_baja;
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
    }

    public Stock(long cantidad, Date fecha_baja, Valor valor) {
        this.cantidad = cantidad;
        this.fecha_baja = fecha_baja;
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

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    public Date getFecha_baja() {
        return fecha_baja;
    }

    public void setFecha_baja(Date fecha_baja) {
        this.fecha_baja = fecha_baja;
    }
    
}
