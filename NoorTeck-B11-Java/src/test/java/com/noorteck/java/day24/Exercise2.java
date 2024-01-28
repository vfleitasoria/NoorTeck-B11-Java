package com.noorteck.java.day24;

public class Exercise2 {
	
	public static void main(String[]args) {
		Exercise2 obj = new Exercise2();
		char c1 [] = {'a','b','x','d','a','d','e','q','a'};
		char c2 [] = {'x','d','a','d','e','q','a'};
		char c3 [] = {'e','d','a','d','e','q','a' ,'e'};
		char c4 [] = {'a'};
		boolean r1 = obj.sameFirstLast(c1); // TRUE
		boolean r2 = obj.sameFirstLast(c2); // FALSE
		boolean r3 = obj.sameFirstLast(c3); // TRUE
		boolean r4 = obj.sameFirstLast(c4); // FALSE
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		
		
	}
protected boolean sameFirstLast(char[]c) {
	boolean result= false;
	
	
	if (c.length > 1 && c[0] == c[c.length-1]) {
		result = true;
	}
	
	
	
	return result;
}
}
