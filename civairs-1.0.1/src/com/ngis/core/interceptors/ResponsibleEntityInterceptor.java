package com.ngis.core.interceptors;

import javax.ejb.Stateless;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

import com.ngis.civairs.model.tools.HashcodeUtility;
import com.ngis.core.exceptions.ServiceException;
import com.ngis.core.model.ResponsibleEntity;
import com.ngis.core.services.Service;

@Stateless
public class ResponsibleEntityInterceptor extends Service {

	private static final String RESPONSIBLE_ENTITY_EXISTS_EXCEPTION_MESSAGE = "RESPONSIBLE_ENTITY_EXISTS_EXCEPTION_MESSAGE";
	private static final String NULL_RESPONSIBLE_ENTITY_EXCEPTION_MESSAGE = "NULL_RESPONSIBLE_ENTITY_EXCEPTION_MESSAGE";
	private static final String NULL_RESPONSIBLE_ENTITY_NAME_EXCEPTION_MESSAGE = "NULL_RESPONSIBLE_ENTITY_NAME_EXCEPTION_MESSAGE";
	private static final String NULL_RESPONSIBLE_ENTITY_TYPE_EXCEPTION_MESSAGE = "NULL_RESPONSIBLE_ENTITY_NAME_EXCEPTION_MESSAGE";

	@AroundInvoke
	public Object checkResponsibleEntity(InvocationContext ctx) throws Exception, ServiceException {

		Object[] params = ctx.getParameters();

		if (params == null) throw new ServiceException(NULL_RESPONSIBLE_ENTITY_EXCEPTION_MESSAGE);
		
		ResponsibleEntity entity = (ResponsibleEntity) params[0];
		String entityId = null;

		// is user null
		if (entity == null) throw new ServiceException(NULL_RESPONSIBLE_ENTITY_EXCEPTION_MESSAGE);

		// is login null or empty
		if (entity.getName() == null || entity.getName().isEmpty()) throw new ServiceException(NULL_RESPONSIBLE_ENTITY_NAME_EXCEPTION_MESSAGE);
		
		if (entity.getEntity_Type() == null || entity.getEntity_Type().isEmpty()) throw new ServiceException(NULL_RESPONSIBLE_ENTITY_TYPE_EXCEPTION_MESSAGE);

		entityId = HashcodeUtility.hashABS31ToString(entity.getName() + entity.getEntity_Type());

		// is entity Id already used
		if (em.find(ResponsibleEntity.class, entityId) != null) throw new ServiceException(RESPONSIBLE_ENTITY_EXISTS_EXCEPTION_MESSAGE);

		// is user responsible entity null
		entity.setId(entityId);

		params[0] = entity;

		return ctx.proceed();

	}

}
