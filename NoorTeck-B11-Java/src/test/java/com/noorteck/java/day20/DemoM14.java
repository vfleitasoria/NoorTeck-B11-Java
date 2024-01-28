package com.noorteck.java.day20;

public class DemoM14 {

	public static void main(String[] args) {

		String s1 = "Javaxyz";
		String s2 = "SundayMonday";
		String s3 = "TodayIsFunDayWithJava";

		System.out.println("S1.Length: " + s1.length());
		System.out.println("S2.Length: " + s2.length());
		System.out.println("S3.Length: " + s3.length());

		System.out.println("******************");

		System.out.println("S1 First Character: " + s1.charAt(0));
		System.out.println("S2 First Character: " + s2.charAt(0));
		System.out.println("S3 First Character: " + s3.charAt(0));
		
		
		System.out.println("******************");
		
		char lastCharacter1 = s1.charAt(s1.length()-1);
		char lastCharacter2 = s2.charAt(s2.length()-1);
		char lastCharacter3 = s3.charAt(s3.length()-1);
		
		
		System.out.println("S1 Last Character: " + lastCharacter1);
		System.out.println("S2 Last Character: " + lastCharacter2);
		System.out.println("S3 Last Character: " + lastCharacter3);

	}
}
/**
 * 1. YOu need to know how to get the Length of the String
 * length() method
 * 
 * 2. YOu need to know how to get the first character in the String
 * Index ZERO
 * charAt90;
 * 
 * 3. You need to know how to get the last character in the String
 * 
 * length()-1
 * 
 * String s1 = "Javaxyz";
 * 
 * a. length --> 7 b. J c. z
 * /**
		 * The first character of s1 is at INDEX ZERO
		 * The first character of s2 is at INDEX ZERO
		 * The first character of s3 is at INDEX ZERO
		 * 
		 * In this case we noticed the length of the String is different
		 * but when it comes to retrieving the first character in the string
		 * the length does not matter because the first character 
		 * will always be at index 0
		 
 */