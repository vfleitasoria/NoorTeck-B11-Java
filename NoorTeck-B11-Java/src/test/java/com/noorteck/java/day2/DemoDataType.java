package com.noorteck.java.day2;

public class DemoDataType {
	
	public static void main(String args[]) {
		
		//DataType variableName = values;
		//1.byte
		byte num=10;
		System.out.println(num);
		
		//2. short
		short favNum=1111;
		System.out.println(favNum);
		
		//3. int
		int age=22;
		System.out.println(age);
		
		//4. long
		long account = 12345698874166L;
		System.out.println(account);
		
	
		//5. double
		double price = 10.99;
		double temp = 55; //Java will convert this into decimal 55.0
		System.out.println(price);
		System.out.println(temp);
		
		//6. float // float always end with the letter F or f
		float balance = 100.0F;
		float amount = 200.0F;
		System.out.println(balance);
		System.out.println(amount);
		
		//7. boolean variable can hold either true or false as a value
		boolean isJavaFun = true;
		boolean isJavaBestFriend = false;
		boolean isTodaySunday = false;
		System.out.println(isJavaFun);
		System.out.println(isJavaBestFriend);
		System.out.println(isTodaySunday);
		
				
		//8. char variable
		
		/**
		 * 1.the value must be in side a "Single Quote"
		 * 2. the value must be " Character"
		 * 3. we can't have more than 1 character or less than 1 character
		 * 
		 */
		char gender ='M';
		char grade = 'A';
		System.out.println(gender);
		System.out.println(grade);
		
		
		/**9. Non-Primitive --> String --> allows store sequences of characters
		 *      1. String can hold 0, 1 or n number of characters
		 *      2.The value must be inside a "Double Quote"
		 *      
		 */
		
		String firstName = "John";
		String city = "Miami";
		String country = "USA";
		System.out.println(firstName);
		System.out.println(city);
		System.out.println(country);//This refer to the memory that we define (esta nota es solo para mi)
		System.out.println("USA");// This refer to the value that we assign (esta nota es solo para mi  
		
		
	}

}
