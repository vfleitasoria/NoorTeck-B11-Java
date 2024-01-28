package com.hw2;

import com.hw1.Employee;
import com.hw1.School;

public class DemoClass2 {
	public void getDepartmentData() {

		// 1. TODO call [id] variable, assign value = 789, then print
		
		Employee obj = new Employee();
		obj.id = 789;//Expected ERROR 
		System.out.println(obj.id);
		//Non-Static Method to Instance Variable in Different Class and Different Package
		//Import the Package com.hw1 Class Employee and change to public the variable
		
		// 2. TODO call [numOfStudent] variable, assign value = 99, then print
		
		School obj1 = new School();
		obj1.numOfStudent = 99;//Expected ERROR 
		System.out.println(obj1.numOfStudent);
		//Non-Static Method to Non-Static in Different Class and Different Package
		//Import the Package com.hw1 Class School and change to public the variable
		
		// 3. TODO call method [getManager()]
		
		obj.getManager(0,'F',"",0.0);//Expected ERROR 
		//Non-Static Method to Instance Variable in Different Class and Different Package
		//Import the Package com.hw1 Class Employee and change to public the Method
		
		// 4. TODO call method [getSalary()]
		
		Employee.getSalary();//Expected ERROR 
		//Non-Static Method to Instance Variable in Different Class and Different Package
		//Import the Package com.hw1 Class Employee and change to public the Method
		
		
		// 5. TODO call [salary] variable, assign value = 785.3, then print
		 
		Employee.salary = 785.3;//Expected ERROR 
		//Non-Static Method to Instance Variable in Different Class and Different Package
		//Import the Package com.hw1 Class Employee and change to public the Variable
		
		
		// 6. TODO call [averageGrade] variable, assign value = 45, then print
		
		School.averageGrade = 45;//Expected ERROR 
		//Non-Static Method to Instance Variable in Different Class and Different Package
		//Import the Package com.hw1 Class Employee and change to public the Variable
		
		// 7. TODO call method [getTeacherList()]
		
		obj1.getTeacherList();//Expected ERROR 
		//Non-Static Method to Non-Static Method in Different Class and Different Package
		//Import the Package com.hw1 Class Employee and change to public the Method
		
		// 8. TODO call method [getDifference()]
		
		School.getDifference();//Expected ERROR 
		//Non-Static Method to Static Method in Different Class and Different Package
		//Import the Package com.hw1 Class Employee and change to public the Method

	}

	public static void getDepartmentInfo() {

		// 9. TODO call [id] variable, assign value = 458, then print
		
		Employee obj = new Employee();
		obj.id = 458;
		//Expected ERROR 
		//Static Method to Instance Variable in Different Class and Different Package
		//Import the Package com.hw1 Class Employee and change to public the Variable
		
		// 10. TODO call [numOfStudent] variable, assign value = 33, then print
		
		School obj1 = new School();
		obj1.numOfStudent = 33;
		//Expected ERROR 
		//Static Method to Instance Variable in Different Class and Different Package
		//Import the Package com.hw1 Class Employee and change to public the Variable
		
		// 11. TODO call method [getManager()]
		
		obj.getManager(0,'F',"",0.0);
		//Expected ERROR 
		//Static Method to Non-Static Method in Different Class and Different Package
		//Import the Package com.hw1 Class Employee and change to public the Method
		
		// 12. TODO call method [getSalary()]
		
		Employee.getSalary();
		//Expected ERROR 
		//Static Method to Static Method in Different Class and Different Package
		//Import the Package com.hw1 Class Employee and change to public the Method
		
		// 13. TODO call [salary] variable, assign value = 7854.35, then print
		
		Employee.salary = 7854.35;
		System.out.println(Employee.salary);
		//Expected ERROR 
		//Static Method to Static Variable in Different Class and Different Package
		//Import the Package com.hw1 Class Employee and change to public the Variable
		
		// 14. TODO call [averageGrade] variable, assign value = 88, then print
		
		School.averageGrade = 88;
		System.out.println(School.averageGrade);
		//Expected ERROR 
		//Static Method to Instance Variable in Different Class and Different Package
		//Import the Package com.hw1 Class Employee and change to public the Variable
		
		// 15. TODO call method [getTeacherList()]
		
		obj1.getTeacherList();
		//Expected ERROR 
		//Static Method to Non-Static Method in Different Class and Different Package
		//Import the Package com.hw1 Class Employee and change to public the Method
		
		// 16. TODO call method [getDifference()]
		
		School.getDifference(false,'F',0,"");
		//Expected ERROR 
		//Static Method to Static Method in Different Class and Different Package
		//Import the Package com.hw1 Class Employee and change to public the Method
		
	}

}
