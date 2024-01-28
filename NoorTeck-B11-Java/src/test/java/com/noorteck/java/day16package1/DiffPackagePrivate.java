package com.noorteck.java.day16package1;
import com.noorteck.java.day16package1.DemoPrivate;
public class DiffPackagePrivate {
	public static void main (String args[]) {
		
		//Access the static member
		System.out.println(DemoPrivate.favNum);//Expected ERROR
		DemoPrivate.add(2, 2);//Expected ERROR
		
		//Access the Non-Static member
		DemoPrivate obj = new DemoPrivate();
		System.out.println(obj.age);//Expected ERROR
		obj.subtract(10);//Expected ERROR
	}

}
