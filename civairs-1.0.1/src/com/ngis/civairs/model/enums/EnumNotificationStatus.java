package com.ngis.civairs.model.enums;

public enum EnumNotificationStatus {
	
	NOTIFICATION_STATUS_NEW("NOTIFICATION_STATUS_NEW","New Notification"),
	NOTIFICATION_STATUS_FILED("NOTIFICATION_STATUS_FILED","Filed Notification"),
	NOTIFICATION_STATUS_INVESTIGATED("NOTIFICATION_STATUS_INVESTIGATED","Investigated Notification");
	
	private String id;
	private String value;
	
	private EnumNotificationStatus(String id, String value){
		this.setId(id);
		this.setValue(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
