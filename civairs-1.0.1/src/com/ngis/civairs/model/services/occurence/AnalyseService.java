package com.ngis.civairs.model.services.occurence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import com.ngis.civairs.entities.Analyse;
import com.ngis.civairs.entities.StaticATMContribution;
import com.ngis.civairs.entities.StaticEffectOnATMService;
import com.ngis.civairs.entities.StaticEventFrequency;
import com.ngis.civairs.entities.StaticOccurrenceCategory;
import com.ngis.civairs.entities.StaticOccurrenceClass;
import com.ngis.civairs.entities.StaticOccurrenceStatus;
import com.ngis.civairs.model.constants.NGConstants;
import com.ngis.civairs.model.dao.occurence.AnalyseDAO;
import com.ngis.civairs.model.dao.occurence.NotificationDAO;
import com.ngis.civairs.model.dao.occurence.StaticATMContributionDAO;
import com.ngis.civairs.model.dao.occurence.StaticEffectOnATMServiceDAO;
import com.ngis.civairs.model.dao.occurence.StaticEventFrequencyDAO;
import com.ngis.civairs.model.dao.occurence.StaticOccurrenceCategoryDAO;
import com.ngis.civairs.model.dao.occurence.StaticOccurrenceClassDAO;
import com.ngis.civairs.model.dao.occurence.StaticOccurrenceStatusDAO;
import com.ngis.civairs.model.services.NGMessageService;
import com.ngis.core.beans.SessionBean;

@ManagedBean
@SessionScoped
public class AnalyseService {
	
	private List<Analyse> analyses;
	
	private List<StaticOccurrenceClass> staticOccurrenceClasses;
	private Map<String, StaticOccurrenceClass> staticOccurrenceClassesMap;
	
	private List<StaticOccurrenceStatus> staticOccurrenceStatus;
	private Map<String, StaticOccurrenceStatus> staticOccurrenceStatusMap;
	
	private List<StaticATMContribution> staticATMContributions;
	private Map<String, StaticATMContribution> staticATMContributionsMap;
	
	private List<StaticEventFrequency> staticEventFrequencies;
	private Map<String, StaticEventFrequency> staticEventFrequenciesMap;
	
	private List<StaticEffectOnATMService> staticEffectOnATMServices;
	private Map<String, StaticEffectOnATMService> staticEffectOnATMServicesMap;
	
	private List<StaticOccurrenceCategory> staticOccurrenceCategories;
	private Map<String, StaticOccurrenceCategory> staticOccurrenceCategoriesMap;


	@EJB
	private AnalyseDAO dao;
	
	@EJB
	private StaticOccurrenceClassDAO staticOccurrenceClassDAO;
	
	@EJB
	private StaticOccurrenceStatusDAO staticOccurrenceStatusDAO;
	
	@EJB
	private StaticATMContributionDAO staticATMContributionDAO;
	
	@EJB
	private StaticEventFrequencyDAO staticEventFrequencyDAO;
	
	@EJB
	private StaticEffectOnATMServiceDAO staticEffectOnATMServiceDAO;
	
	@EJB
	private StaticOccurrenceCategoryDAO staticOccurrenceCategoryDAO;
	
	@EJB
	private NotificationDAO notificationDAO;
	
		
	@PostConstruct
	private void init(){
		loadAnalyses();
		loadStaticOccuerrenceClasses();
		loadStaticOccuerrenceStatus();
		loadStaticATMContributions();
		loadStaticEventFrequencies();
		loadStaticEffectOnATMServices();
		loadStaticOccuerrenceCategories();
	}
	
		
	public List<Analyse> getAnalyses() {
		return analyses;
	}


	public void setAnalyses(List<Analyse> analyses) {
		this.analyses = analyses;
	}
	

	public List<StaticOccurrenceCategory> getStaticOccurrenceCategories() {
		return staticOccurrenceCategories;
	}


	public void setStaticOccurrenceCategories(List<StaticOccurrenceCategory> staticOccurrenceCategories) {
		this.staticOccurrenceCategories = staticOccurrenceCategories;
	}


	public Map<String, StaticOccurrenceCategory> getStaticOccurrenceCategoriesMap() {
		return staticOccurrenceCategoriesMap;
	}


