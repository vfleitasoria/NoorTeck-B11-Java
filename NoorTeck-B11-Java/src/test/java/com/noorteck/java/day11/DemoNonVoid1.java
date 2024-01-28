package com.noorteck.java.day11;

public class DemoNonVoid1 {
	public static void main (String args[]) {
		
	substract(20,25);
	
	
}	
	//VOID METHOD
public static void add (int a, int b) {
	System.out.println(a + b);

}
//NON VOID METHOD

public static int substract(int a, int b) {
	int result =0;
	result =a+b;
	return result;
}
}
