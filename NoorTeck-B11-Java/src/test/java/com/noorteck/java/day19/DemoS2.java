package com.noorteck.java.day19;

public class DemoS2 {
	public static void main(String []args) {
		// Question 1 String literal approach
		String s1 = "yesBreak";
		String s2 = "YesBreak";
		
		if (s1==s2) {
			System.out.println("1. Equals");
		}else {
			System.out.println("2. Not Equals");
			
		}
	
	//Question 2. new keyword approach
		String s3 = new String("NoBreak");
		String s4 = new String("NoBreak");
			if (s3==s4) {
				System.out.println("1. Equals");
			}else {
				System.out.println("1. Not Equals");
			}
	
	}
	

}
