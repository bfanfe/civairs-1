package com.ngis.civairs.services;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import com.ngis.civairs.applicationException.CRUDException;
import com.ngis.civairs.entities.Aircraft;
import com.ngis.civairs.entities.Notification;

@Stateless
public class NotificationService implements INotification {
	
	@PersistenceContext(unitName = "civairs_db_pu")
	private EntityManager em;
	
	Notification notification;
	
	@PostConstruct
	public void init(){
		notification = new Notification();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Notification> findAllNotification() {
		// TODO Auto-generated method stub
		
		return em.createQuery("SELECT n FROM Notification n").getResultList();
	}

	@Override
	public void createNotification(Notification notification, List<Aircraft> aircrafts) {
		// TODO Auto-generated method stub
		notification.setAircrafts(aircrafts);
		em.persist(notification);
		try{
			em.flush();
			
		} catch (PersistenceException e) {
			// TODO: handle exception
			throw new CRUDException("Problème d'insertion de la notification");
			
		}
		
	}

	@Override
	public void updateNotification(Notification notification, List<Aircraft> aircrafts) {
		// TODO Auto-generated method stub
		notification.getAircrafts().clear();
		notification.getAircrafts().addAll(aircrafts);
		em.merge(notification);
		try{
			em.flush();
			
		} catch (PersistenceException e) {
			// TODO: handle exception
			throw new CRUDException("Problème de mise à jour de la notification");
			
		}
		
	}

}
