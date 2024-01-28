package com.noorteck.java.day17;

public class Car {
	
	//Instance Variable
	String name;
	int year;
	
	//Parameterized Constructor
	public Car(String modelName , int modelYear) {
		name = modelName;
		year = modelYear;
	}
	public void display() {
		System.out.println("Model: " + name);
		System.out.println("Year: " + year);
	}
		
		public static void main(String[] args) {
			
			Car obj1 = new Car ("Toyota",2020);
			Car obj2 = new Car ("Honda",2010);
			
			obj1.display();
			
			System.out.println("********************");
			
			obj2.display();
			
		}
	}


