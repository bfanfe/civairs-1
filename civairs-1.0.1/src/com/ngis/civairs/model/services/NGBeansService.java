package com.ngis.civairs.model.services;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.ngis.core.beans.SessionBean;

public class NGBeansService {

	public static SessionBean getSessionBean() {
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		SessionBean sessionBean = (SessionBean) context.getSessionMap().get("sessionBean");
		return sessionBean;
	}

	
	
	
}
