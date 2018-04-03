package edu.dmacc.spring.daycaresignup;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;



public class ChildrenDao {
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("DaycareSignup");
	
	public void insertChildren(Children childrenToAdd) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(childrenToAdd);
		em.getTransaction().commit();
		em.close();
		
	}

	public List<Children> getAllChildren() {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select u from Children u";
		TypedQuery<Children> typedQuery = em.createQuery(q, Children.class);
		List<Children> all = typedQuery.getResultList();
		
		return all;
		
	}

}
