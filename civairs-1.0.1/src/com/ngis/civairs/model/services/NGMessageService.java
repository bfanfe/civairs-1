package com.ngis.civairs.model.services;

import java.util.ResourceBundle;

import javax.faces.context.FacesContext;

import com.ngis.civairs.model.constants.NGConstants;
import com.ngis.civairs.view.messages.MessageHandler;

public class NGMessageService {
	
	public static void addMessage(String message){
		ResourceBundle bundle = ResourceBundle.getBundle("com.ngis.civairs.model.resources.messages", FacesContext.getCurrentInstance().getViewRoot().getLocale());
		String value = bundle.getString(message);
		
        if(message.equals(NGConstants.DB_INSERT_FAILED) || message.equals(NGConstants.DB_UPDATE_FAILED) || message.equals(NGConstants.DB_DELETE_FAILED)) MessageHandler.growlError(message); 
        else MessageHandler.growlInfo(value);                 
	}
	
	
	public static void addError(String message){
		
		MessageHandler.growlError(message);                 
	}
	
	public static void addInfo(String message){
		
		MessageHandler.growlInfo(message);                 
	}
	
	public static void addWarning(String message){
		
		MessageHandler.growlWarn(message);                 
	}

}
