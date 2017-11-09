package com.ngis.core.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import com.ngis.civairs.applicationException.CRUDException;
import com.ngis.civairs.model.dao.occurence.ResponsibleEntityDAO;
import com.ngis.civairs.model.enums.EnumResponsibleEntityType;
import com.ngis.civairs.model.enums.ResponsibleEntityType;
import com.ngis.civairs.model.services.NGMessageService;
import com.ngis.core.model.ResponsibleEntity;

@ManagedBean
@SessionScoped
@Stateless
public class ResponsibleEntityService implements IResponsibleEntity{
	
	@PersistenceContext(unitName = "civairs_db_pu")
	private EntityManager em;
	
	
	
	
	private List<ResponsibleEntity> responsibleEntities;
	
	private List<ResponsibleEntityType> responsibleEntityTypes;
	
	private Map<String, ResponsibleEntityType> responsibleEntityTypesMap;
	
	private Map<String, ResponsibleEntity> responsibleEntitiesMap;

	@EJB
	private ResponsibleEntityDAO dao;
	
	@PostConstruct
	private void init(){
		loadResponsibleEntities();
		
		responsibleEntityTypes = new ArrayList<ResponsibleEntityType>();
		for(EnumResponsibleEntityType enumVal : EnumResponsibleEntityType.values()){
			responsibleEntityTypes.add(new ResponsibleEntityType(enumVal.getId(), enumVal.getValue()));
		}
		
		responsibleEntityTypesMap = new HashMap<String, ResponsibleEntityType>();
		for(int i=0; i<responsibleEntityTypes.size(); i++ ){
			responsibleEntityTypesMap.put(responsibleEntityTypes.get(i).getId(), responsibleEntityTypes.get(i));
		}
	}
	
	
	public void loadResponsibleEntities(){
		responsibleEntities = dao.selectAll();
		responsibleEntitiesMap = new HashMap<String, ResponsibleEntity>();
		for(int i=0; i<responsibleEntities.size(); i++ ){
			responsibleEntitiesMap.put(responsibleEntities.get(i).getId(), responsibleEntities.get(i));
		}
	}


	public List<ResponsibleEntity> getResponsibleEntities() {
		return responsibleEntities;
	}


	public void setResponsibleEntities(List<ResponsibleEntity> responsibleEntities) {
		this.responsibleEntities = responsibleEntities;
	}
	
	
	
	
	public List<ResponsibleEntityType> getResponsibleEntityTypes() {
		return responsibleEntityTypes;
	}


	public void setResponsibleEntityTypes(List<ResponsibleEntityType> responsibleEntityTipes) {
		this.responsibleEntityTypes = responsibleEntityTipes;
	}


	public Map<String, ResponsibleEntityType> getResponsibleEntityTypesMap() {
		return responsibleEntityTypesMap;
	}


	public void setResponsibleEntityTypesMap(Map<String, ResponsibleEntityType> responsibleEntityTypesMap) {
		this.responsibleEntityTypesMap = responsibleEntityTypesMap;
	}
	
	


	public Map<String, ResponsibleEntity> getResponsibleEntitiesMap() {
		return responsibleEntitiesMap;
	}


	public void setResponsibleEntitiesMap(Map<String, ResponsibleEntity> responsibleEntitiesMap) {
		this.responsibleEntitiesMap = responsibleEntitiesMap;
	}


	/**
	 * persist a ResponsibleEntity
	 * @param toInsert
	 */
	
	public void insertResponsibleEntity(ResponsibleEntity toInsert){
		String daoResult = dao.insert(toInsert);
		NGMessageService.addMessage(daoResult);
		loadResponsibleEntities();
	}
	
	/**
	 * update a ResponsibleEntity
	 * @param toUpdate
	 */
	public void updateResponsibleEntity(ResponsibleEntity toUpdate){
		String daoResult = dao.update(toUpdate);
		NGMessageService.addMessage(daoResult);
		loadResponsibleEntities();
	}
	
	/**
	 * Remove a ResponsibleEntity
	 * @param toDelete
	 */
	public void deleteResponsibleEntity(ResponsibleEntity toDelete){
		String daoResult = dao.delete(toDelete);
		NGMessageService.addMessage(daoResult);
		loadResponsibleEntities();
	}


	

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
	

}
