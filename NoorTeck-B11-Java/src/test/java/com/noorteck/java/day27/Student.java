package com.noorteck.java.day27;

public class Student {
	
	//1. Private Variable
	
	private String name;
	private int age;
	
	//2. provide getter and setter method
	
	//a. setter method
	
	public void setName(String name) {
		this.name=name;
		
	}
    // b. getter method
	public String getName() {
		return name;
		
	}
	//Setter
	public void setAge(int age) {
		this.age=age;
	}
	//Getter
	public int getAge() {
		return age;
	}
}
/***

Encapsulation can be achieved by:

	1. making the variables/object PRIVATE
	2. providing public getter & setter methods

	a. setter method:		
			> Allows us to assign value to the private variable 
    b.getter method
            > Allows us to retrieve the private variable value
            
    Encapsulation can be achieved by:
	
		1. making the variables/object PRIVATE
		2. providing public getter & setter methods

		a. setter method:		
				> Allows us to assign value to the private variable 
							
		b. getter method:> Allows us to retrieve the private variable value


	PRIVATE ACCESS MODIFIER:
	
		When a variable/method has a private access modifier 
			then it can only be accessed from the SAME class
			we cannot access from outside class DIRECTLY
			
			
			BUT we can access private variables from outside
			the class IN-DIRECTLY through the getters & setters




	Public Getter & Setter Methods:
	
	
		1. setter method/set method
			
			Purpose:	Allows us to assign value to the private variable 
			
			Return Type: ALWAYS  VOID
			
			Parameter: 1 Parameter 
			and the data type of parameter will always
						be same as the date type of the PRIVATE VARIABLE
		
		
		2.  getter method/get method

			Purpose:  Allows us to retrieve the private variable value
			
			Return Type: return type will ALWAYS be same as the data type of the 
							PRIVATE VARIABLE
							(whatever return type of the private variable is 
								then make the return type of getter method same )
			
			Parameter: NO
		

	NAMING RULE for the getter & setter methods

		setterMethod	--> setVariableName 
		getterMethod	--> getVariableName
		
		
		private String city;
		
		what will be my setter & getter method name 
		
				setCity
				getCity
				
		(whatever return type of the private variable is 
								then make the return type of getter method same )
			
			Parameter: NO
		

	NAMING RULE for the getter & setter methods

		setterMethod	--> setVariableName 
		getterMethod	--> getVariableName
		
		
		private String city;
		
		what will be my setter & getter method name 

		       setCity
				getCity
		

*/

			
			        
