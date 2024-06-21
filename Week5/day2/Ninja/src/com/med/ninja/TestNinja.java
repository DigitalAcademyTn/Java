package com.med.ninja;

public class TestNinja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ninja leo = new Ninja("leo", 100, 50, "katana", false );
		//leo.displayInfo();
		
		//Ninja miky = new Ninja("Miky", 100, 25, "punches", false);

		//leo.attack(miky);
		//miky.displayInfo();
		
		SuperNinja oogway = new SuperNinja("ninja1", 120, 30, "karate", false, 3);
		
		//System.out.println(oogway.getName());
		//System.out.println(oogway.getDamageMultiplier());
		
		oogway.attack(leo);
		
		
		
		
		
		

	}

}
