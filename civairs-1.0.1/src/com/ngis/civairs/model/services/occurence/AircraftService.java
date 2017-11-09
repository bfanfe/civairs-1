package com.ngis.civairs.model.services.occurence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.ngis.civairs.entities.StaticFlightPhase;
import com.ngis.civairs.entities.StaticManufacturerModel;
import com.ngis.civairs.entities.StaticOperationType;
import com.ngis.civairs.model.dao.occurence.StaticFlightPhaseDAO;
import com.ngis.civairs.model.dao.occurence.StaticManufacturerModelDAO;
import com.ngis.civairs.model.dao.occurence.StaticOperationTypeDAO;

@ManagedBean
@SessionScoped
public class AircraftService {
	
	private List<StaticManufacturerModel> staticManufacturerModels;
	
	private Map<String, StaticManufacturerModel> staticManufacturerModelsMap;
	
	private List<StaticFlightPhase> staticFlightPhases;
	
	private Map<String, StaticFlightPhase> staticFlightPhasesMap;
	
	private List<StaticOperationType> staticOperationTypes;
	
	private Map<String, StaticOperationType> staticOperationTypesMap;

	@EJB
	private StaticManufacturerModelDAO staticManufacturerModelDAO;
	
	@EJB
	private StaticFlightPhaseDAO staticFlightPhaseDAO;
	
	@EJB
	private StaticOperationTypeDAO staticOperationTypeDAO;
	
	@PostConstruct
	private void init(){
		loadStaticManufacturerModels();
		loadStaticFlightPhases();
		loadStaticOperationTypes();
	}
	
	
	public void loadStaticManufacturerModels(){
		staticManufacturerModels = staticManufacturerModelDAO.selectAll();
		staticManufacturerModelsMap = new HashMap<String, StaticManufacturerModel>();
		for(int i=0; i<staticManufacturerModels.size(); i++ ){
			staticManufacturerModelsMap.put(staticManufacturerModels.get(i).getValueID(), staticManufacturerModels.get(i));
		}
	}

	public void loadStaticFlightPhases(){
		staticFlightPhases = staticFlightPhaseDAO.selectAll();
		staticFlightPhasesMap = new HashMap<String, StaticFlightPhase>();
		for(int i=0; i<staticFlightPhases.size(); i++ ){
			staticFlightPhasesMap.put(staticFlightPhases.get(i).getValueID(), staticFlightPhases.get(i));
		}
	}
	
	public void loadStaticOperationTypes(){
		staticOperationTypes = staticOperationTypeDAO.selectAll();
		staticOperationTypesMap = new HashMap<String, StaticOperationType>();
		for(int i=0; i<staticOperationTypes.size(); i++ ){
			staticOperationTypesMap.put(staticOperationTypes.get(i).getValueID(), staticOperationTypes.get(i));
		}
	}

	public List<StaticManufacturerModel> getStaticManufacturerModels() {
		return staticManufacturerModels;
	}


	public Map<String, StaticManufacturerModel> getStaticManufacturerModelsMap() {
		return staticManufacturerModelsMap;
	}


	public void setStaticManufacturerModels(List<StaticManufacturerModel> staticManufacturerModels) {
		this.staticManufacturerModels = staticManufacturerModels;
	}


	public void setStaticManufacturerModelsMap(Map<String, StaticManufacturerModel> staticManufacturerModelsMap) {
		this.staticManufacturerModelsMap = staticManufacturerModelsMap;
	}


	public List<StaticFlightPhase> getStaticFlightPhases() {
		return staticFlightPhases;
	}


	public Map<String, StaticFlightPhase> getStaticFlightPhasesMap() {
		return staticFlightPhasesMap;
	}


	public void setStaticFlightPhases(List<StaticFlightPhase> staticFlightPhases) {
		this.staticFlightPhases = staticFlightPhases;
	}


	public void setStaticFlightPhasesMap(Map<String, StaticFlightPhase> staticFlightPhasesMap) {
		this.staticFlightPhasesMap = staticFlightPhasesMap;
	}


	public List<StaticOperationType> getStaticOperationTypes() {
		return staticOperationTypes;
	}


	public Map<String, StaticOperationType> getStaticOperationTypesMap() {
		return staticOperationTypesMap;
	}


	public void setStaticOperationTypes(List<StaticOperationType> staticOperationTypes) {
		this.staticOperationTypes = staticOperationTypes;
	}


	public void setStaticOperationTypesMap(Map<String, StaticOperationType> staticOperationTypesMap) {
		this.staticOperationTypesMap = staticOperationTypesMap;
	}


	
	


	/**
	 * persist a ResponsibleEntity
	 * @param toInsert
	 */
	
	
	
	/**
	 * update a ResponsibleEntity
	 * @param toUpdate
	 */
	
	
	/**
	 * Remove a ResponsibleEntity
	 * @param toDelete
	 */
	/*public void deleteResponsibleEntity(ResponsibleEntity toDelete){
		String daoResult = dao.delete(toDelete);
		NGMessageService.addMessage(daoResult);
		loadResponsibleEntities();
	}*/
	

}
