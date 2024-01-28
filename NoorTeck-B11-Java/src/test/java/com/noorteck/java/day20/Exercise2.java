package com.noorteck.java.day20;

public class Exercise2 {
	
	public static void main(String[]args) {
	Exercise2 obj = new Exercise2();
	
	boolean r1 = obj.isThreeEqual("day","DAY","DaY");
	boolean r2 = obj.isThreeEqual("week","weekend","monday");
	boolean r3 = obj.isThreeEqual("java","JAVa","JaVa");
	boolean r4 = obj.isThreeEqual("JavaProgramming","JavaProgramming","Programming in Java");
	
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r3);
	System.out.println(r4);

	}
	
protected boolean isThreeEqual(String strOne, String strTwo, String strThree) {
	boolean result = false;
	if (strOne.equalsIgnoreCase(strTwo)&& strTwo.equalsIgnoreCase(strThree)) {
		result = true;
	}
	
	
	
	return result;
}
}
