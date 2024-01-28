package com.noorteck.java.day11;

public class DemoNonVoid4 {
	public static void main(String args[]) {
		
		String myInfo= getNumber(1);
		String myInfo1= getNumber(-12);
		String myInfo2= getNumber(0);
		System.out.println(myInfo);
		System.out.println(myInfo1);
		System.out.println(myInfo2);
		
	}
public static String getNumber(int number) {
	String result="";
	if (number>0) {
		result="POSITIVE";
	}if (number<0) {
		result="NEGATIVE";
	}if (number == 0) {
		result="ZERO";
	}
	
	
	return result;

	
}
}
