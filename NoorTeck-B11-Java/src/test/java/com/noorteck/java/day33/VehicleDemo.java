package com.noorteck.java.day33;

//Concrete Class ---> Regular Class
public class VehicleDemo {

	public static void main(String[]args) {
		
		Vehicle obj = new Vehicle();//Expecting ERROR because it is abstract class
		obj.drive();
		Car obj1 = new Car();//We are able to create an object because is concrete class
		obj1.drive();
		Bike obj2 = new Bike();//We are able to create an object because is concrete class
		obj2.drive();
		System.out.println("*************");
		
		//We can create reference of a parent class to the child object
		
		Vehicle v1 = new Car();//Parent reference pointing to the child Class
		Vehicle v2 = new Bike();//Parent reference pointing to the child Class
		
		
	}

}
