package com.halloween3;

public class CityDemo {

	public static void main(String[] args) {

		Country country = new City("Reston","USA",123);

		/**
		 * we can not create an object in the abstract class because we don't have
		 * method body but we have to initialize the parameters to achieve
		 * 
		 */
		country.displayInfo();
		
		City c = new City("Sterling","USA",222);

		c.setCityMeeting();

		country = new SmallCity();

	}
}
