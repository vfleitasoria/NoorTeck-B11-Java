package com.noorteck.java.day31;

public class TheSon extends TheDad {
	
	public void password() {//Expected ERROR
		System.out.println("Changing to: 123ABC");
	}
	
	/**
	 * Cannot override because private can only be accessed from same class
	 */
	@Override
	private void bankAccount() {//Expected ERROR
		System.out.println("123456 Bank");
	}

	//Static Method cannot be Override
	
	@Override
	public static void add(int a, int b) {//Expected ERROR
		System.out.println(a+b);
		
		//Static Method cannot be overriding
	
}
}
/**
   password() is final in parent class
   we cannot override final parent class
*/