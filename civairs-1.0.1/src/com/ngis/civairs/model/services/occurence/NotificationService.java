package com.ngis.civairs.model.services.occurence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.ngis.civairs.model.dao.occurence.IdentifierDAO;
import com.ngis.civairs.model.dao.occurence.NotificationDAO;
import com.ngis.civairs.model.entities.occurence.Identifier;
import com.ngis.civairs.model.entities.occurence.Notification;
import com.ngis.civairs.model.services.NGMessageService;

@ManagedBean
@SessionScoped
public class NotificationService {
	
	private List<Notification> notifications;
	
	private Map<String, Notification> notificationsMap;

	@EJB
	private NotificationDAO dao;
	@EJB
	private IdentifierDAO identifierDAO;
	
	@PostConstruct
	private void init(){
		loadNotifications();
		
	}
	
	
	public void loadNotifications(){
		notifications = dao.selectAll();
		notificationsMap = new HashMap<String, Notification>();
		for(int i=0; i<notifications.size(); i++ ){
			notificationsMap.put(notifications.get(i).getId(), notifications.get(i));
		}
	}


	public List<Notification> getNotifications() {
		return notifications;
	}


	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}
	
	

	public Map<String, Notification> getNotificationsMap() {
		return notificationsMap;
	}


	public void setNotificationsMap(Map<String, Notification> notificationsMap) {
		this.notificationsMap = notificationsMap;
	}


	/**
	 * persist a Notification
	 * @param toInsert
	 */
	
	public void insertNotificationByIdentifier(Identifier toInsert){
		String daoResult = identifierDAO.insert(toInsert);
		NGMessageService.addMessage(daoResult);
		loadNotifications();
	}
	
	/**
	 * update a Notification
	 * @param toUpdate
	 */
	public void updateNotification(Notification toUpdate){
		String daoResult = dao.update(toUpdate);
		NGMessageService.addMessage(daoResult);
		loadNotifications();
	}
	
	/**
	 * Remove a Notification
	 * @param toDelete
	 */
	public void deleteNotification(Notification toDelete){
		String daoResult = dao.delete(toDelete);
		NGMessageService.addMessage(daoResult);
		loadNotifications();
	}
	

}
