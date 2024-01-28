package com.noorteck.java.day9;

public class DemoVoidMethod3 {
	public static void main (String args[]) {
		greeting("John");
		greeting("Tom");
	}
public static void greeting(String name) {
	System.out.println("Hello. My name is "+ name);
	
}
}
/**
Write a method that takes 1 String parameter and it displays following;

		EX:		Hello, My name is ___________

		Modifier:  public static
		return type:  void
		methodName: greeting
		parameter: String name

*/


/**
	When we create a method, then the method needs to be called from THE MAIN METHOD

	IMPORTANT NOTES TO KEEP IN MIND:
		When calling a method from main method body, wee need to know following
			1. methodName
			2. number of parameter method takes 
			3. The order of parameter data type 


*/

