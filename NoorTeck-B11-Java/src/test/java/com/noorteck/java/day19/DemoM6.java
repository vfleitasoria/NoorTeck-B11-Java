package com.noorteck.java.day19;

public class DemoM6 {
	
	public static void main (String[]args) {

		String s1 = "B11 is having fun with JAVA";
		
		
		System.out.println(s1.contains("is"));//true
		System.out.println(s1.contains("fun"));//true
		System.out.println(s1.contains("FUN"));//false
		System.out.println(s1.contains("java"));//false
		System.out.println(s1.contains("a"));//true

}}
/**

1. What is the methodName?
    contains()
2. How many Parameters does it? 
    zero
3. If it takes parameter, then what are the dataTypes?
    n/a
4. What is the return type of the method?
   String
5. What is the purpose of this method? What do


*/