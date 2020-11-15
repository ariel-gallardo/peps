/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frm.oce.peps.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.MapKeyTemporal;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.TemporalType;
/**
 *
 * @author ariel
 */
@Entity
@NamedQueries(@NamedQuery(name = "Producto.TODOS", query = "SELECT p FROM Producto p"))
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL)                                       //https://docs.oracle.com/javaee/6/api/javax/persistence/MapKeyTemporal.html
    @MapKeyColumn(name = "fecha_alta")
    @MapKeyTemporal(TemporalType.DATE)
    @JoinColumn(name = "producto_id")
    private Map<Date,Stock> stock;

    public Producto() {
    }

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public Producto(String nombre, Map<Date, Stock> stock) {
        this.nombre = nombre;
        this.stock = stock;
    }

    public Producto(long id, String nombre, Map<Date, Stock> stock) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<Date, Stock> getStock() {
        return stock;
    }

    public void setStock(Map<Date, Stock> stock) {
        this.stock = stock;
    }


}
