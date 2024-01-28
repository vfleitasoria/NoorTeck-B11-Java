package com.noorteck.java.day37;

import java.util.Vector;

public class DemoVector5 {

	public static void main(String[] args) {

		// 1. Vector with no parameters constructor --> bay default capacity is 10

		Vector<String> v1 = new Vector<String>(3, 5);

		System.out.println("Capacity: " + v1.capacity());// 3
		System.out.println("Size: " + v1.size());// 0

		// add elements

		v1.add("VA");
		v1.add("MD");
		v1.add("VA");

		System.out.println("Capacity: " + v1.capacity());// 3
		System.out.println("Size:     " + v1.size());// 3

		v1.add("AL");

		System.out.println("Capacity: " + v1.capacity());// 8
		System.out.println("Size:     " + v1.size());// 4

		v1.add("VA");
		v1.add("MD");
		v1.add("VA");
		v1.add("AL");
		v1.add("VA");
		v1.add("MD");

		System.out.println("Capacity: " + v1.capacity());// 13
		System.out.println("Size:     " + v1.size());// 10

		v1.add("VA");
		v1.add("AL");
		v1.add("VA");
		v1.add("MD");

		System.out.println("Capacity: " + v1.capacity());// 18
		System.out.println("Size:     " + v1.size());// 14

	}
}
