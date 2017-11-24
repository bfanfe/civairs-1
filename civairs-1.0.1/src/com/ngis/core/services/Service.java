package com.ngis.core.services;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import com.ngis.core.exceptions.CRUDException;
import com.ngis.core.interceptors.DettachedEntityInterceptor;

@Stateless
public class Service implements IService {
	
	@PersistenceContext(unitName = "civairs_db_pu")
	protected EntityManager em;

	@Override
	public void create(Object toCreate) throws CRUDException{
		// TODO Auto-generated method stub
		try{
			em.persist(toCreate);
			em.flush();
		} catch (PersistenceException e) {
			// TODO: handle exception			
			throw new CRUDException();			
		}

	}

	@Override
	public void update(Object toUpdate) throws CRUDException {
		// TODO Auto-generated method stub
		try{
			em.merge(toUpdate);
			em.flush();
			
		} catch (PersistenceException e) {
			// TODO: handle exception
			throw new CRUDException();
			
		}

	}

	@Override
	@Interceptors(DettachedEntityInterceptor.class)
	public void delete(Object toDelete) throws CRUDException{
		// TODO Auto-generated method stub
		try{
			em.remove(toDelete);
			em.flush();
			
		} catch (PersistenceException e) {
			// TODO: handle exception
			throw new CRUDException();
			
		}

	}
	
		
	@Override
	public Object findById(String iD) {
		// TODO Auto-generated method stub
		return em.find(Object.class, iD);
	}

	

}
