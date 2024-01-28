package com.noorteck.java.day19;

public class DemoS6 {
	public static void main (String[]args) {
		
		String s1 = "JAVA";
		String s2 = "JAVA";
		
		String s3 = new String("JAVA");
		String s4 = new String ("JAVA");
		
		if (s1==s2) {
			System.out.println("Equal...");
		}else {
			System.out.println("Not Equal...");
			
		}
		if (s3==s4) {
			System.out.println("Equal...");
		}else {
			System.out.println("Not Equal...");
		}


	}

}
