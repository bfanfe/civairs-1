package com.ngis.core.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import com.ngis.civairs.applicationException.CRUDException;
import com.ngis.core.model.ResponsibleEntity;

@Stateless
@LocalBean
public class ResponsibleEntityService2 implements IResponsibleEntity{
	
	@PersistenceContext(unitName = "civairs_db_pu")
	private EntityManager em;
	
	
	@Override
	public void createResponsibleEntity(ResponsibleEntity responsibleEntity) {
		// TODO Auto-generated method stub
		em.persist(responsibleEntity);
		try{
			em.flush();
			
		} catch (PersistenceException e) {
			// TODO: handle exception
			throw new CRUDException("Problème d'insertion de la structure");
			
		}
		
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<ResponsibleEntity> findAllResponsibleEntity() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT n FROM ResponsibleEntity n").getResultList();
	}


	@Override
	public void deleteResponsibleEntity(String responsibleEntityId) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void updateResponsibleEntity(ResponsibleEntity responsibleEntity) {
		// TODO Auto-generated method stub
		
	}
	

}
