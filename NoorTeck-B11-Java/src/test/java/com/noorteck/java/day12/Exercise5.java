package com.noorteck.java.day12;

public class Exercise5 {
	public static void main(String args[]) {
		
		boolean status1 = positiveNegative (-3,5,false);//negative, positive,false = true
		boolean status2 = positiveNegative (-4,-2,true);// negative, negative, true = true
		System.out.println(status1);
		System.out.println(status2);

	}

	public static boolean positiveNegative(int numOne, int numTwo, boolean isStatus) {
		boolean result = true;
		if ((numOne < 0 && numTwo > 0) && isStatus == false) {
			result = true;
		} else if ((numOne > 0 && numTwo < 0) && isStatus == false)
		{result = true;
		}else if ((numOne < 0 && numTwo < 0) && isStatus == true)
		{result = true;
		}else {
			result=false;
		}

		return result;
	}
}
