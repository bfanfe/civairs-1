package com.ngis.civairs.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.ngis.civairs.entities.AircraftInvolved;
import com.ngis.civairs.services.AircraftInvolvedService;
import com.ngis.civairs.services.IAircraftInvolved;

@ManagedBean
@SessionScoped
public class AircraftInvolvedBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	private IAircraftInvolved aircraftInvolved;
	
	@ManagedProperty("#{aircraftInvolvedService}")
	private AircraftInvolvedService aircraftInvolvedService;
	
	private List<AircraftInvolved> aircraftsInvolved;
	
	@PostConstruct
	public void init(){
		aircraftsInvolved = new ArrayList<AircraftInvolved>();
	}

	/**
	 * @return the aircraftsInvolved
	 */
	public List<AircraftInvolved> getAircraftsInvolved() {
		return aircraftsInvolved;
	}

	/**
	 * @param aircraftsInvolved the aircraftsInvolved to set
	 */
	public void setAircraftsInvolved(List<AircraftInvolved> aircraftsInvolved) {
		this.aircraftsInvolved = aircraftsInvolved;
	}

}
