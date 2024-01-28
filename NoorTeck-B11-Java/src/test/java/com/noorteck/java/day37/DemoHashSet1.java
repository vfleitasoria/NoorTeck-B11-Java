package com.noorteck.java.day37;

import java.util.HashSet;

public class DemoHashSet1 {
	public static void main (String[]args) {
		
		
		HashSet<String> stateSet = new HashSet<String>();
		
		stateSet.add("VA");
		stateSet.add("TX");
		stateSet.add("NY");
		stateSet.add("NC");
		stateSet.add("SC");
		stateSet.add("AL");
		stateSet.add("MO");
		stateSet.add("CA");
		
		System.out.println(stateSet);
		
		System.out.println("***********************************");
		
		//duplicate element
		
		stateSet.add("VA");
		stateSet.add("TX");
		stateSet.add("NY");
		
		
		System.out.println(stateSet);
		
		
		//Null value
		
		stateSet.add(null);
		stateSet.add(null);
		stateSet.add(null);
		
		System.out.println("***********************************");
		
		System.out.println(stateSet);
		
		System.out.println("***********************************");
		
		
		stateSet.add("ABC");
		System.out.println(stateSet);
	}

}
