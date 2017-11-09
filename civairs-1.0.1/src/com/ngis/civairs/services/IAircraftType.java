package com.ngis.civairs.services;

import java.util.List;

import javax.ejb.Local;

import com.ngis.civairs.entities.Aircraft;

@Local
public interface IAircraftType {
	
	public List<Aircraft> findAllAircraft();

}
