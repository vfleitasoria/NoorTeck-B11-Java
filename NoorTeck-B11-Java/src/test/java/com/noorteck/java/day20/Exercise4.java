package com.noorteck.java.day20;

public class Exercise4 {
	
	public static void main (String[]args) {
		Exercise4 obj = new Exercise4();
		String str1 = obj.toUpper ("Pro");
		String str2 =obj.toUpper ( "java");
		String str3 =obj.toUpper ( "java learning");
		
		
	}
	
	
	String toUpper (String strOne) {
		 String s = strOne;
		 String result = s.toUpperCase();
		 System.out.println(result);
		
		return result;
		
	}

}
