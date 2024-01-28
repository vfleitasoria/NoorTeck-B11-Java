package com.noorteck.java.day20;

public class DemoM13 {
	
public static void main (String[]args) {
		
		String s1 = "JavaProgramming";
		
		System.out.println(s1.startsWith("J"));//true
		System.out.println(s1.startsWith("Jav"));//true
		System.out.println(s1.startsWith("JavaPr"));//true
		System.out.println(s1.startsWith("ava"));//true
		System.out.println(s1.startsWith("ram"));//false
		System.out.println(s1.startsWith("Jov"));//false
		System.out.println("*******************");
		
		String s2 = "JavaProgram";
		
		System.out.println(s1.startsWith("va",4));//true
		System.out.println(s1.startsWith("Jav",4));//true
		System.out.println(s1.startsWith("JavaPr",4));//true
		System.out.println(s1.startsWith("ava",4));//true
		System.out.println(s1.startsWith("ram",4));//false
		System.out.println(s1.startsWith("Jov",4));//false

}
}
/**

1. What is the methodName?
  startsWith()
2. How many Parameters does it? 
    parameter
3. If it takes parameter, then what are the dataTypes?
  String
4. What is the return type of the method?
 boolean
5. What is the purpose of this method? What do
   startsWith() method checks if the String starts with given suffix if it ends then
    return true otherwise false 
*/


