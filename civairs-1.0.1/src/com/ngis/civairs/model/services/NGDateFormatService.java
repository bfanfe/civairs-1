package com.ngis.civairs.model.services;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class NGDateFormatService implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("deprecation")
	public String ddMMYYYYDateformat(Date date){
		
		String sDate = "";
		if(date != null){
			//add date
			if(date.getDate()< 10) {
				sDate += "0"+date.getDate();
			}else{
				sDate += ""+date.getDate();
			}
			//add month
			if((date.getMonth()+1)< 10) {
				sDate += "-0"+(date.getMonth()+1);
			}else{
				sDate += "-"+(date.getMonth()+1);
			}
			//add year
			sDate += "-"+(date.getYear()+1900);
		}
		
		return sDate;
	}
	
	@SuppressWarnings("deprecation")
	public String ddMMYYYYSlashDateformat(Date date){
		
		String sDate = "";
		if(date != null){
			//add date
			if(date.getDate()< 10) {
				sDate += "0"+date.getDate();
			}else{
				sDate += ""+date.getDate();
			}
			//add month
			if((date.getMonth()+1)< 10) {
				sDate += "/0"+(date.getMonth()+1);
			}else{
				sDate += "/"+(date.getMonth()+1);
			}
			//add year
			sDate += "/"+(date.getYear()+1900);
		}
		
		return sDate;
	}
	
	@SuppressWarnings("deprecation")
	public String hhmmTimeformat(Date date){
		
		String sDate = "";
		if(date != null){
			//add date
			if(date.getHours()< 10) {
				sDate += "0"+date.getHours();
			}else{
				sDate += ""+date.getHours();
			}
			//add month
			if(date.getMinutes()< 10) {
				sDate += ":0"+date.getMinutes();
			}else{
				sDate += ":"+date.getMinutes();
			}
			
		}
		
		return sDate;
	}
	
	@SuppressWarnings("deprecation")
	public String retraiteSlashDateformat(Date dateNaissance, int ageRetraite){
		
		String sDate = "";
		if(dateNaissance != null){
			
			Date retraite = new Date();
			retraite.setDate(31);
			retraite.setMonth(11);
			retraite.setYear(dateNaissance.getYear()+ageRetraite);
			//add date
			
			//add year
			sDate += "31/12/"+(retraite.getYear()+1900);
		}
		
		return sDate;
	}
	
	@SuppressWarnings("deprecation")
	public String retraiteDateformat(Date dateNaissance, int ageRetraite){
		
		String sDate = "";
		if(dateNaissance != null){
			
			Date retraite = new Date();
			retraite.setDate(31);
			retraite.setMonth(11);
			retraite.setYear(dateNaissance.getYear()+ageRetraite);
			//add date
			
			//add year
			sDate += "31-12-"+(retraite.getYear()+1900);
		}
		
		return sDate;
	}
}
