package com.noorteck.java.day6;

public class HWexercise4 {
	public static void main(String args[]) {

		char mathOperation = '+';
		double numOne = 20.0;
		double numTwo = 5.0;
		double result = 0;
		String message = "NONE";
		boolean isCorrectOperation = true;
		switch (mathOperation) {
		case '+':
			result = (numOne + numTwo);
			System.out.println(numOne + " + " + numTwo + " = " + result);
			break;
		case '-':
			result = (numOne - numTwo);
			System.out.println(numOne + " - " + numTwo + " = " + result);
			break;
		case '*':
			result = (numOne * numTwo);
			System.out.println(numOne + " * " + numTwo + " = " + result);
			break;
		case '/':
			result = (numOne / numTwo);
			System.out.println(numOne + " / " + numTwo + " = " + result);
			break;
		case '%':
			result = (numTwo % numOne) / 100;
			System.out.println(numOne + " % " + numTwo + " = " + result);
			break;
		default:

			System.out.println("WRONG INPUT DATA");
			isCorrectOperation = false;
			System.out.println(false);
		}

	}

}
