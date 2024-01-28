package com.hw2;

import com.hw1.Employee;
import com.hw1.School;

public class DemoClass1 {
	public  void getStudentData() {

		// 1. TODO call method [getJobID()]
		
		Employee obj = new Employee();
		obj.getJobID("", 0,"",false,0.0);
		//Non-Static Method to Non-Static Method in Different Class and Different Package
		
		// 2. TODO call method [getAverageExam()]
		
		School obj1 = new School();
		obj1.getAverageExam("", 0, 0, 0);
		//Non-Static Method to Non-Static Method in Different Class and Different Package
		
		
		// 3. TODO call method [setCountryInfo()]
		
		Employee.setCountryInfo("", 00000);
		//Non-Static Method to Static Method in Different Class and Different Package
		
		// 4. TODO call method [getGrade()]
		
		School.getGrade("", "", 0.0);
		//Non-Static Method to Static Method in Different Class and Different Package

		// 5. TODO call [firstName] variable, assign value = Ahmad, then print
		
		obj.firstName = "Ahmad";
		System.out.println(obj.firstName);
		//Non-Static Method to Instance Variable in Different Class and Different Package
		
		// 6. TODO call [country] variable, assign value = Brazil, then print
		
		Employee.country = "Brazil";
		System.out.println(Employee.country);
		//Non-Static Method to Static Variable in Different Class and Different Package
		
		
		// 7. TODO call [courseName] variable, assign value = JavaScript, then print
		
		obj1.courseName = "JavaScript";
		System.out.println(obj1.courseName);
		//Non-Static Method to Instance Variable in Different Class and Different Package
		
		
		// 8. TODO call [grade] variable, assign value = B, then print
		
		obj1.grade = 'B';
		System.out.println(obj1.grade);
		//Non-Static Method to Instance Variable in Different Class and Different Package
		
	}

	public static void getStudentInfo() {

		// 9. TODO call method [getJobID()]
		
		Employee obj = new Employee();//Static Method to Non- Static Method in Different Class and Different Package
		obj.getJobID("", 0,"",false,0.0);
		
		
		// 10. TODO call method [getAverageExam()]
		
		School obj1 = new School();
		obj1.getAverageExam("",0,0,0);
		//Static Method to Non- Static Method in Different Class and Different Package
		
		// 11. TODO call method [setCountryInfo()]
		
		Employee.setCountryInfo("",0);
		//Static Method to  Static Method in Different Class and Different Package
		
		// 12. TODO call method [getGrade()]
		
		School.getGrade("", "", 0.0);
		//Static Method to  Static Method in Different Class and Different Package
		

		// 13. TODO call [firstName] variable, assign value = Abdul, then print
		
		obj.firstName = "Abdul";
		System.out.println(obj.firstName);
		//Static Method to  Instance Variable in Different Class and Different Package
		//Use object created for Employee Class
		
		// 14. TODO call [country] variable, assign value = Spain, then print
		
		Employee.country = "Spain";
		System.out.println(Employee.country);
		//Static Method to  Instance Variable in Different Class and Different Package
	    //Use object created for Employee Class
		
		// 15. TODO call [courseName] variable, assign value = Karate APi, then print
		
		obj1.courseName = "Karate Api";
		System.out.println(obj1.courseName);
		//Static Method to  Instance Variable in Different Class and Different Package
	    //Use object created for School Class
		
		// 16. TODO call [grade] variable, assign value = A, then print
		
		School.grade = 'A';
		System.out.println(School.grade);
		//Static Method to  Static Variable in Different Class and Different Package
	    //Use object created for School Class

	}

}
