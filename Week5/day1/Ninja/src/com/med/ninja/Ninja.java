package com.med.ninja;

public class Ninja {
	
	//Memeber variables
	private String name;
	private int health;
	private int power;
	private String weapon;
	private boolean graduated;
	
	
	// Constructor
	public Ninja(String name, int health, int power, String weapon, boolean graduated) {
		super();
		this.name = name;
		this.health = health;
		this.power = power;
		this.weapon = weapon;
		this.graduated = graduated;
	}
	
	
	//Methods 
	public void displayInfo() {
		System.out.println("name :" + name);
		System.out.println("health :" + health);
		System.out.println("power :" + power);
		System.out.println("weapon :" + weapon);
		System.out.println("graduated :" + graduated);
	}
	
	public void attack(Ninja target) {
		target.setHealth(target.getHealth() - power);
		System.out.println(this.getName() + " attack " + target.getName()
		+ " for "+ this.power + ", and now \n" + target.getName() + " has "
		+ target.getHealth() + " hp left.");
	}
	
	
	
	

	// GETTERS & SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public boolean isGraduated() {
		return graduated;
	}
	public void setGraduated(boolean graduated) {
		this.graduated = graduated;
	}
	
	
	
	

}
