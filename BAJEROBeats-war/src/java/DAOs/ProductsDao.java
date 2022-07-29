/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Entities.Cart;
import Entities.Products;
import Entities.Users;
import EntityManagerFactoryHandler.EntityManagerFactoryHandler;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Sango
 */
public class ProductsDao {
    
    /**
     * Read a list of all the products in the database.
     * 
     * @return product list
     */
    public List<Products> readAllProducts(){
        EntityManager em = EntityManagerFactoryHandler.getEntityManagerFactory().createEntityManager();
        return em.createNamedQuery("Products.findAll", Products.class).getResultList();
    }
    
    /**
     * Add a new product.
     * 
     * @param name
     * @param cost
     * @param picLink
     * @param downloadLink
     */
    public void addProduct(String name, int cost, String picLink, String downloadLink){
        Products product = new Products(0, name, new Date(), cost, 0, picLink, downloadLink);
        
        EntityManager em = EntityManagerFactoryHandler.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(product);
        em.getTransaction().commit();
        em.clear();
        em.close();
    }
    
}
