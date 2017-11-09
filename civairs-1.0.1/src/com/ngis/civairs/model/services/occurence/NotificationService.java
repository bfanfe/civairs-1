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

import com.ngis.civairs.entities.Identifier;
import com.ngis.civairs.entities.Notification;
import com.ngis.civairs.entities.StaticAirspaceClass;
import com.ngis.civairs.model.constants.NGConstants;
import com.ngis.civairs.model.dao.occurence.IdentifierDAO;
import com.ngis.civairs.model.dao.occurence.NotificationDAO;
import com.ngis.civairs.model.dao.occurence.StaticAirspaceClassDAO;
import com.ngis.civairs.model.services.NGMessageService;
import com.ngis.core.beans.SessionBean;

@ManagedBean
@SessionScoped
public class NotificationService {
	
	private List<Notification> newNotifications;
	
	private List<Notification> investigatedNotifications;
	
	private List<Notification> filedNotifications;
	
	private List<StaticAirspaceClass> staticAirspaceClasses;
	
	private Map<String, StaticAirspaceClass> staticAirspaceClassesMap;

	@EJB
	private NotificationDAO dao;
	
	@EJB
	private StaticAirspaceClassDAO staticAirspaceClassDAO;
	
	@EJB
	private IdentifierDAO identifierDAO;
	
	@PostConstruct
	private void init(){
		loadNewNotifications();
		loadStaticAirspaceClasses();
	}
	
	
	
	public List<StaticAirspaceClass> getStaticAirspaceClasses() {
		return staticAirspaceClasses;
	}



	public Map<String, StaticAirspaceClass> getStaticAirspaceClassesMap() {
		return staticAirspaceClassesMap;
	}



	public void setStaticAirspaceClasses(List<StaticAirspaceClass> staticAirspaceClasses) {
		this.staticAirspaceClasses = staticAirspaceClasses;
	}



	public void setStaticAirspaceClassesMap(Map<String, StaticAirspaceClass> staticAirspaceClassesMap) {
		this.staticAirspaceClassesMap = staticAirspaceClassesMap;
	}

	
	public void loadStaticAirspaceClasses(){
		staticAirspaceClasses = staticAirspaceClassDAO.selectAll();
		staticAirspaceClassesMap = new HashMap<String, StaticAirspaceClass>();
		for(int i=0; i<staticAirspaceClasses.size(); i++ ){
			staticAirspaceClassesMap.put(staticAirspaceClasses.get(i).getValueID(), staticAirspaceClasses.get(i));
		}
	}


	public void loadNewNotifications(){
		//check session user ResponsibleEntity
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
		
		//Check if user has role Administrator or System Manager, then load all Notifications
		Subject currentUser = SecurityUtils.getSubject();
		if(currentUser.hasRole(NGConstants.ROLE_ADMINISTRATOR) || currentUser.hasRole(NGConstants.ROLE_SYSTEM_MANAGER)){
			newNotifications = dao.selectAll(NGConstants.NOTIFICATION_STATUS_NEW);
		}else{
			//Load only the Notifications reported by the user's Responsible Entity
			String entityId = session.getSessionUser().getResponsibleEntity().getId();
			newNotifications = dao.selectAllByEntity(NGConstants.NOTIFICATION_STATUS_NEW, entityId);
		}
		
		/*
		notificationsMap = new HashMap<String, Notification>();
		for(int i=0; i<notifications.size(); i++ ){
			notificationsMap.put(notifications.get(i).getId(), notifications.get(i));
		}*/
	}
	
	public void loadInvestigatedNotifications(){
		//check session user ResponsibleEntity
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
		
		//Check if user has role Administrator or System Manager, then load all Notifications
		Subject currentUser = SecurityUtils.getSubject();
		if(currentUser.hasRole(NGConstants.ROLE_ADMINISTRATOR) || currentUser.hasRole(NGConstants.ROLE_SYSTEM_MANAGER)){
			investigatedNotifications = dao.selectAll(NGConstants.NOTIFICATION_STATUS_INVESTIGATED);
		}else{
			//Load only the Notifications reported by the user's Responsible Entity
			String entityId = session.getSessionUser().getResponsibleEntity().getId();
			investigatedNotifications = dao.selectAllByEntity(NGConstants.NOTIFICATION_STATUS_INVESTIGATED, entityId);
		}
		
	}
	
	public void loadFiledNotifications(){
		//check session user ResponsibleEntity
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		SessionBean session = (SessionBean) context.getSessionMap().get("sessionBean");
		
		//Check if user has role Administrator or System Manager, then load all Notifications
		Subject currentUser = SecurityUtils.getSubject();
		if(currentUser.hasRole(NGConstants.ROLE_ADMINISTRATOR) || currentUser.hasRole(NGConstants.ROLE_SYSTEM_MANAGER)){
			filedNotifications = dao.selectAll(NGConstants.NOTIFICATION_STATUS_FILED);
		}else{
			//Load only the Notifications reported by the user's Responsible Entity
			String entityId = session.getSessionUser().getResponsibleEntity().getId();
			filedNotifications = dao.selectAllByEntity(NGConstants.NOTIFICATION_STATUS_FILED, entityId);
		}
		
	}


	public List<Notification> getNewNotifications() {
		return newNotifications;
	}


	public void setNewNotifications(List<Notification> notifications) {
		this.newNotifications = notifications;
	}
	
	
	
/*
	public Map<String, Notification> getNotificationsMap() {
		return notificationsMap;
	}


	public void setNotificationsMap(Map<String, Notification> notificationsMap) {
		this.notificationsMap = notificationsMap;
	}
*/

	public List<Notification> getInvestigatedNotifications() {
		loadInvestigatedNotifications();
		return investigatedNotifications;
	}


	public List<Notification> getFiledNotifications() {
		loadFiledNotifications();
		return filedNotifications;
	}


	public void setInvestigatedNotifications(List<Notification> investigatedNotifications) {
		this.investigatedNotifications = investigatedNotifications;
	}


	public void setFiledNotifications(List<Notification> filedNotifications) {
		this.filedNotifications = filedNotifications;
	}


	/**
	 * persist a Notification
	 * @param toInsert
	 */
	
	public void insertNotificationByIdentifier(Identifier toInsert){
		String daoResult = identifierDAO.insert(toInsert);
		NGMessageService.addMessage(daoResult);
		loadNewNotifications();
	}
	
	/**
	 * update a Notification
	 * @param toUpdate
	 */
	public void updateNotification(Notification toUpdate){
		String daoResult = dao.update(toUpdate);
		NGMessageService.addMessage(daoResult);
		loadNewNotifications();
	}
	
	/**
	 * file a Notification
	 * @param toFile
	 */
	public void fileNotification(Notification toFile){
		toFile.setStatus(NGConstants.NOTIFICATION_STATUS_FILED);
		String daoResult = dao.update(toFile);
		NGMessageService.addMessage(daoResult);
		loadNewNotifications();
	}
	
	/**
	 * investigate a Notification
	 * @param toFile
	 */
	public void investigateNotification(Notification toInvestigate){
		toInvestigate.setStatus(NGConstants.NOTIFICATION_STATUS_INVESTIGATED);
		String daoResult = dao.update(toInvestigate);
		NGMessageService.addMessage(daoResult);
		loadNewNotifications();
	}
	
	/**
	 * Remove a Notification
	 * @param toDelete
	 */
	public void deleteNotification(Notification toDelete){
		String daoResult = dao.delete(toDelete);
		NGMessageService.addMessage(daoResult);
		loadNewNotifications();
	}
	

}
