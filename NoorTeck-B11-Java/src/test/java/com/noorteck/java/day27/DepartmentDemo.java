package com.noorteck.java.day27;

public class DepartmentDemo {
	public void main (String[]args) {
		
		Department obj = new Department();
		
		obj.setDepartmentName("QA");
		obj.setNumOfEmp(11);
		System.out.println(obj.getDepartmentName());
		System.out.println(obj.getNumOfEmp());
		
		
	}

}
