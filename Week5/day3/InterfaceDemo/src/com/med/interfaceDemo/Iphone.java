package com.med.interfaceDemo;

public class Iphone extends Phone implements Sharable{

	public Iphone(String versionNumber, int batteryPercentage, String carrier, String model, boolean status) {
		super(versionNumber, batteryPercentage, carrier, model, status);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void MakeCall() {
		System.out.println("calling ....");
		
	}

	@Override
	public void displayInfo() {
		System.out.println("Siri says : battery percentage " + getBatteryPercentage() + "%");
		
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		
		System.out.println("scaning for availables devices .....");
		
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void send() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
