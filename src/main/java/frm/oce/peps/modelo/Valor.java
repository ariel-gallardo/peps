/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frm.oce.peps.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author ariel
 */
@Entity
public class Valor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private double numero;
    private double porcentajeVenta;
    @OneToOne(mappedBy = "valor")
    private Stock stock;

    public Valor() {
    }

    public Valor(double numero, double porcentajeVenta) {
        this.numero = numero;
        this.porcentajeVenta = porcentajeVenta;
    }

    public Valor(long id, double numero, double porcentajeVenta) {
        this.id = id;
        this.numero = numero;
        this.porcentajeVenta = porcentajeVenta;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getPorcentajeVenta() {
        return porcentajeVenta;
    }

    public void setPorcentajeVenta(double porcentajeVenta) {
        this.porcentajeVenta = porcentajeVenta;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
    
}
