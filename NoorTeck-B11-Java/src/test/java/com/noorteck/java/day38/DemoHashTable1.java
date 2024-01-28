package com.noorteck.java.day38;

import java.util.Hashtable;
import java.util.TreeMap;

public class DemoHashTable1 {
	public static void main(String[]args) {
		
		
Hashtable<String, String> stateMap = new Hashtable<String, String>();
		
		stateMap.put("VA",  "Virginia");
		stateMap.put("CA",  "California");
		stateMap.put("FL",  "Florida");
		stateMap.put("NY",  "New York");
		stateMap.put("AZ",  "Arizona");
		stateMap.put("AL",  "Alaska");
		
		System.out.println(stateMap);
		System.out.println("*******************************");
		
		//Key can not be null
		stateMap.put(null,  "North Carolina");// ERROR because we can not have null Key
		System.out.println(stateMap);
		System.out.println("*******************************");
		
		//Value can not be null
		stateMap.put("SC", null);//ERROR because we can not have null Value
		System.out.println(stateMap);
	}

}
