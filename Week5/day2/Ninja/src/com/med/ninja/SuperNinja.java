package com.med.ninja;

public class SuperNinja extends Ninja {
	
	//Memeber variables
	private int damageMultiplier;

	  //Constructor
	public SuperNinja(String name, int health, int power, String weapon, boolean graduated, int damageMultiplier) {
		super(name, health, power, weapon, graduated);
		
		this.damageMultiplier = damageMultiplier;
		
		
	}

	// Methods 
	
//	public void attack(Ninja target) {
//		int newHealth = target.getHealth()- this.getPower() * damageMultiplier;
//		target.setHealth(newHealth);
//		
//		System.out.println("[SuperNinja] " +this.getName() + " attack " + target.getName()
//		+ " for "+ this.getPower() * damageMultiplier  + ", and now \n" + target.getName() + " has "
//		+ target.getHealth() + " hp left.");
//		
//	}
	
	
	
	
	//  GETTERS & SETTERS
	public int getDamageMultiplier() {
		return damageMultiplier;
	}

	public void setDamageMultiplier(int damageMultiplier) {
		this.damageMultiplier = damageMultiplier;
	}
	

}
