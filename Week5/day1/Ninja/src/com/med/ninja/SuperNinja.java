package com.med.ninja;

public class SuperNinja extends Ninja {

	private Integer damageMultiplier;
	private boolean isInvisible;
	
	
	public SuperNinja(String name, int health, int power, String weapon, boolean graduated, Integer damageMultiplier,
			boolean isInvisible) {
		super(name, health, power, weapon, graduated);
		this.damageMultiplier = damageMultiplier;
		this.isInvisible = isInvisible;
		
	}


	public Integer getDamageMultiplier() {
		return damageMultiplier;
	}


	public void setDamageMultiplier(Integer damageMultiplier) {
		this.damageMultiplier = damageMultiplier;
	}


	public boolean isInvisible() {
		return isInvisible;
	}


	public void setInvisible(boolean isInvisible) {
		this.isInvisible = isInvisible;
	}
	
	
	
	
	

}
