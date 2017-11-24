package com.ngis.core.interceptors;

import javax.ejb.Stateless;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

import com.ngis.core.exceptions.ServiceException;
import com.ngis.core.model.ResponsibleEntity;
import com.ngis.core.services.Service;

@Stateless
public class NullResponsibleEntityInterceptor extends Service {

	private static final String NULL_RESPONSIBLE_ENTITY_EXCEPTION_MESSAGE = "NULL_RESPONSIBLE_ENTITY_EXCEPTION_MESSAGE";
	
	@AroundInvoke
	public Object checkResponsibleEntity(InvocationContext ctx) throws Exception, ServiceException {

		Object[] params = ctx.getParameters();

		if (params == null) throw new ServiceException(NULL_RESPONSIBLE_ENTITY_EXCEPTION_MESSAGE);
		
		ResponsibleEntity entity = (ResponsibleEntity) params[0];
		
		if (entity == null) throw new ServiceException(NULL_RESPONSIBLE_ENTITY_EXCEPTION_MESSAGE);

		return ctx.proceed();

	}

}
