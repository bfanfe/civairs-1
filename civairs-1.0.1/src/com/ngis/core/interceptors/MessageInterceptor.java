package com.ngis.core.interceptors;

import java.util.ResourceBundle;

import javax.faces.context.FacesContext;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class MessageInterceptor {

	@AroundInvoke
	public Object getLocalMessage(InvocationContext ctx) throws Exception {

		Object[] params = ctx.getParameters();
		String message = (String) params[0];
		
		//is local version of message available
		String value = null;
		try {
			ResourceBundle bundle = ResourceBundle.getBundle("com.ngis.core.resources.messages",
					FacesContext.getCurrentInstance().getViewRoot().getLocale());
			value = bundle.getString(message);
			
			//set local version of message if available
			
		} catch (Exception e) {
			value = message;
		}
		params[0] = value;
		
		
		ctx.setParameters(params);
		
		return ctx.proceed();
	}
}
