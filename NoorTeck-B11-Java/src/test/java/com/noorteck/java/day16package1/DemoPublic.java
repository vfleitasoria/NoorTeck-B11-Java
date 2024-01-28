package com.noorteck.java.day16package1;

// Class access modifier
public class DemoPublic {

//Static variable with public access modifier
	public static String city = "Reston";

	// Instance variable with public access modifier
	public String country = "USA";

	// Non-Static method with public access modifier

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	// Static method with public access
	public static void subtract(int a, int b) {
		System.out.println(a - b);

	}
}
