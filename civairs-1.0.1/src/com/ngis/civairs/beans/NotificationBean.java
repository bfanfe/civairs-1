package com.ngis.civairs.beans;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.FacesEvent;

import org.primefaces.component.tabview.Tab;
import org.primefaces.context.RequestContext;
import org.primefaces.event.TabChangeEvent;
import org.primefaces.event.TabCloseEvent;
import org.primefaces.event.TabEvent;

import com.ngis.civairs.applicationException.CRUDException;
import com.ngis.civairs.entities.Aircraft;
import com.ngis.civairs.entities.AircraftInvolved;
import com.ngis.civairs.entities.Analyse;
import com.ngis.civairs.entities.Identifier;
import com.ngis.civairs.entities.Notification;
import com.ngis.civairs.entities.StaticATMContribution;
import com.ngis.civairs.entities.StaticAirspaceClass;
import com.ngis.civairs.entities.StaticEffectOnATMService;
import com.ngis.civairs.entities.StaticEventFrequency;
import com.ngis.civairs.entities.StaticFlightPhase;
import com.ngis.civairs.entities.StaticManufacturerModel;
import com.ngis.civairs.entities.StaticOccurrenceCategory;
import com.ngis.civairs.entities.StaticOccurrenceClass;
import com.ngis.civairs.entities.StaticOccurrenceStatus;
import com.ngis.civairs.entities.StaticOperationType;
import com.ngis.civairs.model.constants.NGConstants;
import com.ngis.civairs.model.enums.EnumAirspaceClass;
import com.ngis.civairs.model.services.occurence.AircraftService;
import com.ngis.civairs.model.services.occurence.AnalyseService;
import com.ngis.civairs.model.services.occurence.NotificationService;
import com.ngis.civairs.model.tools.HashcodeUtility;
import com.ngis.civairs.services.INotification;
import com.ngis.civairs.services.IOperationType;
import com.ngis.core.beans.SessionBean;



