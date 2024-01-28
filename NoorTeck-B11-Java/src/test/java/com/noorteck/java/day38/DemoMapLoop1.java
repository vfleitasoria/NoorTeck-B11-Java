package com.noorteck.java.day38;

import java.util.LinkedHashMap;

public class DemoMapLoop1 {

	public static void main(String[] args) {

		LinkedHashMap<String, String> stateMap = new LinkedHashMap<String, String>();

		stateMap.put("VA", "Virginia");
		stateMap.put("CA", "California");
		stateMap.put("FL", "Florida");
		stateMap.put("NY", "New York");
		stateMap.put("AZ", "Arizona");
		stateMap.put("AL", "Alaska");
		
		/** 1. keySet() 
		       ---> return the set of keys 
		       ---> return all the keys in the Map
		  */
        System.out.println(stateMap.keySet());
		System.out.println("******************************");
		
		/**
		   2. value() 
               ---> return the set of values 
               ---> return all the values in the Map 
		 */
		System.out.println(stateMap.values());
		System.out.println("******************************");
		
		/**
		   3. entrySet() 
              ---> return the set of entries 
              ---> return all the entries in the Map 
		 */
		System.out.println(stateMap.entrySet());

	}
}
