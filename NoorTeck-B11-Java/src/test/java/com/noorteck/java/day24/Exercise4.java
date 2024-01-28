package com.noorteck.java.day24;

public class Exercise4 {
	public static void main(String[] args) {

		Exercise4 obj = new Exercise4();

		int n1[] = { 6, 1, 2, 3 };
		int n2[] = { 13, 6, 1, 2, 3 };
		int n3[] = { 0, 1, 4, 3, 6 };
		int n4[] = { 0, 6, 0 };

		int [] r1=(obj.getFirstLast(n1)); // {6,3}
		int [] r2=(obj.getFirstLast(n2)); // {13, 3}
		int [] r3=(obj.getFirstLast(n3)); // {0, 6}
		int [] r4=(obj.getFirstLast(n4)); // {0, 0}
		
		for (int i = 0; i<r1.length; i++){
		System.out.println(r1[i]);
		}
		System.out.println("********************");
		
		for (int i = 0; i<r2.length; i++){
		System.out.println(r2[i]);
		}
		System.out.println("********************");
		
		for (int i = 0; i<r3.length; i++){
		System.out.println(r3[i]);
		}
		System.out.println("********************");
		
		for (int i = 0; i<r4.length; i++){
		System.out.println(r4[i]);
		}
		
	}

	int[] getFirstLast(int number[]) {
		
		int result[] = { number[0], number[number.length - 1] };

		return result;
	}
}
