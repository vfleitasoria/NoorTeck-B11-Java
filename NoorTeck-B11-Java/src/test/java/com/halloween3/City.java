package com.halloween3;

public abstract class City extends Country {// change to extends and make abstract

	private final String CITY_NAME;//create the variable outside the constructor

	public City(String cityName, String countryName, int population) {
		super(countryName, population);
		CITY_NAME = cityName;
	}

	public String getCityName() {
		return CITY_NAME;
	}

	public void displayInfo() {// remove override notation
		super.displayInfo();
		System.out.println("City Name: " + CITY_NAME);
	}

	@Override
	public void setCurrency() {//remove final to setCurrency in the country class
		System.out.println("Euro: €");
	}

	@Override
	public void getHoliday() {//change the visibility to public
		System.out.println("City: Holiday");
	}

	protected void setCityMeeting() {
		System.out.println("City; Meeting");
	}
}
