package com.noorteck.java.day38;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DemoMapLoop2 {
	
	public static void main(String[] args) {

		LinkedHashMap<String, String> stateMap = new LinkedHashMap<String, String>();

		stateMap.put("VA", "Virginia");
		stateMap.put("CA", "California");
		stateMap.put("FL", "Florida");
		stateMap.put("NY", "New York");
		stateMap.put("AZ", "Arizona");
		stateMap.put("AL", "Alaska");

		// Loop through the set of keys using--->ketSet()
		// Enhance loop

		for (String key : stateMap.keySet()) {
			System.out.println(key);

		}
		System.out.println("***************************");

		// Loop through the set of values using--->values()
		// Enhance loop

		for (String value : stateMap.values()) {
			System.out.println(value);
		}
		System.out.println("***************************");

		// Loop through the set of entries using--->entrySet()
		// Enhance loop

		for (Map.Entry<String, String> entry : stateMap.entrySet()) {

			String key = entry.getKey();
			String value = entry.getValue();

			System.out.println(key + " : " + value);
		}

}
}
/**
 *     We can have if inside another if       (nested loop)
 *     we can have loop inside another loop   (nested loop)
 *     
 *      
 *      we can have a Class inside another Class       (nested Class)      BAD PRACTICE
 *      we can have interface inside another interface (nested Interface)  BAD PRACTICE
 * 
 * */
