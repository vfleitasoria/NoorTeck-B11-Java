package com.noorteck.java.day12;

public class Exercise2 {
	public static void main(String args[]) {

		boolean monkey1 = monkeyTrouble(true,true);
		boolean monkey2 = monkeyTrouble(false,false);
		boolean monkey3 = monkeyTrouble(true,false);
		boolean monkey4 = monkeyTrouble(false,true);
		System.out.println(monkey1);
		System.out.println(monkey2);
		System.out.println(monkey3);
		System.out.println(monkey4);

	}

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		boolean result = false;
		if (aSmile == bSmile);
		result = true;

		return result;
	}
}
