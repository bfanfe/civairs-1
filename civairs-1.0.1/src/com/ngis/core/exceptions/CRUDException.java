package com.ngis.core.exceptions;

import javax.ejb.ApplicationException;

@ApplicationException(rollback=true)
public class CRUDException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CRUDException() {
		// TODO Auto-generated constructor stub
	}

	public CRUDException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public CRUDException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public CRUDException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public CRUDException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
