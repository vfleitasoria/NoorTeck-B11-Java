package com.noorteck.java.day23;

public class DemoAr4 {

	public static void main(String[] args) {
		String state[] =  {"CA","FL","AZ","MO","VA","NY","VA","NY","NY"};
		
		System.out.println("Array Length: "+ state.length);
		System.out.println("First Element: "+ state[0]);
		System.out.println("Last Element: "+state[state.length-1]);
		
		//another approach
		
		int arrayLength = state.length-1;
		
		System.out.println("Last Element: "+state[arrayLength]);
		
		
		String firstName = "John";
		
		/**
		 If we are working with String Class then to get the Length we 
		will Use the Length()---->(Method)
		Syatem.out.println("String obj Length: "+ firstName.length());
		
		 */
		
		

	}

}
/**
 * 
    WHENEVER WE WORK WITH ARRAY
    It is IMPORTANT to Know following
    
    1. What is the length of the ARRAY-----------> LENGTH
    2. Where is the first element in the ARRAY--->INDEX ZERO
    3. Where the last element in the ARRAY------->LENGTH 1
    
 */
