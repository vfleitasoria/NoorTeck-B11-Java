package com.noorteck.java.day37;

import java.util.TreeSet;

public class DemoTreeSet {
	
	public static void main(String[] args) {

		TreeSet<String> stateSet = new TreeSet<String>();

		stateSet.add("VA");
		stateSet.add("TX");
		stateSet.add("NY");
		stateSet.add("NC");
		stateSet.add("SC");
		stateSet.add("AL");
		stateSet.add("MO");
		stateSet.add("CA");
		
		System.out.println(stateSet);
		
		System.out.println("*******************************");
		
		//No duplicated elements
		
		stateSet.add("VA");
		stateSet.add("TX");
		stateSet.add("NY");
		
		System.out.println("Not duplicated Elements "+stateSet);
		
		//Can not have null value --->Exception
		
		stateSet.add(null);//EXPECTED ERROR
		System.out.println("This line will not be printed...");
		
		
		
		
		
		
		

}
}
