package com.noorteck.java.day29;

public class City extends State{
	// Constructor that take 1 parameter
	public City(String address) {
		//Call explicitly the parent constructor
		super(1234, "Reston", false);
		System.out.println("City Class Constructor");
		System.out.println(address);
	}

}
/**
Whenever we have a IS-Relationship between classes
then the child CLASS will ALWAYS ALWAYS ALWAYS
call the PARENT CONSTRUCTOR FROM CHILD CLASS CONSTRUCTOR
BODY

When a PARENT CLASS has a default constructor
	or constructor with no parameter
	
	then java will IMPLICITELY Call the parent class constructor
	from child class constructor body
When a PARENT CLASS has a constructor with parameters
then we MUST call the parent constructor inside
child class constructor EXPLICTELY  


*/