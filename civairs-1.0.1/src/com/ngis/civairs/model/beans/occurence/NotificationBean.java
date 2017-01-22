package com.ngis.civairs.model.beans.occurence;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.ngis.civairs.model.beans.SessionBean;
import com.ngis.civairs.model.constants.NGConstants;
import com.ngis.civairs.model.entities.occurence.Identifier;
import com.ngis.civairs.model.entities.occurence.Notification;
import com.ngis.civairs.model.services.occurence.NotificationService;
import com.ngis.civairs.model.tools.HashcodeUtility;

@ManagedBean
@SessionScoped
public class NotificationBean {

	@ManagedProperty("#{notificationService}")
	private NotificationService notificationService;

	private Notification selectedNotification;

	private Notification notificationToCreate;

	private int activeNotificationIndex = 0;

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
		
		//Set reportingTime
		notificationToCreate.setReportingTime(Date.from(Instant.now()));
		
		//Set status to NewNotification
		notificationToCreate.setStatus(NGConstants.NOTIFICATION_STATUS_NEW);

		// Add notification to identifier
		notificationIdentifier.addNotification(notificationToCreate);

		// Persist identifier
		notificationService.insertNotificationByIdentifier(notificationIdentifier);

		// Back to Responsible Entities view
		backToNewNotificationsView();
	}

	public void updateNotification() {

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

		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
		session.loadViewNotificationCreate();
	}

	public void initNotificationToUpdate() {
		if (selectedNotification != null) {

			ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
			SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
			session.loadViewNotificationUpdate();

		}
		// if(selectedNotification != null) updateNotification();

	}

	public void selectNotificationToUpdate(String ID) {
		selectedNotification = null;
		for (Notification entity : getNotifications()) {
			if (entity.getId().equals(ID)) {
				selectedNotification = entity;
			}
		}
		if (selectedNotification != null) {

			ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
			SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
			session.loadViewNotificationUpdate();

		}
		// if(selectedNotification != null) updateNotification();

	}

	public void selectNotificationToDelete(String ID) {
		selectedNotification = null;
		for (Notification entity : getNotifications()) {
			if (entity.getId().equals(ID)) {
				selectedNotification = entity;
			}
		}
		if (selectedNotification != null) {
			notificationService.deleteNotification(selectedNotification);
			backToNewNotificationsView();
		}
	}

	public void cancelNotification() {
		backToNewNotificationsView();
	}

	public void backToNewNotificationsView() {
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
		session.loadViewNewNotifications();

	}

	public int getActiveNotificationIndex() {
		return activeNotificationIndex;
	}

	public void setActiveNotificationIndex(int activeNotificationIndex) {
		this.activeNotificationIndex = activeNotificationIndex;
	}
	
	public String getNewNotificationsIconColor(){
		if(getNewNotifications()!=null){
			if(!getNewNotifications().isEmpty()) return "Red";
			else return "";
		} else return "";
	}
	
	public String getNewNotificationsAlerte(){
		if(getNewNotifications()!=null){
			if(!getNewNotifications().isEmpty()) return "ALERTE NOTIFICATIONS##NOTIFICATIONS ALERT";
			else return "ALERTE NORMALE##NORMAL ALERT";
		} else return "ALERTE NORMALE##NORMAL ALERT";
	}
	
	public String getNewNotificationsCount(){
		if(getNewNotifications()!=null){
			if(getNewNotifications().size()>1) return getNewNotifications().size() +" Nouvelles Notifications##"+getNewNotifications().size() +" New Notifications";
			else return getNewNotifications().size() +" Nouvelle Notification##"+getNewNotifications().size() +" New Notification";
		} else return getNewNotifications().size() +" Nouvelle Notification##"+getNewNotifications().size() +" New Notification";
	}

}
