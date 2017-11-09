package com.ngis.core.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

@Stateless
@LocalBean
public class Service implements IService {
	
	@PersistenceContext(unitName = "civairs_db_pu")
	protected EntityManager em;

	@Override
	public void create(Object toCreate) {
		// TODO Auto-generated method stub
		em.persist(toCreate);
		try{
			em.flush();
			
		} catch (PersistenceException e) {
			// TODO: handle exception
			//e.getCause().
			
		}

	}

	@Override
	public void update(Object toUpdate) {
		// TODO Auto-generated method stub
		em.merge(toUpdate);
		try{
			em.flush();
			
		} catch (PersistenceException e) {
			// TODO: handle exception
			//e.getCause().
			
		}

	}

	@Override
	public void delete(Object toDelete) {
		// TODO Auto-generated method stub
		em.remove(toDelete);
		try{
			em.flush();
			
		} catch (PersistenceException e) {
			// TODO: handle exception
			//e.getCause().
			
		}

	}
	
	@Override
	public Object findById(String iD) {
		// TODO Auto-generated method stub
		return em.find(Object.class, iD);
	}

	

}
