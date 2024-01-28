package com.hw3;

import com.hw1.Employee;
import com.hw1.School;
import com.hw1.TestClass1;
import com.hw1.TestClass2;
import com.hw1.TestClass3;
import com.hw2.DemoClass1;
import com.hw2.DemoClass2;
import com.hw2.DemoClass3;
import com.hw2.DemoClass4;

public class ExecuteClass1 {
	
	public static void main(String[] args) {

		// 1. TODO call method [getTeacherData()]
		
		TestClass1 obj = new TestClass1();//Import com.hw1.TestClass1;
		obj.getTeacherData();
		
		// 2. TODO call method [getNumOfStudentsInClass()]
		
		School obj1 = new School();//import com.hw1.School Class;
		obj1.getNumOfStudentsInClass(); //EXPECTED ERROR due to access modifier - private on non-static method
		
		// 3. TODO call method [getStudentData()]
		
		DemoClass1 obj2 = new DemoClass1();//import com.hw1.DemoClass1;
		obj2.getStudentData();
		
		// 4. TODO call method [getCountryData()]
		
		TestClass2 obj3 = new TestClass2();//import com.hw1.TestClass2;
		obj3.getCountryData();
		
		// 5. TODO call method [getManager()]
		
		Employee obj4 = new Employee();//import com.hw1.Employee;
		obj4.getManager(1234,'F',"Thurday",99.9); //EXPECTED ERROR due to access modifier - default on non-static method
		
		// 6. TODO call method [getDepartmentData()]
		
		DemoClass2 obj5 = new DemoClass2();
		obj5.getDepartmentData();
		
		// 7. TODO call method [getTeacherList()]
		
		obj1.getTeacherList(); //EXPECTED ERROR due to access modifier - default on non-static method
		
		// 8. TODO call method [getStateData()]
		
		TestClass3 obj6 = new TestClass3();//import com.hw1.TestClass3;
		obj6.getStateData();
		
		// 9. TODO call method [getCityData()]
		
		DemoClass3 obj7 = new DemoClass3();//import com.hw1.DemoClass3;
		obj7.getCityData();
		
		// 10. TODO call method [setState()]
		
		Employee.setState("Florida","Valrico"); //EXPECTED ERROR due to access modifier - private on static method
		
		// 11. TODO call method [getStreetData()]
		
		DemoClass4 obj8 = new DemoClass4();//import com.hw1.DemoClass4;
		obj8.getStreetData();
		
		// 12. TODO call method [getHighestExamScore()]
		
		obj1.getHighestExamScore(100,99,"Brian P"); //EXPECTED ERROR due to access modifier - protected on non-static method

	}
}