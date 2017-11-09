package com.ngis.civairs.entities;

import java.io.Serializable;

public class AircraftInvolved implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer index;
	private String type;
	private String otherType;
	private String flightPhase;
	private String operator;
	private String registration;
	private String callSign;
	private String operationType;
	private String departureAerodrome;
	private String destinationAerodrome;
	
	
	
	public AircraftInvolved(Integer index, String type, String otherType, String flightPhase) {
		super();
		this.index = index;
		this.type = type;
		this.otherType = otherType;
		this.flightPhase = flightPhase;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOtherType() {
		return otherType;
	}
	public void setOtherType(String otherType) {
		this.otherType = otherType;
	}
	public String getFlightPhase() {
		return flightPhase;
	}
	public void setFlightPhase(String flightPhase) {
		this.flightPhase = flightPhase;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getRegistration() {
		return registration;
	}
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	public String getCallSign() {
		return callSign;
	}
	public void setCallSign(String callSign) {
		this.callSign = callSign;
	}
	public String getOperationType() {
		return operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	public String getDepartureAerodrome() {
		return departureAerodrome;
	}
	public void setDepartureAerodrome(String departureAerodrome) {
		this.departureAerodrome = departureAerodrome;
	}
	public String getDestinationAerodrome() {
		return destinationAerodrome;
	}
	public void setDestinationAerodrome(String destinationAerodrome) {
		this.destinationAerodrome = destinationAerodrome;
	}

	/**
	 * @return the index
	 */
	public Integer getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(Integer index) {
		this.index = index;
	}

}
