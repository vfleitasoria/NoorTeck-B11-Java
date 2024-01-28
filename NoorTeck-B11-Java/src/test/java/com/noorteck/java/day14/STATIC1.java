package com.noorteck.java.day14;

public class STATIC1 {
	//Static variable
	public static int age;
	
	
	
	
	// Static Method
	public static void getAge() {
		
		// How to call STATIC VARIABLE from STATIC METHOD BODY in the SAME CLASS
		age= 11;
		System.out.println(age);
		
	}

}
/**
To access STATIC VARIABLE from STATIC METHOD BODY in the SAME CLASS
Just call directly the variable
*/