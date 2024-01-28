package com.noorteck.java.day37;

import java.util.HashSet;

public class DemoHashSet2 {
	public static void main(String[] args) {

		HashSet<String> stateSet = new HashSet<String>();

		stateSet.add("VA");
		stateSet.add("TX");
		stateSet.add("NY");
		stateSet.add("NC");
		stateSet.add("SC");
		stateSet.add("AL");
		stateSet.add("MO");
		stateSet.add("CA");

		// TODO -->Using for loop, loop through stateSet and print 1 value at a time
		// We can't make regular for int loop because is not index based

		// TODO -->Using while loop, loop through stateSet and print 1 value at a time
		// We can't make regular while loop because is not index based

		// TODO -->Using do while loop, loop through stateSet and print 1 value at a time
		// We can't make regular do while loop because is not index based

		// TODO -->Using enhanced for loop, loop through stateSet and print 1 value at a time

		for (String state : stateSet) {
			System.out.println(state);
		}

	}
}