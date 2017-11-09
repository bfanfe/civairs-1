package com.ngis.civairs.services;

import java.util.List;

import javax.ejb.Local;

import com.ngis.civairs.entities.StaticFlightPhase;

@Local
public interface IFlightPhase {
	
	public List<StaticFlightPhase> findAllFlightPhase();

}
