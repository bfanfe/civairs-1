package com.ngis.civairs.model.dao;
import java.util.List;

public interface DAO {

	public String insert(Object toInsert);
	
	public String update(Object toUpdate);
	
	public String delete(Object toDelete);
	
	public List<Object> selectAll();
	
	public Object selectById(Object iD);
	
	public List<Object> customSelect();
	
}
