package com.noorteck.java.day14;

public class STATC3demo {
	// Static Method
	public static void getCountry() {
		//How to call STATIC VARIABLE from STATIC METHOD BODY in DIFFERENT CLASS
		STATIC3.country="USA";
		System.out.println(STATIC3.country);
	}

}
/**
call the class first and call the variable*/