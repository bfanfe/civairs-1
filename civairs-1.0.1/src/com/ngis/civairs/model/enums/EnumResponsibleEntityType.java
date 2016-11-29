package com.ngis.civairs.model.enums;

public enum EnumResponsibleEntityType {
	
	RESPONSIBLE_ENTITY_TYPE_SYSTEME("RESPONSIBLE_ENTITY_TYPE_SYSTEME","System Responsible entity"),
	RESPONSIBLE_ENTITY_TYPE_ANSP("RESPONSIBLE_ENTITY_TYPE_ANSP","Air Navigation Service Provider"),
	RESPONSIBLE_ENTITY_TYPE_AGA("RESPONSIBLE_ENTITY_TYPE_AGA","Airport Manager"),
	RESPONSIBLE_ENTITY_TYPE_OPS("RESPONSIBLE_ENTITY_TYPE_AGA","Aircaft Operator"),
	RESPONSIBLE_ENTITY_TYPE_HANDLING("RESPONSIBLE_ENTITY_TYPE_HANDLING","Handling Service Provider"),
	RESPONSIBLE_ENTITY_TYPE_ANAC("RESPONSIBLE_ENTITY_TYPE_ANAC","Civil Aviation Autority"),
	RESPONSIBLE_ENTITY_TYPE_BEA("RESPONSIBLE_ENTITY_TYPE_BEA","Accident Investigation Bureau");
	
	private String id;
	private String value;
	
	private EnumResponsibleEntityType(String id, String value){
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
