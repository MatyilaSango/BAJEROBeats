/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Entities.Mylist;
import Entities.Products;
import Entities.Users;
import EntityManagerFactoryHandler.EntityManagerFactoryHandler;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Sango
 */
public class MylistDao {
    
    /**
     * Read a list of a user's favorite products from the database.
     * 
     * @param user
     * @return product list
     */
    public List<Products> readMyFavorite(Users user){
        EntityManager em = EntityManagerFactoryHandler.getEntityManagerFactory().createEntityManager();
        List<Mylist> mylist = em.createNamedQuery("Mylist.findAll", Mylist.class).getResultList();
        List<Products> products = new ArrayList<>();
        for(Mylist product : mylist){
            if(product.getUserId().getId() == (user.getId())){
                products.add(product.getProductId());
            }
        }
        return products;
    }
    
    /**
     * Add a favorite product in user's favorite list.
     * 
     * @param user
     * @param product
     */
    public void addProduct(Users user, Products product){
        Mylist myProduct = new Mylist();
        myProduct.setProductId(product);
        myProduct.setUserId(user);
        
        EntityManager em = EntityManagerFactoryHandler.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(myProduct);
        em.getTransaction().commit();
        em.clear();
        em.close();
    }
    
    /**
     * Add a favorite product in user's favorite list.
     * 
     * @param user
     * @param product
     */
    public void deleteProduct(Users user, Products product){
        EntityManager em = EntityManagerFactoryHandler.getEntityManagerFactory().createEntityManager();
        Mylist myProduct = em.createQuery("SELECT m FROM Mylist m WHERE m.productId = :productId AND m.userId = :userId", Mylist.class)
                .setParameter("productId", product.getId())
                .setParameter("userId", user.getId())
                .getSingleResult();
        
        em.getTransaction().begin();
        em.remove(myProduct);
        em.getTransaction().commit();
        em.clear();
        em.close();
    }
    
    
}
