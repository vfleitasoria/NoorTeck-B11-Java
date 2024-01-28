package com.noorteck.java.day29;

public class DemoFinalVariable2 {
	//Approach 1. Assigning value during the declaration
	final String COUNTRY = "USA";
	
	//Approach 2. The value of the final variable will be assigned inside the constructor
	final String CITY;
	public DemoFinalVariable2() {
		CITY = "Reston";
		
	}

}
/**
/**
	1. final INSTANCE VARIABLE
		
			> The value of the final INSTANCE VARIABLE  can be INITIALIZED(assign value) 2 ways
		
				1. We can assign value to the final instance variable during the DECLARATION
				2. If we don not assigning value during the declaration of the
				final instance variable then we MUST assign inside the CONSTRUCTOR
2. final STATIC VARIABLE

		> The value of the final STATIC VARIABLE  can be INITIALIZED(assign value) ONLY 1 WAY
		
		
			1.The value of the final STATIC VARIABLE  MUST MUST MUST be initialized during the DECLARATION 



*/