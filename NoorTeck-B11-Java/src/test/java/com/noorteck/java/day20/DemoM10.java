package com.noorteck.java.day20;

public class DemoM10 {
	
	public static void main (String[]args) {
		
		String s1 = "JavaProgram";
		
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(3));
		System.out.println(s1.charAt(4));
		System.out.println(s1.charAt(0));
		
		System.out.println(s1.charAt(-111));
		System.out.println(s1.charAt(1234));
	
	

}}
/**

1. What is the methodName?
  charAt()
2. How many Parameters does it? 
    parameter
3. If it takes parameter, then what are the dataTypes?
   String
4. What is the return type of the method?
   String
5. What is the purpose of this method? What do
   charArt() print the letter of the java index possition order
   starting from 0......to any number.
   Take index possition as argument and return as character
   If the INDEX does not exist them return an Exception or ERROR
   
   
   Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -111
	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
	at java.base/java.lang.String.charAt(String.java:1517)
	at com.noorteck.java.day20.DemoM10.main(DemoM10.java:15)
*/