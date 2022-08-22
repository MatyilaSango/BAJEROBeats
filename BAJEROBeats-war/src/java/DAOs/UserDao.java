/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Entities.User;
import EntityManagerFactoryHandler.EntityManagerFactoryHandler;
import java.util.Date;
import javax.persistence.EntityManager;

/**
 *
 * @author Sango
 */
public class UserDao {
    
    /**
     * Find a user account.
     * 
     * @param username
     * @param password
     * @return user account
     */
    public User findUser(String username, String password){
        EntityManager em = EntityManagerFactoryHandler.getEntityManagerFactory().createEntityManager();
        /*Users user = em.createQuery("SELECT u FROM Users u WHERE u.username = :username AND u.password = :password", Users.class)
                .setParameter("username", username)
                .setParameter("password", password)
                .getSingleResult();*/
 
        User user =  em.createQuery("SELECT u FROM Users u WHERE u.username = :username", User.class).setParameter("username", username).getSingleResult();
        em.clear();
        em.close();
        return user;
    }
    
    /**
     * Create a user account.
     * 
     * @param username
     * @param email
     * @param password
     */
    public void createAccount(String username, String email, String password){
        User newUser = new User(0, username, email, password, new Date());
        
        EntityManager em = EntityManagerFactoryHandler.getEntityManagerFactory().createEntityManager();
        em.persist(newUser);
        em.clear();
        em.close();  
    }
    
}
