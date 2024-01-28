package com.noorteck.java.day11;

public class Exercise2 {
	public static void main(String args[]) {
		calculate(2, 6, '*');
		calculate(20,16,'-');
		calculate(20,5,'/');
		calculate(2,5,'+');
		calculate(2,5,'@');
		calculate(2,5,'%');
		}

	public static void calculate(double numOne, double numTwo, char mathOperationType) {
		String message = "";
		double result = 0.0;
		if (mathOperationType == '+') {
			result = numOne + numTwo;
			System.out.println(numOne + "+" + numTwo + "=" + result);
		} else if (mathOperationType == '-') {
			result=numOne-numTwo;
			System.out.println(numOne + "-" + numTwo + "=" + result);
		} else if (mathOperationType == '*') {
			result=numOne*numTwo;
			System.out.println(numOne + "*" + numTwo + "=" + result);
		} else if (mathOperationType == '/') {
			result=numOne/numTwo;
			System.out.println(numOne + "/" + numTwo + "=" + result);
		} else {
			System.out.println("INVALID OPERATION");

			System.out.println(numOne + "" + mathOperationType + numTwo + "" + result);
		}
System.out.println("*********************");

	}
}
