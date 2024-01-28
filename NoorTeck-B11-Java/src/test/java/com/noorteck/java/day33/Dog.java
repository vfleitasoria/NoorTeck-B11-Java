package com.noorteck.java.day33;

//Concrete Class
public class Dog extends Animal {
   @Override
	public void sound() {
		System.out.println("My Dog Bark...");

	}
   @Override
	public void eat() {
		System.out.println("My Dog Eat Dry Food...");
	}

}
