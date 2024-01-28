package com.noorteck.java.day17;

public class Country {
	// Instance Variable
	String countryName;
	String capital;

	public static void main(String args[]) {

		// Create an object of country class
		Country obj = new Country();
		System.out.println(obj.countryName);
		System.out.println(obj.capital);

		obj.countryName = "USA";
		obj.capital = "D.C";

		System.out.println(obj.countryName);
		System.out.println(obj.capital);

	}
}
