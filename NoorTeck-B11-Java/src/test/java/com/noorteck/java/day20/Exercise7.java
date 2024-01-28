package com.noorteck.java.day20;

public class Exercise7 {
	public static void main(String[]args) {
		
		Exercise7 obj = new Exercise7();
		String r1 = obj.helloTo("Denis");
		String r2 = obj.helloTo("Malek");
		String r3 = obj.helloTo("Sara");
	}
	
	
	String helloTo(String strOne) {
		
		String name = strOne;
		String result = ("Hello " + name);		
		System.out.println(result);
	
		
		return result;
	}

}
