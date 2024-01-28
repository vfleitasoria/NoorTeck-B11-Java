package com.noorteck.java.day16package1;

public class SamePackageProtected {
	public static void main(String args[]) {
		
		//Access static member
		System.out.println(DemoProtected.count);
		DemoProtected .add(2 , 2);
		
		//Access the non static member
		DemoProtected obj = new DemoProtected();
		System.out.println(obj.gender);
		obj.subtract(2 , 1);
	}

}
