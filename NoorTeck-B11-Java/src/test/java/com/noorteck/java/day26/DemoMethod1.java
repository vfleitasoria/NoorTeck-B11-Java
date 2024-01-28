package com.noorteck.java.day26;

public class DemoMethod1 {
	
	public static void main(String[]args) {
		
		
		String str = "Java";
		char strArr[] = str.toCharArray();
		for(int i=0; i<strArr.length; i++) {
			char c = strArr[i];
			System.out.println(c);
		}
	}

}
