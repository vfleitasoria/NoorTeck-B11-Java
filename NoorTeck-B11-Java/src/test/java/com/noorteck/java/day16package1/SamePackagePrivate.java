package com.noorteck.java.day16package1;

public class SamePackagePrivate {
	public static void main(String args[]) {
		
		//Access the static member
		System.out.println(DemoPrivate.favNum);//Expected ERROR
		DemoPrivate.add = (2 , 2);//Expected ERROR
		//Access the Non-Static member
		DemoPrivate obj =new DemoPrivate();
		System.out.println(obj.age);//Expected ERROR
		obj.subtract(2 , 1);//Expected ERROR
		
		
		
	}

}
