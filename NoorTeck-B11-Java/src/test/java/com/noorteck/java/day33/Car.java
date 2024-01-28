package com.noorteck.java.day33;

//Concrete Class ---> Regular Class
public class Car extends Vehicle {

	public void drive() {
		System.out.println("Using Steering Wheels...");

	}
@Override
	public void setColor(String color) {
		System.out.println("Car Color: " + color);
	}
  
}