@ManagedBean
@SessionScoped
public class NotificationBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	private INotification notificationServices;
	
	@EJB
	private IOperationType operationTypeServices;

	private Notification notification;
	private List<Notification> notifications;
	private List<StaticOperationType> operationTypes;
	private Aircraft aircraft;
	private List<Aircraft> aircrafts;
	private String aircraftTabTitle = "Aircraft";
	

	@ManagedProperty("#{notificationService}")
	private NotificationService notificationService;

	@ManagedProperty("#{aircraftService}")
	private AircraftService aircraftService;
	
	@ManagedProperty("#{analyseService}")
	private AnalyseService analyseService;

	private String updateDisabled = "true";

	private Notification selectedNotification;

	private Notification notificationToCreate;

	private int activeNotificationIndex = 0;

	private int activeNotificationAircraftIndex = 0;

	private int aircraftNumber = 1;
	
	private int tabIndex = 1;
	
	
	@PostConstruct
	public void init(){
		
		aircrafts = new ArrayList<Aircraft>();
		aircrafts.add(new Aircraft());
		
		notification = new Notification();
		notification.setAircrafts(aircrafts); 
		
		notifications = new ArrayList<Notification>();
		notifications = notificationServices.findAllNotification();
		
		operationTypes = new ArrayList<StaticOperationType>();
		operationTypes = operationTypeServices.findAllOperationType();
		
	}
	
	@PreDestroy
	public void destroy(){
		notification = null;
	}
	
	/*public void createAircraft() {
		if(aircrafts.contains(aircraft)) {
            FacesMessage msg = new FacesMessage("Dublicated", "This aircraft has already been added");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } 
        else {
            aircrafts.add(aircraft);
            aircraft = new Aircraft();
        }
	}*/
	
	public String reinitAircraft(){
		setAircraft(new Aircraft());
		return null;
	}
	
	public void onTabClose(TabCloseEvent event) {
		aircrafts.remove(event.getData());
		FacesMessage msg = new FacesMessage("Tab Closed", "Closed tab: " + event.getTab().getTitle()+"Nb: "+notification.getAircrafts().size());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
	
	public Notification prepareSave(){
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
		
		String fileNumber = HashcodeUtility
				.hashABS31ToString("" + notification.getUtcDate() + notification.getUtcTime());
		
		Identifier notificationIdentifier = new Identifier();
		notificationIdentifier.setFile_Number(fileNumber);
		notificationIdentifier.setResponsibleEntity(session.getSessionUser().getResponsibleEntity());
		notificationIdentifier.setId(session.getSessionUser().getResponsibleEntity().getId() + "-" + fileNumber);

		// Set Notification Id to Identifier's one
		notification.setId(notificationIdentifier.getId());

		// Set reportingTime
		notification.setReportingTime(Date.from(Instant.now()));

		// Set status to NewNotification
		notification.setStatus(NGConstants.NOTIFICATION_STATUS_NEW);

		// Add aircraft to notification

		for (Aircraft ac : notification.getAircrafts()) {
			if (ac.getId() == null) {
				String acId = HashcodeUtility
						.hashABS31ToString("" + notification.getId() + ac.getAircraft_Registration());
				ac.setId(acId);
			}
		}

		// Add notification to identifier
		notificationIdentifier.addNotification(notification);

		// Persist identifier
		notificationService.insertNotificationByIdentifier(notificationIdentifier);

		return notification;
	}
	
	public void saveNotification() {
		try{
			notificationServices.createNotification(notification, aircrafts);
			notification = new Notification();
			RequestContext.getCurrentInstance().update("createNotificationForm");
		}catch(CRUDException e){
			RequestContext.getCurrentInstance().showMessageInDialog(
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "ERROR", 
							"Erreur lors de l'enregistrement de la notification !"));
		}
		
		// Back to Responsible Entities view
		//backToNewNotificationsView();
    }
	
	
	
	
	
	
	
	
	
	
	

	/**
	 * @return the notificationServices
	 */
	public INotification getNotificationServices() {
		return notificationServices;
	}



	/**
	 * @param notificationServices the notificationServices to set
	 */
	public void setNotificationServices(INotification notificationServices) {
		this.notificationServices = notificationServices;
	}



	public List<StaticManufacturerModel> getStaticManufacturerModels() {
		return aircraftService.getStaticManufacturerModels();
	}
	
	public List<StaticFlightPhase> getStaticFlightPhases() {
		return aircraftService.getStaticFlightPhases();
	}
	
	public List<StaticOperationType> getStaticOperationTypes() {
		return aircraftService.getStaticOperationTypes();
	}
	
	public List<StaticAirspaceClass> getStaticAirspaceClasses() {
		return notificationService.getStaticAirspaceClasses();
	}

	public void setStaticManufacturerModels(List<StaticManufacturerModel> staticManufacturerModels) {
		aircraftService.setStaticManufacturerModels(staticManufacturerModels);
	}
	
	public void setStaticFlightPhases(List<StaticFlightPhase> staticFlightPhases) {
		aircraftService.setStaticFlightPhases(staticFlightPhases);
	}
	
	public void setStaticOperationTypes(List<StaticOperationType> staticOperationTypes) {
		aircraftService.setStaticOperationTypes(staticOperationTypes);
	}
	
	public void setStaticAirspaceClasses(List<StaticAirspaceClass> staticAirspaceClasses) {
		notificationService.setStaticAirspaceClasses(staticAirspaceClasses);
	}

	/*public List<Notification> getNotifications() {
		return notificationService.getNewNotifications();
	}*/

	public List<Notification> getNewNotifications() {
		return notificationService.getNewNotifications();
	}

	public List<Notification> getFiledNotifications() {
		return notificationService.getFiledNotifications();
	}

	public List<Notification> getInvestigatedNotifications() {
		return notificationService.getInvestigatedNotifications();
	}

	public NotificationService getNotificationService() {
		return notificationService;
	}

	public void setNotificationService(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	public AircraftService getAircraftService() {
		return aircraftService;
	}

	public void setAircraftService(AircraftService aircraftService) {
		this.aircraftService = aircraftService;
	}
	
	

	public AnalyseService getAnalyseService() {
		return analyseService;
	}

	public void setAnalyseService(AnalyseService analyseService) {
		this.analyseService = analyseService;
	}
	
	public List<StaticOccurrenceClass> getStaticOccurrenceClasses() {
		return analyseService.getStaticOccurrenceClasses();
	}

	public void setStaticOccurrenceClasses(List<StaticOccurrenceClass> staticOccurrenceClasses) {
		analyseService.setStaticOccurrenceClasses(staticOccurrenceClasses);
	}
	
	public List<StaticOccurrenceStatus> getStaticOccurrenceStatus() {
		return analyseService.getStaticOccurrenceStatus();
	}


	public void setStaticOccurrenceStatus(List<StaticOccurrenceStatus> staticOccurrenceStatus) {
		analyseService.setStaticOccurrenceStatus(staticOccurrenceStatus);
	}
	
	public List<StaticATMContribution> getStaticATMContributions() {
		return analyseService.getStaticATMContributions();
	}


	public void setStaticATMContributions(List<StaticATMContribution> staticATMContributions) {
		analyseService.setStaticATMContributions(staticATMContributions);
	}
	
	public List<StaticEventFrequency> getStaticEventFrequencies() {
		return analyseService.getStaticEventFrequencies();
	}
	
	public List<StaticEffectOnATMService> getStaticEffectOnATMServices() {
		return analyseService.getStaticEffectOnATMServices();
	}


	public void setStaticEffectOnATMServices(List<StaticEffectOnATMService> staticEffectOnATMServices) {
		analyseService.setStaticEffectOnATMServices(staticEffectOnATMServices);
	}


	public void setStaticEventFrequencies(List<StaticEventFrequency> staticEventFrequencies) {
		analyseService.setStaticEventFrequencies(staticEventFrequencies);
	}
	
	public List<StaticOccurrenceCategory> getStaticOccurrenceCategories() {
		return analyseService.getStaticOccurrenceCategories();
	}


	public void setStaticOccurrenceCategories(List<StaticOccurrenceCategory> staticOccurrenceCategories) {
		analyseService.setStaticOccurrenceCategories(staticOccurrenceCategories);
	}
	
	

	public Notification getNotificationToCreate() {
		return notificationToCreate;
	}

	public void setNotificationToCreate(Notification notificationToCreate) {
		this.notificationToCreate = notificationToCreate;
	}

	public Notification getSelectedNotification() {
		return selectedNotification;
	}

	public void setSelectedNotification(Notification selectedNotification) {
		this.selectedNotification = selectedNotification;
	}

	public void createNotification() {
		// Set Notification Identifier

		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");

		Identifier notificationIdentifier = new Identifier();
		String fileNumber = HashcodeUtility
				.hashABS31ToString("" + notificationToCreate.getUtcDate() + notificationToCreate.getUtcTime());
		notificationIdentifier.setFile_Number(fileNumber);
		notificationIdentifier.setResponsibleEntity(session.getSessionUser().getResponsibleEntity());
		notificationIdentifier.setId(session.getSessionUser().getResponsibleEntity().getId() + "-" + fileNumber);

		// Set Notification Id to Identifier's one
		notificationToCreate.setId(notificationIdentifier.getId());

		// Set reportingTime
		notificationToCreate.setReportingTime(Date.from(Instant.now()));

		// Set status to NewNotification
		notificationToCreate.setStatus(NGConstants.NOTIFICATION_STATUS_NEW);

		// Add aircraft to notification

		for (Aircraft ac : notificationToCreate.getAircrafts()) {
			if (ac.getId() == null) {
				String acId = HashcodeUtility
						.hashABS31ToString("" + notificationToCreate.getId() + ac.getAircraft_Registration());
				ac.setId(acId);
			}
		}

		// Add notification to identifier
		notificationIdentifier.addNotification(notificationToCreate);

		// Persist identifier
		notificationService.insertNotificationByIdentifier(notificationIdentifier);

		// Back to Responsible Entities view
		backToNewNotificationsView();
	}
	
	

	public void updateNotification() {

		// set Aircraft Id for new ones
		for (Aircraft ac : selectedNotification.getAircrafts()) {
			if (ac.getId() == null) {
				String acId = HashcodeUtility
						.hashABS31ToString("" + selectedNotification.getId() + ac.getAircraft_Registration());
				ac.setId(acId);
			}
		}

		// Persist
		notificationService.updateNotification(selectedNotification);

		// Back to Responsible Entities view
		backToNewNotificationsView();

	}

	public void deleteNotification() {
		if (selectedNotification != null)
			notificationService.deleteNotification(selectedNotification);

	}

	public void initNotificationToCreate() {
		notificationToCreate = new Notification();
		setAircraftNumber(1);

		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
		session.loadViewNotificationInitialCreate();
	}

	public void initNotificationToUpdate() {
		if (selectedNotification != null) {
			
			// set notification airspace class
			if (selectedNotification.getStaticAirspaceClass() != null) {
				String airspaceId = selectedNotification.getStaticAirspaceClass().getValueID();
				selectedNotification.setStaticAirspaceClass(
						notificationService.getStaticAirspaceClassesMap().get(airspaceId));
			}

			
			if (selectedNotification.getAircrafts() != null && !selectedNotification.getAircrafts().isEmpty()) {
				setAircraftNumber(selectedNotification.getAircrafts().size());
				
				
				for (Aircraft ac : selectedNotification.getAircrafts()) {
					
					// set aircraft manufacturer models
					if (ac.getStaticManufacturerModel() != null) {
						String manufacturerModelId = ac.getStaticManufacturerModel().getValueID();
						ac.setStaticManufacturerModel(
								aircraftService.getStaticManufacturerModelsMap().get(manufacturerModelId));
					}
					
					// set aircraft flight phase
					if (ac.getStaticFlightPhase() != null) {
						String flightPhaseId = ac.getStaticFlightPhase().getValueID();
						ac.setStaticFlightPhase(
								aircraftService.getStaticFlightPhasesMap().get(flightPhaseId));
					}
					
					// set aircraft operation type
					if (ac.getStaticOperationType() != null) {
						String oprTypeId = ac.getStaticOperationType().getValueID();
						ac.setStaticOperationType(
								aircraftService.getStaticOperationTypesMap().get(oprTypeId));
					}
				}
			}
			

			ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
			SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
			session.loadViewNotificationInitialUpdate();

		}

	}
	
	public void initNotificationToAnalyze() {
		if (selectedNotification != null) {
			setAnalyseDetails();
			ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
			SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
			session.loadViewNotificationInitialAnalyse();
		}
	}
	
	private void setAnalyseDetails(){
			if(selectedNotification.getAnalyse() == null){
				Analyse analyse = new Analyse();
				analyse.setNotifications(new ArrayList<Notification>());
				analyse.setId(selectedNotification.getId());
				analyse.addNotification(selectedNotification);
			}else{
				// set occurrence status
				if (selectedNotification.getAnalyse().getStaticOccurrenceStatus() != null) {
					String iD = selectedNotification.getAnalyse().getStaticOccurrenceStatus().getValueID();
					selectedNotification.getAnalyse().setStaticOccurrenceStatus(
							analyseService.getStaticOccurrenceStatusMap().get(iD));
				}
				
				// set occurrence class
				if (selectedNotification.getAnalyse().getStaticOccurrenceClass() != null) {
					String iD = selectedNotification.getAnalyse().getStaticOccurrenceClass().getValueID();
					selectedNotification.getAnalyse().setStaticOccurrenceClass(
							analyseService.getStaticOccurrenceClassesMap().get(iD));
				}
				
				// set event frequency
				if (selectedNotification.getAnalyse().getStaticEventFrequency() != null) {
					String iD = selectedNotification.getAnalyse().getStaticEventFrequency().getValueID();
					selectedNotification.getAnalyse().setStaticEventFrequency(
							analyseService.getStaticEventFrequenciesMap().get(iD));
				}
				
				// set ATM contribution
				if (selectedNotification.getAnalyse().getStaticAtmContribution() != null) {
					String iD = selectedNotification.getAnalyse().getStaticAtmContribution().getValueID();
					selectedNotification.getAnalyse().setStaticAtmContribution(
							analyseService.getStaticATMContributionsMap().get(iD));
				}
				
				// set effect on ATM service
				if (selectedNotification.getAnalyse().getStaticEffectOnAtmService() != null) {
					String iD = selectedNotification.getAnalyse().getStaticEffectOnAtmService().getValueID();
					selectedNotification.getAnalyse().setStaticEffectOnAtmService(
							analyseService.getStaticEffectOnATMServicesMap().get(iD));
				}
				
				// set occurrence category
				if (selectedNotification.getAnalyse().getStaticOccurrenceCategories() != null) {
					List<StaticOccurrenceCategory> categories = new ArrayList<StaticOccurrenceCategory>();
					for(StaticOccurrenceCategory cat : selectedNotification.getAnalyse().getStaticOccurrenceCategories()){
						categories.add(analyseService.getStaticOccurrenceCategoriesMap().get(cat.getValueID()));
					}
					
					selectedNotification.getAnalyse().setStaticOccurrenceCategories(categories);
				}
			}
		
	}
	
	public void initAnalyseToUpdate() {
		if (selectedNotification != null) {
			setAnalyseDetails();
			ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
			SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
			session.loadViewUpdateAnalyse();

		}

	}
	
	public void showAnalyse() {
		if (selectedNotification != null) {
			/*setAnalyseDetails();
			ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
			SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
			session.loadViewUpdateAnalyse();*/

		}

	}

	public void analyseNotification() {
		// Persist analyse
		analyseService.insertAnalyse(selectedNotification.getAnalyse());
		
		//investigate notification
		notificationService.investigateNotification(selectedNotification);
		notificationService.loadNewNotifications();
		notificationService.loadInvestigatedNotifications();
		// Back to Responsible Entities view
		backToNewNotificationsView();
	}
	
	public void updateAnalyse() {
		// Persist analyse
		analyseService.updateAnalyse(selectedNotification.getAnalyse());
		notificationService.loadNewNotifications();
		notificationService.loadInvestigatedNotifications();
		// Back to Responsible Entities view
		backToInvestigatedNotificationsView();
	}
	
	public void cancelAnalyse() {
		backToInvestigatedNotificationsView();
	}

	public void cancelNotification() {
		backToNewNotificationsView();
	}

	public void backToNewNotificationsView() {
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
		session.loadViewNewNotificationsInitial();
	}
	
	public void backToInvestigatedNotificationsView(){
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
		session.loadViewInvestigatedNotifications();
	}

	public int getActiveNotificationIndex() {
		return activeNotificationIndex;
	}

	public void setActiveNotificationIndex(int activeNotificationIndex) {
		this.activeNotificationIndex = activeNotificationIndex;
	}

	public String getNewNotificationsIconColor() {
		if (getNewNotifications() != null) {
			if (!getNewNotifications().isEmpty())
				return "Red";
			else
				return "";
		} else
			return "";
	}

	public String getNewNotificationsAlerte() {
		if (getNewNotifications() != null) {
			if (!getNewNotifications().isEmpty())
				return "ALERTE NOTIFICATIONS##NOTIFICATIONS ALERT";
			else
				return "ALERTE NORMALE##NORMAL ALERT";
		} else
			return "ALERTE NORMALE##NORMAL ALERT";
	}

	public String getNewNotificationsCount() {
		if (getNewNotifications() != null) {
			if (getNewNotifications().size() > 1)
				return getNewNotifications().size() + " Nouvelles Notifications##" + getNewNotifications().size()
						+ " New Notifications";
			else
				return getNewNotifications().size() + " Nouvelle Notification##" + getNewNotifications().size()
						+ " New Notification";
		} else
			return getNewNotifications().size() + " Nouvelle Notification##" + getNewNotifications().size()
					+ " New Notification";
	}

	
	public void setNotificationToCreateAircrafts(List<Aircraft> aircrafts) {
		this.notificationToCreate.setAircrafts(aircrafts);
	}

	public void setSelectedNotificationAircrafts(List<Aircraft> aircrafts) {
		this.selectedNotification.setAircrafts(aircrafts);
	}

	public int getAircraftNumber() {
		return aircraftNumber;
	}

	public void setAircraftNumber(int aircraftNumber) {
		this.aircraftNumber = aircraftNumber;
	}


	public int getActiveNotificationAircraftIndex() {
		return activeNotificationAircraftIndex;
	}

	public void setActiveNotificationAircraftIndex(int activeNotificationAircraftIndex) {
		this.activeNotificationAircraftIndex = activeNotificationAircraftIndex;
	}

	public List<String> getAirspaceClasses() {
		List<String> airspaceClasses = new ArrayList<String>();
		for (EnumAirspaceClass acl : EnumAirspaceClass.values()) {
			airspaceClasses.add(acl.getValue());
		}
		return airspaceClasses;
	}

	public String getUpdateDisabled() {
		return updateDisabled;
	}

	public void setUpdateDisabled(String updateDisabled) {
		this.updateDisabled = updateDisabled;
	}
	
	
	
	

	public List<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public List<StaticOperationType> getOperationTypes() {
		return operationTypes;
	}

	public void setOperationTypes(List<StaticOperationType> operationTypes) {
		this.operationTypes = operationTypes;
	}



	/**
	 * @return the notification
	 */
	public Notification getNotification() {
		return notification;
	}

	/**
	 * @param notification the notification to set
	 */
	public void setNotification(Notification notification) {
		this.notification = notification;
	}

	/**
	 * @return the aircrafts
	 */
	public List<Aircraft> getAircrafts() {
		return aircrafts;
	}

	/**
	 * @param aircrafts the aircrafts to set
	 */
	public void setAircrafts(List<Aircraft> aircrafts) {
		this.aircrafts = aircrafts;
	}

	/**
	 * @return the tabIndex
	 */
	public int getTabIndex() {
		return tabIndex;
	}

	/**
	 * @param tabIndex the tabIndex to set
	 */
	public void setTabIndex(int tabIndex) {
		this.tabIndex = tabIndex;
	}

	/**
	 * @return the aircraftTabTitle
	 */
	public String getAircraftTabTitle() {
		return aircraftTabTitle;
	}

	/**
	 * @param aircraftTabTitle the aircraftTabTitle to set
	 */
	public void setAircraftTabTitle(String aircraftTabTitle) {
		this.aircraftTabTitle = aircraftTabTitle;
	}

	/**
	 * @return the aircraft
	 */
	public Aircraft getAircraft() {
		return aircraft;
	}

	/**
	 * @param aircraft the aircraft to set
	 */
	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	}
}