	public void setStaticOccurrenceCategoriesMap(Map<String, StaticOccurrenceCategory> staticOccurrenceCategoriesMap) {
		this.staticOccurrenceCategoriesMap = staticOccurrenceCategoriesMap;
	}


	public List<StaticEffectOnATMService> getStaticEffectOnATMServices() {
		return staticEffectOnATMServices;
	}


	public void setStaticEffectOnATMServices(List<StaticEffectOnATMService> staticEffectOnATMServices) {
		this.staticEffectOnATMServices = staticEffectOnATMServices;
	}


	public Map<String, StaticEffectOnATMService> getStaticEffectOnATMServicesMap() {
		return staticEffectOnATMServicesMap;
	}


	public void setStaticEffectOnATMServicesMap(Map<String, StaticEffectOnATMService> staticEffectOnATMServicesMap) {
		this.staticEffectOnATMServicesMap = staticEffectOnATMServicesMap;
	}


	public List<StaticEventFrequency> getStaticEventFrequencies() {
		return staticEventFrequencies;
	}


	public void setStaticEventFrequencies(List<StaticEventFrequency> staticEventFrequencies) {
		this.staticEventFrequencies = staticEventFrequencies;
	}


	public Map<String, StaticEventFrequency> getStaticEventFrequenciesMap() {
		return staticEventFrequenciesMap;
	}


	public void setStaticEventFrequenciesMap(Map<String, StaticEventFrequency> staticEventFrequenciesMap) {
		this.staticEventFrequenciesMap = staticEventFrequenciesMap;
	}


	public List<StaticATMContribution> getStaticATMContributions() {
		return staticATMContributions;
	}


	public void setStaticATMContributions(List<StaticATMContribution> staticATMContributions) {
		this.staticATMContributions = staticATMContributions;
	}


	public Map<String, StaticATMContribution> getStaticATMContributionsMap() {
		return staticATMContributionsMap;
	}


	public void setStaticATMContributionsMap(Map<String, StaticATMContribution> staticATMContributionsMap) {
		this.staticATMContributionsMap = staticATMContributionsMap;
	}


	public List<StaticOccurrenceStatus> getStaticOccurrenceStatus() {
		return staticOccurrenceStatus;
	}


	public void setStaticOccurrenceStatus(List<StaticOccurrenceStatus> staticOccurrenceStatus) {
		this.staticOccurrenceStatus = staticOccurrenceStatus;
	}


	public Map<String, StaticOccurrenceStatus> getStaticOccurrenceStatusMap() {
		return staticOccurrenceStatusMap;
	}


	public void setStaticOccurrenceStatusMap(Map<String, StaticOccurrenceStatus> staticOccurrenceStatusMap) {
		this.staticOccurrenceStatusMap = staticOccurrenceStatusMap;
	}


	public List<StaticOccurrenceClass> getStaticOccurrenceClasses() {
		return staticOccurrenceClasses;
	}

	public void setStaticOccurrenceClasses(List<StaticOccurrenceClass> staticOccurrenceClasses) {
		this.staticOccurrenceClasses = staticOccurrenceClasses;
	}

	
	public Map<String, StaticOccurrenceClass> getStaticOccurrenceClassesMap() {
		return staticOccurrenceClassesMap;
	}

	public void setStaticOccurrenceClassesMap(Map<String, StaticOccurrenceClass> staticOccurrenceClassesMap) {
		this.staticOccurrenceClassesMap = staticOccurrenceClassesMap;
	}
	
	public void loadStaticEffectOnATMServices(){
		staticEffectOnATMServices = staticEffectOnATMServiceDAO.selectAll();
		staticEffectOnATMServicesMap = new HashMap<String, StaticEffectOnATMService>();
		for(int i=0; i<staticEffectOnATMServices.size(); i++ ){
			staticEffectOnATMServicesMap.put(staticEffectOnATMServices.get(i).getValueID(), staticEffectOnATMServices.get(i));
		}
	}
	
	public void loadStaticEventFrequencies(){
		staticEventFrequencies = staticEventFrequencyDAO.selectAll();
		staticEventFrequenciesMap = new HashMap<String, StaticEventFrequency>();
		for(int i=0; i<staticEventFrequencies.size(); i++ ){
			staticEventFrequenciesMap.put(staticEventFrequencies.get(i).getValueID(), staticEventFrequencies.get(i));
		}
	}
	
