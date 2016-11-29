package com.ngis.civairs.model.services;

import java.util.Date;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class NGDateFormatService {

	@SuppressWarnings("deprecation")
	public static String ddMMYYYYDateformat(Date date){
		
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
	public static String ddMMYYYYSlashDateformat(Date date){
		
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
	public static String retraiteSlashDateformat(Date dateNaissance){
		
		String sDate = "";
		if(dateNaissance != null){
			
			Date retraite = new Date();
			retraite.setDate(31);
			retraite.setMonth(11);
			retraite.setYear(dateNaissance.getYear()+60);
			//add date
			
			//add year
			sDate += "31/12/"+(retraite.getYear()+1900);
		}
		
		return sDate;
	}
	
	@SuppressWarnings("deprecation")
	public static String retraiteDateformat(Date dateNaissance){
		
		String sDate = "";
		if(dateNaissance != null){
			
			Date retraite = new Date();
			retraite.setDate(31);
			retraite.setMonth(11);
			retraite.setYear(dateNaissance.getYear()+60);
			//add date
			
			//add year
			sDate += "31-12-"+(retraite.getYear()+1900);
		}
		
		return sDate;
	}
}
