package com.noorteck.java.day36;

public class DemoWrapper2 {

	public static void main(String[] args) {

		// Convert from primitive type to object type

		int age = 11;// primitive

		/**
		 * if i want to convert the primitive type to object type which method should i
		 * use? Integer.valueOf() valueOf()--->is a method in Integer Class
		 */

		Integer ageObj = Integer.valueOf(age);// Convert int to Object

		System.out.println("Primitive Age: " + age);
		System.out.println("Object Age: " + ageObj);

		System.out.println("******************");

		char gender = 'M';// Primitive type
		Character genderObj = Character.valueOf(gender);

		System.out.println("Primitive gender: " + gender);
		System.out.println("Object gender: " + genderObj);

		System.out.println("******************");

		Integer myFavNum = 4444;// Object Type
		int favNum = myFavNum.intValue();// Primitive Type
		System.out.println("Primitive myFavNum: " + favNum);
		System.out.println("Object myFavNum: " + myFavNum);

		System.out.println("******************");

		Boolean isJavaFun = true;// object type
		boolean javaFun = isJavaFun.booleanValue();// Primitive type
		System.out.println("Primitive isJavaFun: " + javaFun);
		System.out.println("Object isJavaFun: " + isJavaFun);

	}

}
