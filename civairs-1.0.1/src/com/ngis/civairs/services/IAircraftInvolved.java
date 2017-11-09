package com.ngis.civairs.services;

import java.util.List;

import javax.ejb.Local;

import com.ngis.civairs.entities.AircraftInvolved;

@Local
public interface IAircraftInvolved {
	
	public List<AircraftInvolved> aircraftsInvolved();

}
