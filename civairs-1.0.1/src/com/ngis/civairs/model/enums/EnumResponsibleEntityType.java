package com.ngis.civairs.model.enums;

public enum EnumResponsibleEntityType {
	
	RESPONSIBLE_ENTITY_TYPE_SYSTEME("RESPONSIBLE_ENTITY_TYPE_SYSTEME","Gestionnaire Système##System Responsible entity"),
	RESPONSIBLE_ENTITY_TYPE_ANSP("RESPONSIBLE_ENTITY_TYPE_ANSP","Fourniseur de Service de Navigation Aérienne##Air Navigation Service Provider"),
	RESPONSIBLE_ENTITY_TYPE_AGA("RESPONSIBLE_ENTITY_TYPE_AGA","Gestionnaire d'Aérodrome##Aerodrome Manager"),
	RESPONSIBLE_ENTITY_TYPE_OPS("RESPONSIBLE_ENTITY_TYPE_OPS","Exploitant d'Aéronef##Aircaft Operator"),
	RESPONSIBLE_ENTITY_TYPE_MAINT("RESPONSIBLE_ENTITY_TYPE_MAINT","Fournisseur de Service de Maintenance##Maintenace Service Provider"),
	RESPONSIBLE_ENTITY_TYPE_HANDLING("RESPONSIBLE_ENTITY_TYPE_HANDLING","Fournisseur d'Assistance en Escale##Handling Service Provider"),
	RESPONSIBLE_ENTITY_TYPE_ANAC("RESPONSIBLE_ENTITY_TYPE_ANAC","Autorité de l'Aviation Civile##Civil Aviation Autority"),
	RESPONSIBLE_ENTITY_TYPE_BEA("RESPONSIBLE_ENTITY_TYPE_BEA","Bureau d'Enquête Accident##Accident Investigation Bureau");
	
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
