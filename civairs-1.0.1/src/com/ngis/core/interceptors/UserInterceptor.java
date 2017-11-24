package com.ngis.core.interceptors;

import javax.ejb.Stateless;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

import com.ngis.core.exceptions.ServiceException;
import com.ngis.core.model.User;
import com.ngis.core.services.Service;

@Stateless
public class UserInterceptor extends Service {

	private static final String LOGIN_EXIST_EXCEPTION_MESSAGE = "LOGIN_EXIST_EXCEPTION_MESSAGE";
	private static final String NULL_LOGIN_EXCEPTION_MESSAGE = "NULL_LOGIN_EXCEPTION_MESSAGE";
	private static final String NULL_USER_EXCEPTION_MESSAGE = "NULL_USER_EXCEPTION_MESSAGE";
	private static final String NULL_RESPONSIBLE_ENTITY_EXCEPTION_MESSAGE = "NULL_RESPONSIBLE_ENTITY_EXCEPTION_MESSAGE";

	@AroundInvoke
	public Object checkUser(InvocationContext ctx) throws Exception, ServiceException {

		User user = (User) ctx.getParameters()[0];
		
		//is user null
		if (user == null) throw new ServiceException(NULL_USER_EXCEPTION_MESSAGE);
		
		//is login null or empty 
		if (user.getLogin() == null || user.getLogin().isEmpty()) throw new ServiceException(NULL_LOGIN_EXCEPTION_MESSAGE);
		
		//is login already used
		if (em.find(User.class, user.getLogin()) != null) throw new ServiceException(LOGIN_EXIST_EXCEPTION_MESSAGE);
		
		//is user responsible entity null
		if (user.getResponsibleEntity() == null) throw new ServiceException(NULL_RESPONSIBLE_ENTITY_EXCEPTION_MESSAGE);
		
		return ctx.proceed();

	}


}
