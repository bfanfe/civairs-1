package com.ngis.civairs.services;

import java.util.List;

import javax.ejb.Local;

import com.ngis.civairs.entities.StaticAirspaceClass;

@Local
public interface IAirspaceClass {
	
	List<StaticAirspaceClass> findAllAirspaceClass();

}
