package com.noorteck.java.day5;

public class exercise8 {
	public static void main (String args []) {
		char mathOperation = '/';
		double numOne = 20.0;
		double numTwo = 5.0;
		double result = 0;
		String message = "NONE";
		boolean isCorrectOperation = true;
		
		if (mathOperation == '+') {
			result =(numOne + numTwo);
			System.out.println (numOne + " + " + numTwo + " = " + result);}
		else if (mathOperation == '-') {
			result =(numOne - numTwo);
			System.out.println (numOne + " - " + numTwo + " = " + result);}
		else if (mathOperation == '*') {
			result =(numOne * numTwo);
			System.out.println (numOne + " * " + numTwo + " = " + result);}
		else if (mathOperation == '/') {
			result =(numOne / numTwo);
			System.out.println (numOne + " / " + numTwo + " = " + result);}
		else if (mathOperation == '%') {
			result =((numOne * numTwo)/100);
			System.out.println (numOne + " & " + numTwo + " = " + result);}
		else  {
			message = "WRONG INPUT DATA";
			isCorrectOperation = false;
			System.out.println (message);
			System.out.println (isCorrectOperation);}
			
			
	}

}
