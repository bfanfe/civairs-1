package com.ngis.core.services;

import javax.ejb.Stateless;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.interceptor.Interceptors;

import org.primefaces.context.RequestContext;

import com.ngis.civairs.model.beans.SessionBean;
import com.ngis.core.interceptors.MessageInterceptor;

@Stateless
public class MessageService {

	public static final int VIEW_MESSAGES_IN_GROWL = 10;
	public static final int VIEW_MESSAGES_IN_DIALOG = 20;
	
	@Interceptors(MessageInterceptor.class)
	public void errorMessage(String message) {
		if (SessionBean.getMessagesViewType() == VIEW_MESSAGES_IN_DIALOG) RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_ERROR, "", message));
		else FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "", message));
		
	}
	
		
	@Interceptors(MessageInterceptor.class)
	public void infoMessage(String message) {
		if (SessionBean.getMessagesViewType() == VIEW_MESSAGES_IN_DIALOG) RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_INFO, "", message));
		else FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "", message));
		
	}
	
	@Interceptors(MessageInterceptor.class)	
	public void fatalMessage(String message) {
		if (SessionBean.getMessagesViewType() == VIEW_MESSAGES_IN_DIALOG) RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_FATAL, "", message));
		else FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "", message));
	}
	
	@Interceptors(MessageInterceptor.class)
	public void warningMessage(String message) {
		if (SessionBean.getMessagesViewType() == VIEW_MESSAGES_IN_DIALOG) RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_WARN, "", message));
		else FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "", message));
		
	}	
}
