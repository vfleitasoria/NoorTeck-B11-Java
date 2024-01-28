package com.hw2;

import com.hw1.Employee;
import com.hw1.School;

public class DemoClass4 {
public void getStreetData() {
		
		// 1. TODO call [lastName] variable, assign value = Tim, then print
	
	Employee obj = new Employee();
	obj.lastName = "Tim";
	System.out.println(obj.lastName);
	//ERROR Expected (Change the Variable to public)is Protected
	//Non-Static Method to Instance Variable in Different Class and Different Package
	//Import com.hw1/Employee Class
	//Create object for Employee Class
	
		// 2. TODO call [state] variable, assign value = NY, then print	
	
	Employee.state = "NY";
	System.out.println(Employee.state);
	//ERROR Expected (Change the Variable to public)is Protected
    //Non-Static Method to Instance Variable in Different Class and Different Package
	//Import com.hw1/Employee Class
	
		
	// 3. TODO call [courseID] variable, assign value = 234, then print
	
	School obj1 = new School();
	obj1.courseID = 234;
	System.out.println(obj1.courseID);
	//ERROR Expected (Change the Variable to public)is Protected
    //Non-Static Method to Instance Variable in Different Class and Different Package
	//Import com.hw1/School Class
	//Create object for School Class
	
		// 4. TODO call [isHomework] variable, assign value = true, then print
	
	School.isHomework = true;
	System.out.println(School.isHomework);
	//ERROR Expected (Change the Variable to public)is Protected
    //Non-Static Method to Static Variable in Different Class and Different Package
	//Import com.hw1/School Class
		
		// 5. TODO call method [getFullName()]
	
	obj.getFullName();
	//ERROR Expected (Change the Method to public)is Protected
    //Non-Static Method to Non-Static Variable in Different Class and Different Package
	//Import com.hw1/Employee Class
	//Use same object for Employee Class
	
	// 6. TODO call method [setState()]
	
	Employee.setState("","");
	//ERROR Expected (Change the Method to public)is Protected
    //Non-Static Method to Static Variable in Different Class and Different Package
	//Import com.hw1/Employee Class
		
	// 7. TODO call method [getNumOfStudentsInClass()]
	
	obj1.getNumOfStudentsInClass();
	//ERROR Expected (Change the Method to public)is Protected
    //Non-Static Method to Non-Static Variable in Different Class and Different Package
	//Import com.hw1/School Class
		
	// 8. TODO call method [getExamAnswer()]
	
	School.getExamAnswer();
	//ERROR Expected (Change the Method to public)is Protected
    //Non-Static Method to Static Variable in Different Class and Different Package
	//Import com.hw1/School Class
	
	}
	
	public static void getStreetInfo() {
		
		// 9. TODO call [lastName] variable, assign value = Cook, then print
		
		Employee obj = new Employee();
		obj.lastName "Cook";
		System.out.println(obj.lastName);
		//ERROR Expected (Change the Variable to public)is Protected
	    //Non-Static Method to Instance Variable in Different Class and Different Package
		//Import com.hw1/Employee Class
		//Create an object for Employee Class
		
		// 10. TODO call [state] variable, assign value = CO, then print
		
		Employee.state = "CO";
		System.out.println(Employee.state);
		//ERROR Expected (Change the Variable to public)is Protected
	    //Non-Static Method to Static Variable in Different Class and Different Package
		//Import com.hw1/Employee Class
		
		// 11. TODO call [courseID] variable, assign value = 1221, then print
		
		School obj1 = new School();
		obj1.courseID = 1221;
		System.out.println(obj1.courseID);
		//ERROR Expected (Change the Variable to public)is Protected
	    //Non-Static Method to Instance Variable in Different Class and Different Package
		//Import com.hw1/School Class
		//Create an object for School Class
		
		// 12. TODO call [isHomework] variable, assign value = true, then print
		
		
		School.isHomework = true;
		System.out.println(School.isHomework);
		//ERROR Expected (Change the Variable to public)is Protected
	    //Non-Static Method to Static Variable in Different Class and Different Package
		//Import com.hw1/School Class
		
		// 13. TODO call method [getFullName()]
		
		Employee.getFullName();
		//ERROR Expected (Change the Method to public)is Protected
	    //Non-Static Method to Non-Static Method in Different Class and Different Package
		//Import com.hw1/Employee Class
		
		// 14. TODO call method [setState()]
		
		Employee.setState("","");
		//ERROR Expected (Change the Method to public)is Protected
	    //Non-Static Method to Static Method in Different Class and Different Package
		//Import com.hw1/Employee Class
		
		// 15. TODO call method [getNumOfStudentsInClass()]
		
		obj1.getNumOfStudentsInClass();
		//ERROR Expected (Change the Method to public)is Protected
	    //Non-Static Method to Non-Static Method in Different Class and Different Package
		//Import com.hw1/School Class
		//Use School object
		
		// 16. TODO call method [getExamAnswer()]
		
		School.getExamAnswer();
		//ERROR Expected (Change the Method to public)is Protected
	    //Non-Static Method to Static Method in Different Class and Different Package
		//Import com.hw1/School Class

	}

}
