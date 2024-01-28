package com.noorteck.java.day9;

public class DemoVoidMethod4 {

	public static void main(String[] args) {
		addThreeNumbers(12 , 10 , 1);
		}
public static void addThreeNumbers(int num1,int num2,int num3) {
	int result = num1+num2+num3;
	System.out.println(num1 +" + "+ num2 +" + "+ num3 + " = "+ result);
	
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

