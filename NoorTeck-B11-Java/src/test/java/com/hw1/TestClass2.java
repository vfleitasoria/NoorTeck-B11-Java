package com.hw1;

public class TestClass2 {
public void getCountryData() {
		
		// 1. TODO call [id] variable, assign value = 555, then print
	
	Employee obj = new Employee();//Non-Static Method to Instance Variable in Different Class
	obj.id = 555;                 //Create and Object for Employee Class
	System.out.println(obj.id);
	
		// 2. TODO call [numOfStudent] variable, assign value = 55, then print
	
	School obj1 = new School();//Non-Static Method to Instance Variable in Different Class
	obj1.numOfStudent = 55;    //Create an object for the School Class
	System.out.println(obj1.numOfStudent);
	
		// 3. TODO call [salary] variable, assign value = 555.55, then print
	
	obj.salary = 555.55;//Non-Static Method to Instance Variable in Different Class
	System.out.println(obj.salary);
	
		// 4. TODO call [averageGrade] variable, assign value = 25, then print
	
	School.averageGrade = 25;//Non-Static Method to Static Variable in Different Class
	System.out.println(School.averageGrade);
		
		// 5. TODO call method [getManager()]
	
	obj.getManager(0,'F',"",0.0);//Non-Static Method to Non-Static Method in Different Class
	                             //Use the same object for Class Employee
		
	// 6. TODO call method [getSalary()]
	
	Employee.getSalary();//Non-Static Method to Non-Static Method in Different Class
	
		// 7. TODO call method [getTeacherList()]
	
	
	obj1.getTeacherList();//Non-Static Method to Non-Static Method in Different Class
	                          
	
		// 8. TODO call method [getDifference()]
	
	School.getDifference(false,'F',00000,"");//Non-Static Method to Non-Static Method in Different Class
	}
	
	
	public static void getCountryInfo() {
		
		// 9. TODO call [id] variable, assign value = 666, then print
		
		Employee obj = new Employee();//Static Method to Instance Variable in Different Class
		obj.id = 666;                  //Use the same object for Class School
		System.out.println(obj.id);
		
		// 10. TODO call [numOfStudent] variable, assign value = 66, then print	
		
		School obj1 = new School();//Static Method to Instance Variable in Different Class
		obj1.numOfStudent = 66;
		System.out.println(obj1.numOfStudent);
		
		// 11. TODO call [salary] variable, assign value = 666.6, then print
		
		obj.salary = 666.6;             //Static Method to Instance Variable in Different Class
		System.out.println(obj.salary); // Use same object that created for Employee Class
		
		// 12. TODO call [averageGrade] variable, assign value = 26, then print
		
		School.averageGrade = 26;//Static Method to Static Variable in Different Class
		System.out.println(School.averageGrade);
		
		// 13. TODO call method [getManager()]
		
		obj.getManager(0, 'F', "", 0.0);//Static Method to Non-Static Method in Different Class
		                                //Use same object that created for Employee Class
		
		// 14. TODO call method [getSalary()]
		
		Employee.getSalary();//Static Method to Static Method in Different Class
		
		// 15. TODO call method [getTeacherList()]
		
		obj1.getTeacherList();//Static Method to Instance Variable in Different Class
		                     //Use same object that created for School Class
		
		// 16. TODO call method [getDifference()]
		
		School.getDifference(false,'F', 0, "");//Static Method to Static Method in Different Class
		
	}

}
