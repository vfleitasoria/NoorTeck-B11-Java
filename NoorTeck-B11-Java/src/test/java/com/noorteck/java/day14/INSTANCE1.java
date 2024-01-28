package com.noorteck.java.day14;

public class INSTANCE1 {
	// iNSTANCE VARIABLE (NON-STATIC VARIABLE)
	String country;
	
	// NON-STATIC METHOD
	public void getInfo() {
		// How to call INSTANCE VARIABLE from NON-STATIC METHODE BODY in the SAME CLASS
		country = "USA";
		
	}

}
/** To access INSTANCE VARIABLE from NON-STATIC METHODE BODY in the SAME CLASS
   --> Call DIRECTLY BY the INSTANCE VARIAB
*/