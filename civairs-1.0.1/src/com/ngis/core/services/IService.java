package com.ngis.core.services;

public interface IService {

	public void create(Object toCreate);
	
	public void update(Object toUpdate);
	
	public void delete(Object toDelete);
	
	public Object findById(String iD);
}