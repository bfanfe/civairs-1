package com.ngis.core.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.ngis.civairs.model.enums.ResponsibleEntityType;
import com.ngis.core.exceptions.ServiceException;
import com.ngis.core.model.ResponsibleEntity;
import com.ngis.core.services.MessageService;
import com.ngis.core.services.ResponsibleEntityService;

@ManagedBean
@SessionScoped
public class ResponsibleEntityBean {

	public static final String RESPONSIBLE_ENTITIES_VIEW = "/app/admin/users/responsible-entities?faces-redirect=true";
	public static final String RESPONSIBLE_ENTITY_CREATE_VIEW = "/app/admin/users/responsible-entity-create-view?faces-redirect=true";
	public static final String RESPONSIBLE_ENTITY_UPDATE_VIEW = "/app/admin/users/responsible-entity-update-view?faces-redirect=true";
	
	private ResponsibleEntity selectedResponsibleEntity;

	private ResponsibleEntity responsibleEntityToCreate;

	private int activeResponsibleEntityIndex = 0;

	private ResponsibleEntityType selectedResponsibleEntityType;

	public List<ResponsibleEntity> responsibleEntityList;
	
	public List<ResponsibleEntityType> responsibleEntityTypeList;

	
	@EJB
	MessageService messageService;
	
	@EJB
	ResponsibleEntityService responsibleEntityService;
	
	@PostConstruct
	private void init() {
		responsibleEntityList = responsibleEntityService.findAll();
		responsibleEntityTypeList = responsibleEntityService.findTypes();
	}
	
	public ResponsibleEntity getResponsibleEntityToCreate() {
		return responsibleEntityToCreate;
	}

	public void setResponsibleEntityToCreate(ResponsibleEntity responsibleEntityToCreate) {
		this.responsibleEntityToCreate = responsibleEntityToCreate;
	}

	public ResponsibleEntity getSelectedResponsibleEntity() {
		return selectedResponsibleEntity;
	}

	public void setSelectedResponsibleEntity(ResponsibleEntity selectedResponsibleEntity) {
		this.selectedResponsibleEntity = selectedResponsibleEntity;
	}

	public String createResponsibleEntity() {
		
		//Set entityType
		responsibleEntityToCreate.setEntity_Type(selectedResponsibleEntityType.getId());
		
		//Persist
		responsibleEntityService.create(responsibleEntityToCreate);
		responsibleEntityList = responsibleEntityService.findAll();
		//Back to Responsible Entities view
		return RESPONSIBLE_ENTITIES_VIEW;
	}

	public String updateResponsibleEntity() {
		//Set entityType
		selectedResponsibleEntity.setEntity_Type(selectedResponsibleEntityType.getId());
		
		responsibleEntityService.update(selectedResponsibleEntity);
		responsibleEntityList = responsibleEntityService.findAll();
		//Back to Responsible Entities view
		return RESPONSIBLE_ENTITIES_VIEW;
	}

	public String deleteResponsibleEntity() {
		responsibleEntityService.delete(selectedResponsibleEntity);
		responsibleEntityList = responsibleEntityService.findAll();
		return RESPONSIBLE_ENTITIES_VIEW;
	}
	
	public String initResponsibleEntityToCreate(){
		responsibleEntityToCreate = new ResponsibleEntity();
		return RESPONSIBLE_ENTITY_CREATE_VIEW;
	}

	public String selectResponsibleEntityToUpdate(String ID) {
		selectedResponsibleEntity = responsibleEntityService.findById(ID);
		try{
			selectedResponsibleEntityType = responsibleEntityService.findTypeByEntity(selectedResponsibleEntity);
			return RESPONSIBLE_ENTITY_UPDATE_VIEW;
		}catch(ServiceException e){
			return null;
		}

	}
	
	public String selectResponsibleEntityToDelete(String ID){
		selectedResponsibleEntity = null;
		for (ResponsibleEntity entity : getResponsibleEntityList()) {
			if (entity.getId().equals(ID)) {
				selectedResponsibleEntity = entity;
			}
		}
		if (selectedResponsibleEntity != null){
			responsibleEntityService.delete(selectedResponsibleEntity);
			responsibleEntityList = responsibleEntityService.findAll();
			return RESPONSIBLE_ENTITIES_VIEW;
		}else return null;
	}
	

	public ResponsibleEntityType getSelectedResponsibleEntityType() {
		return selectedResponsibleEntityType;
	}


	public void setSelectedResponsibleEntityType(ResponsibleEntityType selectedResponsibleEntityType) {
		this.selectedResponsibleEntityType = selectedResponsibleEntityType;
	}

	public int getActiveResponsibleEntityIndex() {
		return activeResponsibleEntityIndex;
	}

	public void setActiveResponsibleEntityIndex(int activeResponsibleEntityIndex) {
		this.activeResponsibleEntityIndex = activeResponsibleEntityIndex;
	}

	public List<ResponsibleEntity> getResponsibleEntityList() {
		return responsibleEntityList;
	}

	public void setResponsibleEntityList(List<ResponsibleEntity> responsibleEntityList) {
		this.responsibleEntityList = responsibleEntityList;
	}

	public List<ResponsibleEntityType> getResponsibleEntityTypeList() {
		return responsibleEntityTypeList;
	}

	public void setResponsibleEntityTypeList(List<ResponsibleEntityType> responsibleEntityTypeList) {
		this.responsibleEntityTypeList = responsibleEntityTypeList;
	}

	
}
