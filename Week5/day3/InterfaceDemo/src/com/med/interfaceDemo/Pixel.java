package com.med.interfaceDemo;

public class Pixel extends Phone {
	
	

	public Pixel(String versionNumber, int batteryPercentage, String carrier, String model, boolean status) {
		super(versionNumber, batteryPercentage, carrier, model, status);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayInfo() {
		System.out.println("Gemini says : battery percentage 50%");

	}

	@Override
	public void MakeCall() {
		
		
	}

}
