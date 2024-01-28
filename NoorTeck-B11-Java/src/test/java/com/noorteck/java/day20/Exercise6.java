package com.noorteck.java.day20;

public class Exercise6 {
	public static void main(String[] args) {

		Exercise6 obj = new Exercise6();
		obj.combineStr("day", "ONE", "work", "HOURS");
		obj.combineStr("week", "weekend", "monday", "Tuesday");
		obj.combineStr("restoN", "vA", "baltiMORE", "MD");
		obj.combineStr("java", "is", "fun", "LEARNING");
	}

	protected static String combineStr(String strOne, String strTwo, String strThree, String strFour) {
		String str1 = strOne.toUpperCase();
		String str2 = strTwo.toLowerCase();
		String str3 = strThree.toUpperCase();
		String str4 = strFour.toLowerCase();
		String result = str1.concat(str2).concat(str3).concat(str4);

		System.out.println(result);

		return result;
	}

}
