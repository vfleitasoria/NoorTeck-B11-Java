package com.noorteck.java.day21;

public class DemoSB4 {
	public static void main(String[] args) {

		// String Builder

		StringBuilder sBuilder = new StringBuilder("Hello");
        sBuilder.replace(1, 3, "Java");
		System.out.println(sBuilder);

		// String Buffer
		
		StringBuffer sBuffer = new StringBuffer("Hello");
        sBuffer.replace(1, 3, "Java");
		System.out.println(sBuffer);

	}

}
/**
replace()

	it takes 3 parameters:
	
		Param1 = int startIndexPosition
		Param2 = int endIndexPosition
		Param3 = String 
		
		it replace old string part value with param3 


*/