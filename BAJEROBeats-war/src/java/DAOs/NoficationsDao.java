/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Entities.Notifications;
import Entities.Products;
import EntityManagerFactoryHandler.EntityManagerFactoryHandler;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Sango
 */
public class NoficationsDao {
    
    /**
     * Create a new notification.
     * 
     * @param product
     */
    public void createAccount(Products product){
        Notifications newProduct = new Notifications(0);
        newProduct.setDate(new Date());
        newProduct.setProductId(product);
        
        EntityManager em = EntityManagerFactoryHandler.getEntityManagerFactory().createEntityManager();
        em.persist(newProduct);
        em.clear();
        em.close();  
    }
    
    /**
     * Read a list of all notifications.
     * 
     * @return Notification list
     */
    public List<Notifications> readAllNotifications(){
        EntityManager em = EntityManagerFactoryHandler.getEntityManagerFactory().createEntityManager();
        return em.createNamedQuery("Notifications.findAll", Notifications.class).getResultList();
    }
    
}
