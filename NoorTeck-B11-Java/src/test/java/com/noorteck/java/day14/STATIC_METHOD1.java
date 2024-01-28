package com.noorteck.java.day14;

public class STATIC_METHOD1 {
	//INSTANCE VARIABLE (NON-STATIC VARIABLE)
String country;


//static method
public static void getCountry() {
	
	STATIC_METHOD1 obj=new STATIC_METHOD1();
	obj.country="USA";
	System.out.println(obj.country);
	
	
}

}
