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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Sango
 */
public class CartDao {
    
    /**
     * Read a list of user's products in the Cart.
     * 
     * @param user
     * @return product list
     */
    public List<Cart> readMyCart(Users user){
        EntityManager em = EntityManagerFactoryHandler.getEntityManagerFactory().createEntityManager();
        List<Cart> myCart = em.createNamedQuery("Cart.findAll", Cart.class).getResultList();
        List<Cart> cart = new ArrayList<>();
        for(Cart c : myCart){
            if(c.getUserId().getId() == (user.getId())){
                cart.add(c);
            }
        }
        return cart;
    }
    
    /**
     * Add a product to my cart.
     * 
     * @param user
     * @param product
     */
    public void addToMycart(Users user, Products product){
        Cart cart = new Cart();
        cart.setProductId(product);
        cart.setUserId(user);
        cart.setStatus("Not bought");
        
        EntityManager em = EntityManagerFactoryHandler.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(cart);
        em.getTransaction().commit();
        em.clear();
        em.close();
    }
    
    /**
     * Delete this product from my cart.
     * 
     * @param user
     * @param product
     */
    public void deleteCart(Users user, Products product){
        List<Cart> myCart = this.readMyCart(user);
        Cart cart = null;
        for (Cart c : myCart){
            if(c.getProductId().equals(product)){
                cart = c;
            }
        }
        
        EntityManager em = EntityManagerFactoryHandler.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        em.remove(cart);
        em.getTransaction().commit();
        em.clear();
        em.close();
    }
    
    /**
     * Checkout a product.
     * 
     * @param user
     * @param product
     * @return download link.
     */
    public String chectOutProduct(Users user, Products product){
        EntityManager em = EntityManagerFactoryHandler.getEntityManagerFactory().createEntityManager();
        Cart myProduct = em.createQuery("SELECT c FROM Cart c WHERE c.userId = :userId AND c.productId = :productId AND c.status = :status", Cart.class)
                .setParameter("userId", user.getId())
                .setParameter("productId", product.getId())
                .setParameter("status", "Not bought")
                .getSingleResult();
        
        myProduct.setStatus("Bought");
        myProduct.setDatebought(new Date());
        
        em.getTransaction().begin();
        em.merge(myProduct);
        em.getTransaction().commit();
        em.clear();
        em.close();
        
        return myProduct.getProductId().getDownloadlink();
    }
    
}
