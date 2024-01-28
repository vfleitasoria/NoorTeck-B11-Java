package com.halloween3;

public class CapitalCity extends City {// make abstract or override all method from parent class

	private final int population;
	private static final String TYPE = "ABC";

	// must invoke a super constructor and initialize
	public CapitalCity(String cityName, String countryName, int population) {
		super(cityName, countryName, population);
		this.population = 123;

	}

	@Override
	public void displayInfo() {// change to public
		System.out.println(TYPE + " of " + getName());// create an abstract method getName GETTER to encapsulation
	}

	@Override
	protected void setCityMeeting() {// remove notation parametrs and change to protected same as parent class method
		System.out.println("CapitalCity; Meeting");
	}

	public void setCapital() {
	}

	@Override
	public void setRegion() {
		
		
	}

	@Override
	public void setOcean() {
		
		
	}

	@Override
	public void setLanguage() {
		
		
	}

	@Override
	public void setFood() {
		
		
	}
}
