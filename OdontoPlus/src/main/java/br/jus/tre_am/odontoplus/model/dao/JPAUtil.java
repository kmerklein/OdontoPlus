package br.jus.tre_am.odontoplus.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory emf = null;
    private static EntityManager em = null;

    public static EntityManagerFactory getEntityManagerFactory() {
          if (emf == null)
               emf = Persistence.createEntityManagerFactory("odontoplus");
          return emf;
    }

     public static EntityManager getEntityManager() {
           if (em != null && em.isOpen()) {
        	   return em;
           }
           
           em = getEntityManagerFactory().createEntityManager();
           return em;
     }
}
