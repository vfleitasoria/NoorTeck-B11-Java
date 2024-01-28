package com.noorteck.java.day20;

public class DemoM12 {
	
public static void main (String[]args) {
		
		String s1 = "JavaProgramming";
		
		System.out.println(s1.endsWith("ing"));//true
		System.out.println(s1.endsWith("g"));//true
		System.out.println(s1.endsWith("ramming"));//true
		System.out.println(s1.endsWith("prog"));//false
		System.out.println(s1.endsWith("ram"));//false
		System.out.println(s1.endsWith("Programming"));//true

}
}
/**

1. What is the methodName?
  endsWith()
2. How many Parameters does it? 
    parameter
3. If it takes parameter, then what are the dataTypes?
  String
4. What is the return type of the method?
 boolean
5. What is the purpose of this method? What do
   endsWith() method checks if the String ends with given suffix if it ends then
    return true otherwise false 
*/