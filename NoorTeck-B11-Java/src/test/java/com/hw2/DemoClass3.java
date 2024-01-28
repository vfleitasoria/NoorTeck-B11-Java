package com.hw2;

import com.hw1.Employee;
import com.hw1.School;

public class DemoClass3 {
	public void getCityData() {

		// 1. TODO call [gender] variable, assign value = F, then print
		
		Employee obj = new Employee();
		obj.gender = 'F';
		System.out.println(obj.gender);
		//Expected ERROR (change variable to public)is Protected
		//Non-Static Method to Instance Variable in Difference Class and Different Package
		//Import com.hw1, Employee Class
		
		// 2. TODO call [isCitizen] variable, assign value = true, then print
		
		obj.isCitizen = true;
		//Expected ERROR (change variable to public)is Protected
		//Non-Static Method to Instance Variable in Difference Class and Different Package
		//Import com.hw1, Employee Class
		
		// 3. TODO call method [getHighestExamScore()]
		
		School obj1 = new School();
		obj1.getHighestExamScore(0,0,"");
		//Expected ERROR (change Method to public)is Protected
		//Non-Static Method to Non-Static Method in Difference Class and Different Package
		//Import com.hw1, School Class
		
		// 4. TODO call method [addNum()]
		
		obj1.addNum(0,0,0.0,false,false);
		//Expected ERROR (change Method to public)is Protected
		//Non-Static Method to Non-Static Method in Difference Class and Different Package
		//Import com.hw1, School Class
		
		// 5. TODO call [teacherName] variable, assign value = Michelle, then print
		
		obj1.teacherName ="Michelle";
		System.out.println(obj1.teacherName);
		//Expected ERROR (change Variable to public)is Protected
		//Non-Static Method to Instance Variable in Difference Class and Different Package
		//Import com.hw1, School Class
		
		// 6. TODO call [isGraded] variable, assign value = false, then print
		
		School.isGraded = false;
		System.out.println(School.isGraded);
		//Expected ERROR (change Variable to public)is Protected
		//Non-Static Method to Instance Variable in Difference Class and Different Package
		//Import com.hw1, School Class
		
		// 7. TODO call method [getGender()]
		
		obj.getGender();
		//Expected ERROR (change Method to public)is Protected
		//Non-Static Method to Non-Static Method in Difference Class and Different Package
		//Import com.hw1, Employee Class
		
		// 8. TODO call method [checkStatus()]
		
		Employee.checkStatus();
		//Expected ERROR (change Method to public)is Protected
		//Non-Static Method to Static Method in Difference Class and Different Package
		//Import com.hw1, Employee Class

	}

	public static void getCityInfo() {

		// 9. TODO call [gender] variable, assign value = M, then print
		
		Employee obj = new Employee();
		obj.gender = 'M';
		//Expected ERROR (change Variable to public)is Protected
		//Static Method to Non-Static Method in Difference Class and Different Package
		//Import com.hw1, Employee Class
		
		// 10. TODO call [isCitizen] variable, assign value = true, then print
		
		Employee.isCitizen = true;
		System.out.println(Employee.isCitizen);
		//Expected ERROR (change Variable to public)is Protected
		//Static Method to Static Variable in Difference Class and Different Package
		//Import com.hw1, Employee Class
		
		// 11. TODO call method [getHighestExamScore()]
		
		School.getHighestExamScore(0,0,"");
		//Expected ERROR (change Method to public)is Protected
		//Static Method to Non-Static Method in Difference Class and Different Package
		//Import com.hw1, School Class
		
		// 12. TODO call method [addNum()]
		
		School.addNum(0,0,0.0,false,false);
		//Expected ERROR (change Method to public)is Protected
		//Static Method to Non-Static Method in Difference Class and Different Package
		//Import com.hw1, School Class
		
		// 13. TODO call [teacherName] variable, assign value = Mike, then print
		
		School.teacherName = "Mike";
		System.out.println(School.teacherName);
		//Expected ERROR (change Variable to public)is Protected
		//Static Method to Static Variable in Difference Class and Different Package
		//Import com.hw1, School Class
		
		// 14. TODO call [isGraded] variable, assign value = false, then print
		
		School.isGraded = false;
		System.out.println(School.isGraded);
		//Expected ERROR (change Variable to public)is Protected
		//Static Method to Static Variable in Difference Class and Different Package
		//Import com.hw1, School Class
		
		// 15. TODO call method [getGender()]
		
		obj.getGender();
		//Expected ERROR (change Method to public)is Protected
		//Static Method to Non-Static Variable in Difference Class and Different Package
		//Import com.hw1, School Class
		
		// 16. TODO call method [checkStatus()]
		
		Employee.checkStatus();
		//Expected ERROR (change Method to public)is Protected
		//Static Method to Static Variable in Difference Class and Different Package
		//Import com.hw1, School Class

	}

}
