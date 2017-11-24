package com.ngis.civairs.model.services;

import java.io.Serializable;
import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class NGInternatinalizationService implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Locale inglish;
	
	/**
	 * This methode is use to internationalize an input text
	 * formated as following [Local language version ##english version]
	 * @param input
	 * @return the Locale language part of the input text
	 */
	public String toLocaleVersion(String input){
		String res = input;
		if(inglish == null) inglish = new Locale("en");
		
		String[] splited = input.split("##");
		if(splited != null){
			if(splited.length > 1){
				if(FacesContext.getCurrentInstance().getViewRoot().getLocale().toString().equals(inglish.toString())){
					res = splited[1];
				}else{
					res = splited[0];
				}
			}
		}
						
		return res;
	}

}
