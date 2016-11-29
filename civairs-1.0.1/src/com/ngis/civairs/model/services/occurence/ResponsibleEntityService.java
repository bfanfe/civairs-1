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
	
	private List<ResponsibleEntityType> responsibleEntityTipes;
	
	private Map<String, ResponsibleEntityType> responsibleEntityTypesMap;

	@EJB
	private ResponsibleEntityDAO dao;
	
	@PostConstruct
	private void init(){
		loadResponsibleEntities();
		
		responsibleEntityTipes = new ArrayList<ResponsibleEntityType>();
		for(EnumResponsibleEntityType enumVal : EnumResponsibleEntityType.values()){
			responsibleEntityTipes.add(new ResponsibleEntityType(enumVal.getId(), enumVal.getValue()));
		}
		
		responsibleEntityTypesMap = new HashMap<String, ResponsibleEntityType>();
		for(int i=0; i<responsibleEntityTipes.size(); i++ ){
			responsibleEntityTypesMap.put(responsibleEntityTipes.get(i).getId(), responsibleEntityTipes.get(i));
		}
	}
	
	
	public void loadResponsibleEntities(){
		responsibleEntities = dao.selectAll();	
	}


	public List<ResponsibleEntity> getResponsibleEntities() {
		return responsibleEntities;
	}


	public void setResponsibleEntities(List<ResponsibleEntity> responsibleEntities) {
		this.responsibleEntities = responsibleEntities;
	}
	
	
	
	
	public List<ResponsibleEntityType> getResponsibleEntityTipes() {
		return responsibleEntityTipes;
	}


	public void setResponsibleEntityTipes(List<ResponsibleEntityType> responsibleEntityTipes) {
		this.responsibleEntityTipes = responsibleEntityTipes;
	}


	public Map<String, ResponsibleEntityType> getResponsibleEntityTypesMap() {
		return responsibleEntityTypesMap;
	}


	public void setResponsibleEntityTypesMap(Map<String, ResponsibleEntityType> responsibleEntityTypesMap) {
		this.responsibleEntityTypesMap = responsibleEntityTypesMap;
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
