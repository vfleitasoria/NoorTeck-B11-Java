package com.noorteck.java.day24;

public class Exercise3 {
	public static void main(String[]args) {
		int n1 [] = {6, 1, 2, 3};
		int n2 [] = {13, 6, 1, 2, 3};
		int n3 [] = {0, 1, 4, 3 ,6};
		int n4 [] = {0, 6, 0};
		
		int r1 = getTotal(n1); 
		int r2 = getTotal(n2); 
		int r3 = getTotal(n3); 
		int r4 = getTotal(n4);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
	}
public static int getTotal(int num[]) {
	int result = 0;
	//Loop
	for (int i=0; i < num.length; i++) {
		result = result + num[i];
	}
	
	
	
	
	
	return result;
}
}
