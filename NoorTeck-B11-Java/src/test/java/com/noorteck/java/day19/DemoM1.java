package com.noorteck.java.day19;

public class DemoM1 {
	public static void main(String[] args) {

		String s1 = "JAVA";
		String s2 = "JAVA";

		String s3 = new String("JAVA");
		String s4 = new String("JAVA");

		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));

		if (s1.equals(s2)) {
			System.out.println("Equal...");
		} else {
			System.out.println("Not Equal...");
			
			System.out.println("*****************");
		}
		

		if (s3.equals(s4)) {
			System.out.println("Equal...");
		} else {
			System.out.println("Not Equal...");
		}
	}
}
