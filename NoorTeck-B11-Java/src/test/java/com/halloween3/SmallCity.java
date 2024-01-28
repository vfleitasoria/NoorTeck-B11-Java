package com.halloween3;

public abstract class SmallCity extends City {//make SmallCity Class abstract or override all parents method

	
	// must invoke a super constructor and initialize
	
	public SmallCity(String cityName, String countryName, int population) {
		super(cityName, countryName, population);
		
	}
	
}

