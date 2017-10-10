package com.ngis.civairs.model.dao.occurence;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class EntityAttributeDAO {

	@PersistenceContext(unitName = "civairs_db_pu")
	private EntityManager em;
	
	//queries
	private static final String ATTRIBUTE_ID_QUERY = "select e.attribute_ID from EntityAttribute "
			+ "e where e.attribute_Name = :attributeName "
			+ "and e.entity_Name = :entityName ";
	
	
	public String insert(Object toInsert) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String update(Object toUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String delete(Object toDelete) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Object> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Object selectById(Object iD) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Object> customSelect() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int getAttributeId(String attribute, Class<?> entity){
		try{
		return (Integer) em.createQuery(ATTRIBUTE_ID_QUERY).setParameter("attributeName", attribute).setParameter("entityName", entity.getSimpleName()).getSingleResult();
		
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		
		//return entity.getSimpleName();
	}

}
