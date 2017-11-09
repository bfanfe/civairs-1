package com.ngis.civairs.model.beans.occurence;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.ngis.civairs.model.beans.SessionBean;
import com.ngis.civairs.model.enums.ResponsibleEntityType;
import com.ngis.civairs.model.services.occurence.ResponsibleEntityService;
import com.ngis.civairs.model.tools.HashcodeUtility;
import com.ngis.core.model.occurence.ResponsibleEntity;

@ManagedBean
@SessionScoped
public class ResponsibleEntityBean {

	@ManagedProperty("#{responsibleEntityService}")
	private ResponsibleEntityService responsibleEntityService;

	private ResponsibleEntity selectedResponsibleEntity;

	private ResponsibleEntity responsibleEntityToCreate;

	private int activeResponsibleEntityIndex = 0;

	private ResponsibleEntityType selectedResponsibleEntityType;

	public List<ResponsibleEntity> getResponsibleEntities() {
		return responsibleEntityService.getResponsibleEntities();
	}

	public ResponsibleEntityService getResponsibleEntityService() {
		return responsibleEntityService;
	}

	public void setResponsibleEntityService(ResponsibleEntityService responsibleEntityService) {
		this.responsibleEntityService = responsibleEntityService;
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

	public void insertResponsibleEntity() {
		//Set id
		String id = HashcodeUtility.hashABS31ToString(responsibleEntityToCreate.getName()+responsibleEntityToCreate.getEntity_Type());
		responsibleEntityToCreate.setId(id);
		
		//Set entityType
		responsibleEntityToCreate.setEntity_Type(selectedResponsibleEntityType.getId());
		
		//Persist
		responsibleEntityService.insertResponsibleEntity(responsibleEntityToCreate);
		
		//Back to Responsible Entities view
		backToResponsibleEntitiesView();
	}

	public void updateResponsibleEntity() {
		//Set entityType
		selectedResponsibleEntity.setEntity_Type(selectedResponsibleEntityType.getId());
		
		//Persist
		responsibleEntityService.updateResponsibleEntity(selectedResponsibleEntity);
		
		//Back to Responsible Entities view
		backToResponsibleEntitiesView();

	}

	public void deleteResponsibleEntity() {
		responsibleEntityService.deleteResponsibleEntity(selectedResponsibleEntity);

	}
	
	public void initResponsibleEntityToCreate(){
		responsibleEntityToCreate = new ResponsibleEntity();
		
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
		session.loadViewResponsibleEntityCreate();
	}

	public void selectResponsibleEntityToUpdate(String ID) {
		selectedResponsibleEntity = null;
		for (ResponsibleEntity entity : getResponsibleEntities()) {
			if (entity.getId().equals(ID)) {
				selectedResponsibleEntity = entity;
			}
		}
		if (selectedResponsibleEntity != null) {
			selectedResponsibleEntityType = responsibleEntityService.getResponsibleEntityTypesMap().get(selectedResponsibleEntity.getEntity_Type());
			ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
			SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
			session.loadViewResponsibleEntityUpdate();

		}
		// if(selectedResponsibleEntity != null) updateResponsibleEntity();

	}
	
	public void selectResponsibleEntityToDelete(String ID){
		selectedResponsibleEntity = null;
		for (ResponsibleEntity entity : getResponsibleEntities()) {
			if (entity.getId().equals(ID)) {
				selectedResponsibleEntity = entity;
			}
		}
		if (selectedResponsibleEntity != null){
			responsibleEntityService.deleteResponsibleEntity(selectedResponsibleEntity);
			backToResponsibleEntitiesView();
		}
	}
	

	public void backToResponsibleEntitiesView() {
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
		session.loadViewResponsibleEntities();

	}

	public List<ResponsibleEntityType> getResponsibleEntityTypes() {
		return responsibleEntityService.getResponsibleEntityTypes();
	}

	public ResponsibleEntityType getSelectedResponsibleEntityType() {
		return selectedResponsibleEntityType;
	}

	public void setResponsibleEntityTypes(List<ResponsibleEntityType> responsibleEntityTypes) {
		responsibleEntityService.setResponsibleEntityTypes(responsibleEntityTypes);
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

}
