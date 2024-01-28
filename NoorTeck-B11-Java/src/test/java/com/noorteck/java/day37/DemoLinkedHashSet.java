package com.noorteck.java.day37;

import java.util.LinkedHashSet;

public class DemoLinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet<String> stateSet = new LinkedHashSet<String>();

		stateSet.add("VA");
		stateSet.add("TX");
		stateSet.add("NY");
		stateSet.add("NC");
		stateSet.add("SC");
		stateSet.add("AL");
		stateSet.add("MO");
		stateSet.add("CA");

		System.out.println(stateSet);

		System.out.println("*******************");

		// No duplicated values

		stateSet.add("VA");
		stateSet.add("TX");
		stateSet.add("NY");

		System.out.println(stateSet);

		System.out.println("*******************");

		// Only 1 null value

		stateSet.add(null);
		stateSet.add(null);

		System.out.println(stateSet);

	}

}
