package com.noorteck.java.day36;

import java.util.ArrayList;

public class DemoArrayList2 {

	public static void main(String[] args) {

		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(2);
		numList.add(5);
		numList.add(6);
		numList.add(23);
		numList.add(656);
		numList.add(22);
		numList.add(33);
		numList.add(22);
		numList.add(33);
		numList.add(1);
		numList.add(11);

		// Enhance for loop
		for (Integer num : numList) {
			System.out.println(num);
		}
		System.out.println("**************");
		// Regular for loop
		for (int i = 0; i < numList.size(); i++) {
			System.out.println(numList.get(i));
		}
		System.out.println("**************");

		// While loop
		int k = 0;
		while (k < numList.size()) {
			System.out.println(numList.get(k));
			k++;
		}
		System.out.println("**************");

		// Do while loop
		int j = 0;
		do {
			System.out.println(numList.get(j));
			j++;
		} while (j < numList.size());

	}

}
