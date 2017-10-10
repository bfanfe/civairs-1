package com.ngis.civairs.model.enums;

public enum EnumAirspaceClass {
	
	CLASS_A("A"),CLASS_B("B"),CLASS_C("C"),CLASS_D("D"),CLASS_E("E"),CLASS_F("F"),CLASS_G("G");
	
	String value;
	
	private EnumAirspaceClass(String value) {
		// TODO Auto-generated constructor stub
		this.value=value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	
}
