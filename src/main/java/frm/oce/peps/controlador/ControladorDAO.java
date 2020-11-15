/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frm.oce.peps.controlador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author ariel
 */
public abstract class ControladorDAO {

    protected final String PERSISTENCEUNITNAME = "frm.oce_PEPS_jar_1.0-SNAPSHOTPU";
    protected EntityManagerFactory entityManagerFactory;
    protected EntityManager entityManager;
    protected EntityTransaction entityTransaction;

    protected ControladorDAO() {
        entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCEUNITNAME);
        entityManager = entityManagerFactory.createEntityManager();
    }

    protected void persistirObjeto(Object o) {
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
