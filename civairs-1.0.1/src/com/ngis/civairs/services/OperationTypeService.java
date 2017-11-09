package com.ngis.civairs.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ngis.civairs.entities.StaticOperationType;
import com.ngis.civairs.model.statics.StaticAircraft.ATTRIBUTES.OperationType;

@Stateless
public class OperationTypeService implements IOperationType {

	@PersistenceContext(unitName = "civairs_db_pu")
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<StaticOperationType> findAllOperationType() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT n FROM StaticOperationType n").getResultList();
	}

	@Override
	public StaticOperationType findOperationTypeById(String valueID) {
		// TODO Auto-generated method stub
		return em.find(StaticOperationType.class, valueID);
	}

}
