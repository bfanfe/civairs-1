package com.ngis.core.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.Query;

import com.ngis.civairs.model.enums.EnumResponsibleEntityType;
import com.ngis.civairs.model.enums.ResponsibleEntityType;
import com.ngis.core.exceptions.CRUDException;
import com.ngis.core.interceptors.NullResponsibleEntityInterceptor;
import com.ngis.core.interceptors.ResponsibleEntityInterceptor;
import com.ngis.core.model.ResponsibleEntity;

@Stateless
public class ResponsibleEntityService extends Service {

	private static final String RESPONSIBLE_ENTITY_CREATE_EXCEPTION_MESSAGE = "RESPONSIBLE_ENTITY_CREATE_EXCEPTION_MESSAGE";
	private static final String RESPONSIBLE_ENTITY_UPDATE_EXCEPTION_MESSAGE = "RESPONSIBLE_ENTITY_UPDATE_EXCEPTION_MESSAGE";
	private static final String RESPONSIBLE_ENTITY_DELETE_EXCEPTION_MESSAGE = "RESPONSIBLE_ENTITY_DELETE_EXCEPTION_MESSAGE";

	private Map<String, ResponsibleEntityType> responsibleEntityTypesMap;
	List<ResponsibleEntityType> responsibleEntityTypes;
	
	@PostConstruct
	private void init(){
		
		responsibleEntityTypes = new ArrayList<ResponsibleEntityType>();
		for(EnumResponsibleEntityType enumVal : EnumResponsibleEntityType.values()){
			responsibleEntityTypes.add(new ResponsibleEntityType(enumVal.getId(), enumVal.getValue()));
		}
		
		responsibleEntityTypesMap = new HashMap<String, ResponsibleEntityType>();
		for(int i=0; i<responsibleEntityTypes.size(); i++ ){
			responsibleEntityTypesMap.put(responsibleEntityTypes.get(i).getId(), responsibleEntityTypes.get(i));
		}
	}
	
	@Interceptors(ResponsibleEntityInterceptor.class)
	public void create(ResponsibleEntity toCreate) throws CRUDException {
		// TODO Auto-generated method stub
		try {
			super.create(toCreate);
		} catch (CRUDException ce) {
			throw new CRUDException(RESPONSIBLE_ENTITY_CREATE_EXCEPTION_MESSAGE);
		}
	}

	public void update(ResponsibleEntity toUpdate) throws CRUDException {
		// TODO Auto-generated method stub
		try {
			super.update(toUpdate);
		} catch (CRUDException ce) {
			throw new CRUDException(RESPONSIBLE_ENTITY_UPDATE_EXCEPTION_MESSAGE);
		}
		
	}

	public void delete(ResponsibleEntity toDelete) throws CRUDException {
		// TODO Auto-generated method stub
		try {
			super.delete(toDelete);
		} catch (CRUDException ce) {
			throw new CRUDException(RESPONSIBLE_ENTITY_DELETE_EXCEPTION_MESSAGE);
		}
		
	}

	@Override
	public ResponsibleEntity findById(String iD) {
		// TODO Auto-generated method stub
		return em.find(ResponsibleEntity.class, iD);
	}
	
	public ResponsibleEntityType findTypeById(String iD) {
		// TODO Auto-generated method stub
		return responsibleEntityTypesMap.get(iD);
	}
	
	@Interceptors(NullResponsibleEntityInterceptor.class)
	public ResponsibleEntityType findTypeByEntity(ResponsibleEntity entity) {
		// TODO Auto-generated method stub
		return responsibleEntityTypesMap.get(entity.getEntity_Type());
	}

	@SuppressWarnings("unchecked")
	public List<ResponsibleEntity> findAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("SELECT p FROM ResponsibleEntity p");
		return query.getResultList();
	}
	
	public List<ResponsibleEntityType> findTypes() {
		// TODO Auto-generated method stub
		return responsibleEntityTypes;
	}

	public List<ResponsibleEntity> findByAttributes(HashMap<String, Object> attributes) {
		// TODO Auto-generated method stub
		return null;
	}
}
