package com.noorteck.Practice.java;

public class ifElsePractice4 {
	public static void main(String args[]) {
		
		/*
		 * number=5
		 * factorial of 5---> 5*4*3*2*1=120
		 * factorial of 3
		 */
	
	int number=5;
	int factorial=1;
	int result=1;
	for (int i=number; i>=1; i--) {
		result= result*i;
	}
	System.out.println(result);
	}

}
