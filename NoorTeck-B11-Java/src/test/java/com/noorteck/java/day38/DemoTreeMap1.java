package com.noorteck.java.day38;

import java.util.TreeMap;

public class DemoTreeMap1 {
	
	public static void main(String[]args) {
		
		TreeMap<String, String> stateMap = new TreeMap<String, String>();
		
		stateMap.put("VA",  "Virginia");
		stateMap.put("CA",  "California");
		stateMap.put("FL",  "Florida");
		stateMap.put("NY",  "New York");
		stateMap.put("AZ",  "Arizona");
		stateMap.put("AL",  "Alaska");
		
		System.out.println(stateMap);
		
		stateMap.put("MD",  "XYZ");
		System.out.println(stateMap);
		System.out.println("****************************");
		
		//Null Value
		
		stateMap.put("SC", null);
		stateMap.put("NC",  null);
		stateMap.put("NY",  null);
		System.out.println(stateMap);
		System.out.println("****************************");
		
		//stateMap.put(null, "Test");//Expected ERROR program stop running
		
		System.out.println("This line will not be executed....");
		
	}

}
/**
          HashMap                                   LikedHashMap                                    TreeMap                             HashTable
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1. Does not keep insertion order           1. Does not keep insertion order           1. Does not keep insertion order but Store   1. Does not keep insertion order
2. Key is unique, Value can be duplicate   2. Key is unique, Value can be duplicate       in ascending Order                       2. Key is unique, Value can be duplicate
3. Can have 1 null Key                     3. Can have 1 null Key                     2. Key is unique, Value can duplicate        3. Can not be null Key
4. Can have 1 or more null Value           4. Can have 1 or more null Value           3. Can have 1 null Key                       4. Can not have null Value
5. Not Synchronized                        5. Not Synchronized                        4. Can have 1 or more null Value             5. Synchronized
                                                                                      5. Not Synchronized
* 
* HashMap is the fastest
* TreeMap is the Slower
* */