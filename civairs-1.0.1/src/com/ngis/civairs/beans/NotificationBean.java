package com.ngis.civairs.model.beans.occurence;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.ngis.civairs.model.beans.SessionBean;
import com.ngis.civairs.model.constants.NGConstants;
import com.ngis.civairs.model.entities.occurence.Aircraft;
import com.ngis.civairs.model.entities.occurence.Analyse;
import com.ngis.civairs.model.entities.occurence.Identifier;
import com.ngis.civairs.model.entities.occurence.Notification;
import com.ngis.civairs.model.entities.occurence.StaticATMContribution;
import com.ngis.civairs.model.entities.occurence.StaticAirspaceClass;
import com.ngis.civairs.model.entities.occurence.StaticEffectOnATMService;
import com.ngis.civairs.model.entities.occurence.StaticEventFrequency;
import com.ngis.civairs.model.entities.occurence.StaticFlightPhase;
import com.ngis.civairs.model.entities.occurence.StaticManufacturerModel;
import com.ngis.civairs.model.entities.occurence.StaticOccurrenceCategory;
import com.ngis.civairs.model.entities.occurence.StaticOccurrenceClass;
import com.ngis.civairs.model.entities.occurence.StaticOccurrenceStatus;
import com.ngis.civairs.model.entities.occurence.StaticOperationType;
import com.ngis.civairs.model.enums.EnumAirspaceClass;
import com.ngis.civairs.model.services.occurence.AircraftService;
import com.ngis.civairs.model.services.occurence.AnalyseService;
import com.ngis.civairs.model.services.occurence.NotificationService;
import com.ngis.civairs.model.tools.HashcodeUtility;

@ManagedBean
@SessionScoped
public class NotificationBean {

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

	public List<Notification> getNotifications() {
		return notificationService.getNewNotifications();
	}

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

	

	public List<Aircraft> getNotificationAircrafts(Notification notification) {
		if (notification != null) {

			if (notification.getAircrafts() == null) {
				notification.setAircrafts(new ArrayList<Aircraft>());
			}

			// add an involved aircraft to the notification
			while (aircraftNumber > notification.getAircrafts().size()) {

				Aircraft aircraft = new Aircraft();
				aircraft.setAircraft_Index(notification.getAircrafts().size() + 1);

				notification.addAircraft(aircraft);

				setActiveNotificationAircraftIndex(aircraftNumber - 1);
			}

			// remove an involved aircraft from the notification
			while (aircraftNumber < notification.getAircrafts().size()) {

				Aircraft aircraft = notification.getAircrafts().get(notification.getAircrafts().size() - 1);
				notification.removeAircraft(aircraft);

				setActiveNotificationAircraftIndex(aircraftNumber - 1);
			}
		}
		return notification.getAircrafts();
	}

	public List<Aircraft> getNotificationToCreateAircrafts() {
		return getNotificationAircrafts(notificationToCreate);

	}

	public void setNotificationToCreateAircrafts(List<Aircraft> aircrafts) {
		this.notificationToCreate.setAircrafts(aircrafts);
	}

	public List<Aircraft> getSelectedNotificationAircrafts() {
		return getNotificationAircrafts(selectedNotification);

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

}
