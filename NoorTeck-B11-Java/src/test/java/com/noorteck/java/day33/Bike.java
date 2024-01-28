package com.noorteck.java.day33;

//Concrete Class ---> Regular Class
public class Bike extends Vehicle {

	public void drive() {
		System.out.println("Using Handles...");

	}

	public void setColor(String color) {
		System.out.println("Bike Color: " + color);
	}

}
