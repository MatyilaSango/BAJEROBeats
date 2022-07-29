/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Entities.Products;
import EntityManagerFactoryHandler.EntityManagerFactoryHandler;
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
    
}
