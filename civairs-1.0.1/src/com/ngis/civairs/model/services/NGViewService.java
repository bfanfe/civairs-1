package com.ngis.civairs.model.services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

public class NGViewService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String VIEW_MAIN = "/app/main.xhtml";
	public static final String VIEW_LOGIN = "/login.xhtml";
	public static final String VIEW_LOGOUT = "/logout.xhtml";
	public static final String MENU_TAB_MENU = "/WEB-INF/layout/menus/tab-menu.xhtml";
	public static final String MENU_MAIN_MENU = "/WEB-INF/layout/menus/main-menu.xhtml";
	public static final String MENU_SUB_MENUS = "/WEB-INF/layout/menus/sub-menus.xhtml";

	public static final String DEFAULT_TEMPLATE = "/WEB-INF/layout/template.xhtml";
	public static final String SESSION_TIMEOUT = "/WEB-INF/layout/session-timeout.xhtml";

	/*
	 * Define the view to include into main content
	 */

	/* Parametres views */
	public static final String VIEW_PARAMETRE = "/app/admin/parametres/parametres.xhtml";
	public static final String VIEW_PARAMETRE_UPDATE = "/app/admin/parametres/parametre-update.xhtml";

	
	// users views
	public static final String VIEW_USERS = "/app/admin/users/users.xhtml";
	public static final String VIEW_USER_UPDATE = "/app/admin/users/user-update-view.xhtml";
	public static final String VIEW_USER_CREATE = "/app/admin/users/user-create-view.xhtml";
	public static final String VIEW_CHANGE_PASSWD = "/app/admin/users/user-change-password.xhtml";

	// roles view 

	public static final String VIEW_RESPONSIBLE_ENTITIES = "/app/admin/users/responsible-entities.xhtml";

	public static final String VIEW_RESPONSIBLE_ENTITY_CREATE = "/app/admin/users/responsible-entity-create-view.xhtml";
	public static final String VIEW_RESPONSIBLE_ENTITY_UPDATE = "/app/admin/users/responsible-entity-update-view.xhtml";
	public static final String VIEW_ROLES = "/app/admin/users/roles.xhtml";
	public static final String VIEW_ROLE_UPDATE = "/app/admin/users/role-update-view.xhtml";
	public static final String VIEW_ROLE_CREATE = "/app/admin/users/role-create-view.xhtml";

	// view VIEW_NOTIFICATIONS VIEW_NOTIFICATIONS_INITIAL

	public static final String VIEW_NOTIFICATIONS = "/app/occurence/notifications/notifications.xhtml";
	public static final String VIEW_NOTIFICATIONS_NEW = "/app/occurence/notifications/notifications-new.xhtml";
	public static final String VIEW_NOTIFICATIONS_INITIAL = "/app/occurence/notifications/notifications-initial-view.xhtml";
	public static final String VIEW_NOTIFICATIONS_INVESTIGATED = "/app/occurence/notifications/notifications-investigated-view.xhtml";
	public static final String VIEW_NOTIFICATIONS_FILED = "/app/occurence/notifications/notifications-filed.xhtml";
	public static final String VIEW_NOTIFICATIONS_ACCORDION = "/app/occurence/notifications/notifications-accordion.xhtml";

	public static final String VIEW_NOTIFICATION_CREATE = "/app/occurence/notifications/notification-create-view.xhtml";
	public static final String VIEW_NOTIFICATION_UPDATE = "/app/occurence/notifications/notification-update-view.xhtml";
	public static final String VIEW_NOTIFICATION_INITIAL_UPDATE = "/app/occurence/notifications/notification-initial-update-view.xhtml";
	public static final String VIEW_NOTIFICATION_INITIAL_ANALYSE = "/app/occurence/notifications/notification-initial-analyse-view.xhtml";
	
	public static final String VIEW_NOTIFICATION_UPDATE_ANALYSE = "/app/occurence/notifications/notification-update-analyse-view.xhtml";
	
	
	public static final String VIEW_NOTIFICATION_INITIAL_CREATE = "/app/occurence/notifications/notification-initial-create-view.xhtml";
	//public static final String VIEW_NOTIFICATION_UPDATE = "/app/occurence/notifications/notification-update-view.xhtml";
	

	public static String getDefaultView() {
		List<String> userPermitedViews = new ArrayList<String>();
		Subject currentUser = SecurityUtils.getSubject();
		if (currentUser.isPermitted("role"))
			userPermitedViews.add(VIEW_ROLES);
		if (currentUser.isPermitted("user"))
			userPermitedViews.add(VIEW_USERS);
		if (userPermitedViews != null && !userPermitedViews.isEmpty()) {
			return userPermitedViews.get(0);
		} else {
			return VIEW_MAIN;
		}
	}

}
