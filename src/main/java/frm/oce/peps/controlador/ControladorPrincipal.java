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
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author ariel
 */
public final class ControladorPrincipal {

    private static final String PERSISTENCEUNITNAME = "frm.oce_PEPS_jar_1.0-SNAPSHOTPU";
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;
    private static EntityTransaction entityTransaction;
    
    public static void main(String[] args) {
        entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCEUNITNAME);
        entityManager = entityManagerFactory.createEntityManager();
        Producto p = new Producto("Memoria Ram");
        HashMap stock = new HashMap<Date,Stock>();
            stock.put(new Date(120,10,14), new Stock(500, new Valor(3000, 10)));
            stock.put(new Date(), new Stock(800,new Valor(4000, 10)));
        p.setStock(stock);
        persistirObjeto(p);
    }
    
    public static void persistirObjeto(Object o){
            entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCEUNITNAME);
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(o);                                           //Crea una instancia del objeto y la persiste.
            entityManager.flush();                                              //Sincroniza la persistencia con la db.
            entityTransaction.commit();                                         //Confirma los cambios de persistencia en la db.
            entityManager.close();                                              //Cierra las conexiones
            entityManagerFactory.close();
    }
}
