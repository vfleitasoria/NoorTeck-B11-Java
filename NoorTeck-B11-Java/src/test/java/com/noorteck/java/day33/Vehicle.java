package com.noorteck.java.day33;

//Abstract Class
public abstract class Vehicle {

	// Abstract method --> does not have method body
	public abstract void drive();

	// Abstract method --> does not have method body
	public abstract void setColor(String color);

	// Concrete Method --> It has method body
	public void year() {
		System.out.println("Year: 2022");
		}
	

}
}

/**
 * In Java ABSTRACTION achieve through: >> abstract Class >> Interface
 * 
 * How do we create an abstract class? >>we need to add abstract keyword after
 * access modifier If a class is not abstract, then we can call this >> Regular
 * Class / Concrete Class
 * 
 * Abstraction Class >It is used to achieve abstraction >We can have >>Abstract
 * Method ---->A method without method body >>Concrete Method (non abstract
 * Method)-->A method with method body
 * 
 * If a Concrete INHERITS an (ABSTRAC CLASS/INTERFACE) then a Concrete Class
 * made a contract with (ABSTRAC CLASS/INTERFACE). In the contract it states
 * that CONCRETE CLASS MUST provide implementation (MUST OVERRIDE) the ABSTRACT
 * METHODS
 * 
 * 
 * 
 */
*/