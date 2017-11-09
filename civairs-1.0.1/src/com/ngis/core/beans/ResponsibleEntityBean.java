package com.ngis.core.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.ngis.civairs.model.enums.ResponsibleEntityType;
import com.ngis.civairs.model.tools.HashcodeUtility;
import com.ngis.core.model.ResponsibleEntity;
import com.ngis.core.services.ResponsibleEntityService;
import com.ngis.core.services.ResponsibleEntityService2;

@ManagedBean
@SessionScoped
public class ResponsibleEntityBean {
	
	public static final String ResponsibleEntityView="/app/admin/users/responsible-entities?faces-redirect=true";
	
	@EJB
	private ResponsibleEntityService2 responsibleEntityServices;
	
	private ResponsibleEntity responsibleEntity;
	private List<ResponsibleEntity> responsibleEntities;
	private int activeIndex = 0;
	private ResponsibleEntity selectedResponsibleEntity;
	
	
	
	
	
	

	@ManagedProperty("#{responsibleEntityService}")
	private ResponsibleEntityService responsibleEntityService;
	

	private int activeResponsibleEntityIndex = 0;

	private ResponsibleEntityType selectedResponsibleEntityType;
	
	
	@PostConstruct
	public void init(){
		responsibleEntity = new ResponsibleEntity();
		responsibleEntities = new ArrayList<ResponsibleEntity>();
		responsibleEntities = responsibleEntityServices.findAllResponsibleEntity();
	}
	
	/**
	 * @return
	 */
	public String createResponsibleEntity(){
		//Set id
		String id = HashcodeUtility.hashABS31ToString(
				responsibleEntity.getName()+responsibleEntity.getEntity_Type());
		responsibleEntity.setId(id);
		
		//Set entityType
		responsibleEntity.setEntity_Type(selectedResponsibleEntityType.getId());
		responsibleEntityServices.createResponsibleEntity(responsibleEntity);
		responsibleEntity = new ResponsibleEntity();
		responsibleEntities.clear();
		responsibleEntities = responsibleEntityServices.findAllResponsibleEntity();
		return ResponsibleEntityView;
		
	}
	
	public ResponsibleEntity onTabChange(){
		selectedResponsibleEntity = responsibleEntities.get(activeIndex);
		return selectedResponsibleEntity;
	}
	
	
	
	
	

	/*public List<ResponsibleEntity> getResponsibleEntities() {
		return responsibleEntityService.getResponsibleEntities();
	}*/

	public ResponsibleEntityService getResponsibleEntityService() {
		return responsibleEntityService;
	}

	public void setResponsibleEntityService(ResponsibleEntityService responsibleEntityService) {
		this.responsibleEntityService = responsibleEntityService;
	}

	public ResponsibleEntity getResponsibleEntity() {
		return responsibleEntity;
	}

	public void setResponsibleEntity(ResponsibleEntity responsibleEntity) {
		this.responsibleEntity = responsibleEntity;
	}

	public ResponsibleEntity getSelectedResponsibleEntity() {
		return selectedResponsibleEntity;
	}

	public void setSelectedResponsibleEntity(ResponsibleEntity selectedResponsibleEntity) {
		this.selectedResponsibleEntity = selectedResponsibleEntity;
	}

	public void insertResponsibleEntity() {
		//Set id
		String id = HashcodeUtility.hashABS31ToString(responsibleEntity.getName()+responsibleEntity.getEntity_Type());
		responsibleEntity.setId(id);
		
		//Set entityType
		responsibleEntity.setEntity_Type(selectedResponsibleEntityType.getId());
		
		//Persist
		responsibleEntityService.insertResponsibleEntity(responsibleEntity);
		
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
		responsibleEntity = new ResponsibleEntity();
		
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

	/**
	 * @param responsibleEntities the responsibleEntities to set
	 */
	public void setResponsibleEntities(List<ResponsibleEntity> responsibleEntities) {
		this.responsibleEntities = responsibleEntities;
	}






	public List<ResponsibleEntity> getResponsibleEntities() {
		return responsibleEntities;
	}

	/**
	 * @return the activeIndex
	 */
	public int getActiveIndex() {
		return activeIndex;
	}

	/**
	 * @param activeIndex the activeIndex to set
	 */
	public void setActiveIndex(int activeIndex) {
		this.activeIndex = activeIndex;
	}
	
	

}
