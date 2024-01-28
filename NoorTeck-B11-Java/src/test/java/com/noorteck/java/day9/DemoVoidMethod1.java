package com.noorteck.java.day9;

public class DemoVoidMethod1 {
	public static void main(String args[]) {
		isNumEqual(5, 10);
		isNumEqual(255, -888);
		isNumEqual(765, 123);
		isNumEqual(22, 999);
	}

	public static void isNumEqual(int n1, int n2) {
		if (n1 == n2) {
			System.out.println("Equals");
		} else {
			System.out.println("NOT EQUALS");
		}
	}
}
