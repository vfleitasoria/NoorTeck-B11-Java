package com.noorteck.java.day37;

import java.util.Vector;

public class DemoVector3 {

	public static void main(String[] args) {

		// 1. Vector with no parameters constructor --> bay default capacity is 10

		Vector<String> v1 = new Vector<String>();

		System.out.println("Capacity: " + v1.capacity());// 10
		System.out.println("Size: " + v1.size());// 0

		// add elements

		v1.add("VA");
		v1.add("MD");
		v1.add("VA");
		v1.add("NY");
		v1.add("MO");
		v1.add("CA");

		System.out.println("Capacity: " + v1.capacity());// 10
		System.out.println("Size: " + v1.size());// 6

		v1.add("FL");
		v1.add("AZ");
		v1.add("NC");
		v1.add("SC");

		System.out.println("Capacity: " + v1.capacity());// 10
		System.out.println("Size: " + v1.size());// 10

		v1.add("AL");

		System.out.println("Capacity: " + v1.capacity());// 20
		System.out.println("Size: " + v1.size());// 11

	}

}
