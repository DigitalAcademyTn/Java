package com.med.interfaceDemo;

public abstract class Phone {
	
	// Member varaibles
	private String versionNumber;
	private int batteryPercentage;
	private String carrier;
	private String model;
	private boolean status;
	
	
	//Constructor
	public Phone(String versionNumber, int batteryPercentage, String carrier, String model, boolean status) {
		this.versionNumber = versionNumber;
		this.batteryPercentage = batteryPercentage;
		this.carrier = carrier;
		this.model = model;
		this.status = status;
	}
	
	
	//---------Methods---------
	public abstract void displayInfo();
	
	public abstract void MakeCall(); 


	
	//GETTERS & SETTERS 
	public String getVersionNumber() {
		return versionNumber;
	}


	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}


	public int getBatteryPercentage() {
		return batteryPercentage;
	}


	public void setBatteryPercentage(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}


	public String getCarrier() {
		return carrier;
	}


	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}
	

	
	
	

}
