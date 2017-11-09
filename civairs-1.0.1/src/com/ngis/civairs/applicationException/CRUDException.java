package com.ngis.civairs.applicationException;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true)
public class CRUDException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CRUDException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	

}
