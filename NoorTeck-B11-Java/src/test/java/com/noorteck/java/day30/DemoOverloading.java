package com.noorteck.java.day30;

public class DemoOverloading {

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);

	}

	public void add(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);

	}

	public void add(int a, int b, int c, int d, int f) {
		System.out.println(a + b + c + d + f);

	}

	public static void main(String[] args) {

		DemoOverloading obj = new DemoOverloading();

		obj.add(2, 1);
		obj.add(2, 1, 3);
		obj.add(2, 1, 3, 4);
		obj.add(2, 1, 3, 4, 5);

	}
}
