package com.noorteck.java.day30;

public class DemoOverloading3 {
	public void getInfo(String country,int age,char grade) {
		System.out.println(country);
		System.out.println(age);
		System.out.println(grade);
	}
	public void getInfo(int age,String country,char grade) {
		System.out.println(country);
		System.out.println(age);
		System.out.println(grade);
	}
	public void getInfo(char grade,int age,String country) {
		System.out.println(country);
		System.out.println(age);
		System.out.println(grade);
	}
	public static void main(String[]args) {
		
		DemoOverloading3 obj = new DemoOverloading3();
		obj.getInfo("USA",11,'A');
		obj.getInfo(13,"Canada",'C');
		obj.getInfo('B', 15,"England");

}
}