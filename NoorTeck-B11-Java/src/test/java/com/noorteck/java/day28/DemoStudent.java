package com.noorteck.java.day28;

public class DemoStudent {
	public static void main(String[]args) {
		
		//Create an Object of Student Class
		Student obj = new Student();
		
		obj.setName("John");//Parent Class
		obj.setAge(11);//Parent Class
		obj.setGender('M');//Parent Class
		
		obj.setId(22);//Child Class
		obj.setMajor("QA");//Child Class
		
		System.out.println("Name: " + obj.getName());
		System.out.println("Age: " +obj.getAge());
		System.out.println("Gender: " +obj.getGender());
		System.out.println("ID: " +obj.getId());
		System.out.println("Major: " +obj.getMajor());
		
		
	}

}
