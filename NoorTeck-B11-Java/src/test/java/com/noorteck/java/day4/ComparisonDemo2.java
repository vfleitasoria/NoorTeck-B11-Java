package com.noorteck.java.day4;

public class ComparisonDemo2 {
	
	public static void main ( String args []) {
		
		
		/** boolean data can have true/false as value
		 * 
		 */
		
		boolean isJavaFun = true;
		boolean isTodayFriday = false;
		
		System.out.println (isJavaFun);
		System.out.println (isTodayFriday);
		
		
		System.out.println ("*********************************");
		
		
		/** This example on the right side ( after equal) we have numbers
		 * but we are comparing 1 number against another number, the outcomes of this comparison is BOOLEAN
		 * 
		 */
	
	boolean isCorrect = 11>4;// YES --> True
	boolean isCorrect2 = 100>200; // NO --> False
	
	
	System.out.println (isCorrect);
	System.out.println (isCorrect2);
	
	
	
	System.out.println ("*********************************");
	
	
	
	boolean isCorrect1 = (11 !=10);
	boolean isCorrect3 = !false&&true;
	boolean isCorrect4 = 4<10;
	boolean result = !(isCorrect1 && isCorrect3 || isCorrect4);
	System.out.println (result);
	
			
	
	
	
	}

}
