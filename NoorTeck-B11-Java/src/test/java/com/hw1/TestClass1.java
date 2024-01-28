package com.hw1;

public class TestClass1 {
	public void getTeacherData() {

		// 1. TODO call [firstName] variable, assign value = John, then print
		
		Employee obj = new Employee();//Create an object for Class Employee
		obj.firstName = "John";//Non-Static Method,Non-Static Method different Class
		System.out.println(obj.firstName);
		
		// 2. TODO call [country] variable, assign value = USA, then print
		
		Employee.country = "USA";//Non-Static Method to Static Variable in different Class
		System.out.println(Employee.country);
		
		// 3. TODO call [courseName] variable, assign value = Java OOP, then print
		
		School obj1 = new School();//Non-Static Method to Instance Variable in Different Class
		obj1.courseName = "Java OOP";//Use Same Object from the Same Class (Class School)
		System.out.println(obj1.courseName);
		
		// 4. TODO call [grade] variable, assign value = C, then print
		
		School.grade = 'C';//Non-Static Method to Instance Variable in Different Class
		System.out.println(School.grade);//Use Same Object from the Same Class (Class School)

		// 5. TODO call method [getJobID()]
		
		obj.getJobID("",0,"",true,0.0);//Non-Static Method,Non-Static Method different Class 
		                               //Use Same Object from the Same Class (Class Employee)
		
		// 6. TODO call method [getAverageExam()]
		
		obj1.getAverageExam("",0,0,0);//Non-Static Method,Non-Static Method different Class 
                                      //Use Same Object from the Same Class (Class School)
		// 7. TODO call method [setCountryInfo()]
		
		Employee.setCountryInfo("USA",00000);//Non-Static Method to Static Method Different Class
		
		// 8. TODO call method [getGrade()]
		
		School.getGrade("", "", 0.0);//Non-Static Method to Static Method in Different Class
		
	}

	public static void getTeacherInfo() {

		// 9. TODO call [firstName] variable, assign value = Tom, then print
		Employee obj = new Employee();//Static Method to Instance Variable in the Different Class
		obj.firstName = "Tom";
		
		// 10. TODO call [country] variable, assign value = England, then print
		
		Employee.country = "England";//Static Method to Static Variable in the Different Class
		
		// 11. TODO call [courseName] variable, assign value = Selenium, then print
		
		School obj1 = new School();//Static Method to Instance Variable in the Different Class
		obj1.courseName = "Selenium";
		System.out.println(obj1.courseName);
		
		// 12. TODO call [grade] variable, assign value = F, then print
		
		School.grade ='F';//Static Method to Static Variable in the Different Class
        System.out.println(School.grade);
		
		// 13. TODO call method [getJobID()]
		
		obj.getJobID("", 0,"",false,0);//Static Method to Non-Static Method in Different Class
		
		// 14. TODO call method [getAverageExam()]
		
		obj1.getAverageExam("", 0 , 0 , 0);//Static Method to Non-Static Method in Different Class
		
		// 15. TODO call method [setCountryInfo()]
		
		Employee.setCountryInfo("", 0);//Static Method to Static Method in Different Class
		
		// 16. TODO call method [getGrade()]
		
		School.getGrade("","",0.0);//Static Method to Static Method in Different Class

	}

}