	public void loadStaticATMContributions(){
		staticATMContributions = staticATMContributionDAO.selectAll();
		staticATMContributionsMap = new HashMap<String, StaticATMContribution>();
		for(int i=0; i<staticATMContributions.size(); i++ ){
			staticATMContributionsMap.put(staticATMContributions.get(i).getValueID(), staticATMContributions.get(i));
		}
	}
	
	public void loadStaticOccuerrenceCategories(){
		staticOccurrenceCategories = staticOccurrenceCategoryDAO.selectAll();
		staticOccurrenceCategoriesMap = new HashMap<String, StaticOccurrenceCategory>();
		for(int i=0; i<staticOccurrenceCategories.size(); i++ ){
			staticOccurrenceCategoriesMap.put(staticOccurrenceCategories.get(i).getValueID(), staticOccurrenceCategories.get(i));
		}
	}
	
	public void loadStaticOccuerrenceClasses(){
		staticOccurrenceClasses = staticOccurrenceClassDAO.selectAll();
		staticOccurrenceClassesMap = new HashMap<String, StaticOccurrenceClass>();
		for(int i=0; i<staticOccurrenceClasses.size(); i++ ){
			staticOccurrenceClassesMap.put(staticOccurrenceClasses.get(i).getValueID(), staticOccurrenceClasses.get(i));
		}
	}
	
	public void loadStaticOccuerrenceStatus(){
		staticOccurrenceStatus = staticOccurrenceStatusDAO.selectAll();
		staticOccurrenceStatusMap = new HashMap<String, StaticOccurrenceStatus>();
		for(int i=0; i<staticOccurrenceStatus.size(); i++ ){
			staticOccurrenceStatusMap.put(staticOccurrenceStatus.get(i).getValueID(), staticOccurrenceStatus.get(i));
		}
	}


	public void loadAnalyses(){
		//check session user ResponsibleEntity
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
		
		//Check if user has role Administrator or System Manager, then load all Notifications
		Subject currentUser = SecurityUtils.getSubject();
		if(currentUser.hasRole(NGConstants.ROLE_ADMINISTRATOR) || currentUser.hasRole(NGConstants.ROLE_SYSTEM_MANAGER)){
			analyses = dao.selectAll();
		}else{
			//Load only the Notifications reported by the user's Responsible Entity
			String entityId = session.getSessionUser().getResponsibleEntity().getId();
			analyses = dao.selectAllByEntity(entityId);
		}
	}
	
	

	/**
	 * persist a Notification
	 * @param toInsert
	 */
	
	public void setAnalyseDetails(Analyse details){
		if(details.getStaticAtmContribution() != null) details.setATM_Contribution(details.getStaticAtmContribution().getValueID());
		if(details.getStaticEffectOnAtmService() != null) details.setEffect_On_ATM_Service(details.getStaticEffectOnAtmService().getValueID());
		if(details.getStaticEventFrequency() != null) details.setEvent_Frequency(details.getStaticEventFrequency().getValueID());
		if(details.getStaticOccurrenceClass() != null) details.setOccurrence_Class(details.getStaticOccurrenceClass().getValueID());
		if(details.getStaticOccurrenceStatus() != null) details.setOccurrence_Status(details.getStaticOccurrenceStatus().getValueID());
		
	}
	
	public void insertAnalyse(Analyse toInsert){
		if(toInsert != null){
			setAnalyseDetails(toInsert);
			String daoResult = dao.insert(toInsert);
			daoResult = dao.update(toInsert);
			NGMessageService.addMessage(daoResult);
			loadAnalyses();
		}
		
	}
	
	/**
	 * update a Analyse
	 * @param toUpdate
	 */
	public void updateAnalyse(Analyse toUpdate){
		setAnalyseDetails(toUpdate);
		String daoResult = dao.update(toUpdate);
		NGMessageService.addMessage(daoResult);
		loadAnalyses();
	}
	
		
	/**
	 * Remove a Analyse
	 * @param toDelete
	 */
	public void deleteAnalyse(Analyse toDelete){
		String daoResult = dao.delete(toDelete);
		NGMessageService.addMessage(daoResult);
		loadAnalyses();
	}
	

}
