package com.ngis.civairs.model.services.occurence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.ngis.civairs.model.dao.occurence.ResponsibleEntityDAO;
import com.ngis.civairs.model.entities.occurence.ResponsibleEntity;
import com.ngis.civairs.model.enums.EnumResponsibleEntityType;
import com.ngis.civairs.model.enums.ResponsibleEntityType;
import com.ngis.civairs.model.services.NGMessageService;

@ManagedBean
@SessionScoped
public class ResponsibleEntityService {
	
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
	

}
