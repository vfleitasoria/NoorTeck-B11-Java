package com.noorteck.java.day29;

public class DemoFinalVariable3 {
	
static final String COUNTRY ="USA";

static final String CITY;

public DemoFinalVariable3() {
	//NOTE: Expected ERROR, because we can only assign static final variable during the declaration 
	CITY = "Reston";
	
}

}
/** final Static variable
    > the value of the STATIC VARIABLE must be initialized during the declaration
*/