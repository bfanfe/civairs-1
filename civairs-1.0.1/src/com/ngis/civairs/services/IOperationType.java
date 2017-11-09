package com.ngis.civairs.services;

import java.util.List;

import javax.ejb.Local;

import com.ngis.civairs.entities.StaticOperationType;

@Local
public interface IOperationType {
	
	List<StaticOperationType> findAllOperationType();
	StaticOperationType findOperationTypeById(String valueID);

}
