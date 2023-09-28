/**
 * @author valei - vlunderwood
 * CIS175 - Fall 2023
 * Sep 25, 2023
 */
package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Lake;

public class LakeHelper {
	//EntityManager suppling the operations to and from the database
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Module5Assessment");

	//method to add lake
	public void add(Lake model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();

	}
	//method to delete lake
	public void delete(Lake model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(Lake.class, model.getRowId()));
		manager.getTransaction().commit();
		manager.close();
	}
	
	//method to search for lake using JPQL query
	public Lake searchLakeByLakeName(String oldName) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Lake> query = manager.createQuery("SELECT i FROM lakes AS i WHERE i.lakeName = :lakeName", Lake.class);
		query.setParameter("lakeName", oldName);
		Lake dbEntity = query.getSingleResult();
		return dbEntity;
	}
	
	//method to show lakes using JPQL query
	@SuppressWarnings("unchecked")
	public List<Lake> showAllLakes() {
		EntityManager manager = factory.createEntityManager();
		List<Lake> allItems = manager.createQuery("SELECT i FROM lakes i").getResultList();
		manager.close();
		return allItems;
		
	}
	
	//method to update lakes 
	public void update(Lake model) {
		EntityManager manager = factory.createEntityManager();
		Lake dbEntity = manager.find(Lake.class, model.getRowId());
		manager.getTransaction().begin();
		dbEntity.setLakeName(model.getLakeName());
		dbEntity.setAvgTemperature(model.getAvgTemperature());
		dbEntity.setMaxDepth(model.getMaxDepth());
		manager.getTransaction().commit();
		manager.close();
		
	}
	
	
}
