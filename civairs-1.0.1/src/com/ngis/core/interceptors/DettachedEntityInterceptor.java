package com.ngis.core.interceptors;

import javax.ejb.Stateless;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

import com.ngis.core.exceptions.ServiceException;
import com.ngis.core.model.User;
import com.ngis.core.services.Service;

@Stateless
public class DettachedEntityInterceptor extends Service {

	
	@AroundInvoke
	public Object checkEntity(InvocationContext ctx) throws Exception {

		Object entity = (Object) ctx.getParameters()[0];
		
		if (!em.contains(entity))  entity = em.merge(entity);
		ctx.getParameters()[0] = entity;
		
		return ctx.proceed();

	}


}
