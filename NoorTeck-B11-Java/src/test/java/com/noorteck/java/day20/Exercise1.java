package com.noorteck.java.day20;

public class Exercise1 {
	
	public static void main(String[]args) {
		
		
		
		boolean r1 = isEqual("sdet","SDET");
		boolean r2 = isEqual("testing","testing");
		boolean r3 = isEqual("java","java");
		boolean r4 = isEqual("java","java Programing");
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}
	
	static boolean isEqual(String strOne,String strTwo) {
		boolean result = false;
		if (strOne.equals(strTwo)) {
			result = true;
		}
		
		
		return result;
	}

}
