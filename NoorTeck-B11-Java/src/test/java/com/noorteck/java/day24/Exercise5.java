package com.noorteck.java.day24;

public class Exercise5 {
	public static void main (String[]args) {
		
		Exercise5 obj = new Exercise5 ();
		int n1 [] = {6, 1, 2, 3};
		int n2 [] = {13, 3};
		int n3 [] = {0, 1, 4};
		int n4 [] = {6};
		
		int [] r1 = obj.getDouble(n1); // {0,0,0,0,0,0,0,3}
		int [] r2 = obj.getDouble(n2); // {0,0,0, 3}
		int [] r3 = obj.getDouble(n3); // {0,0,0,0,0,4}
		int [] r4 = obj.getDouble(n4); // {0,6}
		
		obj.toPrint(r1);
		obj.toPrint(r2);
		obj.toPrint(r3);
		obj.toPrint(r4);
		
	}
	void toPrint(int num[]) {
		
		System.out.println("*****************");
		for(int i=0 ; i< num.length; i++)
			 System.out.println(num[i]);
	}
		
		
	
private int[] getDouble(int number []) {
	
	int  result[]= new int [number.length*2];
	
	result [result.length-1]=number[number.length-1];
	
	
	return result;
}
}
/**
5. Write a method that takes an array of int parameter and return a new array with double
the size/length, where its last element value is the same as the original array last
element, and all the other element values are 0.
*/