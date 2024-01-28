package com.noorteck.java.day20;

public class Exercise5 {
	public static void main (String[]args) {
		Exercise5 obj = new Exercise5();
		String str1 = obj.toLower ("espn");
		String str2 = obj.toLower ("soccer");
		String str3 = obj.toLower ("STRING CLASS");
		
		
	}
	
	
	
	protected String toLower(String strOne) {
		String s = strOne;
		String result = s.toLowerCase();
		System.out.println(result);
		return result;
		
	}

}
