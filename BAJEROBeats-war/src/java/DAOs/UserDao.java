/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Entities.Users;
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
    public Users findUser(String username, String password){
        EntityManager em = EntityManagerFactoryHandler.getEntityManagerFactory().createEntityManager();
        return em.createQuery("SELECT u FROM Users u WHERE u.username = :username AND u.password = :password", Users.class)
                .setParameter("username", username)
                .setParameter("password", password)
                .getSingleResult();
    }
    
    /**
     * Create a user account.
     * 
     * @param username
     * @param email
     * @param password
     */
    public void createAccount(String username, String email, String password){
        Users newUser = new Users(0, username, email, password, new Date());
        
        EntityManager em = EntityManagerFactoryHandler.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(newUser);
        em.getTransaction().commit();
        em.clear();
        em.close();  
    }
    
}
