package com.noorteck.java.day31;

public class VehicleDemo {
	public static void main(String[]args) {
		
		//Create an object
		Bike obj = new Bike();
		obj.run();
		obj.add(2,3);
	}

}
/**
Inheritance: 
	> Is when we have IS-A Relationship between 2 classes 
		ONe of the class becomes Parent 
		the other becomes the Child
		
	> The child class inherits the variables& methods of the parent class
	> Meaning it will have access to the variable & method
Method Overriding:

> Happens in 2 CLASSES 
> Must have IS-A Relationship between CLasses (INHERITANCE)

> When a child class does not like what parent class method is doing 
in the method body then the child class can override that method
by providing different implementation 



How to achieve METHOD OVERRIDING?
To achieve method overriding
1. Must have IS-Relationship between 2 classes 
2. Method name in child class MUST be same 
		as the method in parent class
3. The PARAMETER in child method MUST be same as
		the method in PARENT class
When we say SAME PARAMETER it means:
a. THe number of param same
b. The data type of those params same
c. the sequence of param data type same


*/