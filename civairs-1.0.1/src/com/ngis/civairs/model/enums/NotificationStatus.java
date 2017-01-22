package com.ngis.civairs.model.enums;

import java.io.Serializable;

public class NotificationStatus  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String value;

	public NotificationStatus(String id, String value) {
		super();
		this.id = id;
		this.value = value;
	}

	public String getId() {
		return id;
	}

	public String getValue() {
		return value;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
