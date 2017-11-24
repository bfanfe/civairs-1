package com.ngis.core.interceptors;

import java.security.NoSuchAlgorithmException;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

import com.ngis.civairs.model.tools.DigestEncriptor;
import com.ngis.core.exceptions.ServiceException;

public class PasswordInterceptor {

	private static final String NULL_PASSWORD_EXCEPTION_MESSAGE = "NULL_PASSWORD_EXCEPTION_MESSAGE";
	private static final String PASSWORD_ENCRIPTE_EXCEPTION_MESSAGE = "PASSWORD_ENCRIPTE_EXCEPTION_MESSAGE";

	@AroundInvoke
	public Object encriptePassword(InvocationContext ctx) throws Exception, ServiceException {

		Object[] params = ctx.getParameters();
		String passwd = (String) params[1];
		
		//is passwd null
		if (passwd == null || passwd.isEmpty()) throw new ServiceException(NULL_PASSWORD_EXCEPTION_MESSAGE);
		
		try{
			String encriptedPasswd = DigestEncriptor.encripteSHA256(passwd);
			params[1] = encriptedPasswd;
			ctx.setParameters(params);
		}catch(NoSuchAlgorithmException e){
			throw new ServiceException(PASSWORD_ENCRIPTE_EXCEPTION_MESSAGE);
		}	
		return ctx.proceed();

	}

}
