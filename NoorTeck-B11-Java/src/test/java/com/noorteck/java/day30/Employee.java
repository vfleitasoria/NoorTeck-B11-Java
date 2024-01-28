package com.noorteck.java.day30;

public class Employee {
	public Employee(int empID) {
		System.out.println(empID);
	}
	public Employee(String name,int empID) {
		System.out.println(name);
		System.out.println(empID);
	}
	public Employee(int empID,String dept,double salary) {
		System.out.println(empID);
		System.out.println(dept);
		System.out.println(salary);
	}
	public static void main(String[]args) {
		
		Employee e1 = new Employee(123);
		Employee e2 = new Employee("John",4545);
		Employee e3 = new Employee(122,"QA",22222.2222);
		
	}
}
/**
Constructor Overloading:
	In Java we can OVERLOAD the constructor
	
	Constructor name is same but the parameters diff	
	WHen we have different parameter it can be different in one of the following ways:
	
		1. THe # of parameters are diff
		2. The data type of the parameters are diff
		3. or the Sequence of datatype is diff
*/