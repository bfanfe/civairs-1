package com.ngis.core.exceptions;

import javax.ejb.ApplicationException;

@ApplicationException(rollback=true)
public class ServiceException extends RuntimeException {
	
	public static final String LOGIN_EXIST_EXCEPTION="LOGIN_EXIST_EXCEPTION";
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServiceException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}	
}
