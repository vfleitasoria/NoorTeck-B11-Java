package com.hw1;

public class TestClass3 {
public void getStateData() {
		
		// 1. TODO call [gender] variable, assign value = F, then print
	
	Employee obj = new Employee();//Non-Static Method to Instance Variable in Same Class
	obj.gender = 'F';
	System.out.println(obj.gender);
	
	
		// 2. TODO call [isCitizen] variable, assign value = true, then print
	
	Employee.isCitizen = true; //Non-Static Method to Static Variable in Different Class
	                           //Protected Variable in Different Class visible in the Same Package
	System.out.println(Employee.isCitizen);
		
	// 3. TODO call [teacherName] variable, assign value = Emily, then print
	
	School obj1 = new School();//Non-Static Method to Instance Variable in Different Class
	obj1.teacherName="Emily";  //Protected Variable in Different Class visible in the Same Package
	System.out.println(obj1.teacherName);
	
		// 4. TODO call [isGraded] variable, assign value = true, then print
	
	School.isGraded = false;//Non-Static Method to Static Variable in Different Class
	                        //Protected Variable in Different Class visible in the Same Package
		
		// 5. TODO call method [getGender()]
	
	obj.getGender();//Non-Static Method to Non-Static Method in Different Class
	                // Use the Same Object created for Class Employee
	
		// 6. TODO call method [checkStatus()]
	
	Employee.checkStatus();//Non-Static Method to Static Method in Different Class
	                       //Protected Variable in Different Class visible in the Same Package
	
		// 7. TODO call method [getHighestExamScore()]
	
	obj1.getHighestExamScore(0,0,"");//Non-Static Method to Non-Static Method in Different Class
                                     // Use the Same Object created for Class School
	                                 //Protected Variable in Different Class visible in the Same Package
	
		// 8. TODO call method [addNum()]
	
	School.addNum(0,0,0.0,false,false);//Non-Static Method to Static Method in Different Class
                                       // Use the Same Object created for Class School
                                       //Protected Variable in Different Class visible in the Same Package
	}
	
	public static void getStateInfo() {
		
		// 9. TODO call [gender] variable, assign value = M, then print
		
		Employee obj = new Employee();//Static Method to Instance Variable in Different Class
		obj.gender = 'M';
		System.out.println(obj.gender);
		
		// 10. TODO call [isCitizen] variable, assign value = false, then print	
		
		Employee.isCitizen = false;//Static Method to Static Variable in Different Class
		System.out.println(Employee.isCitizen);
		
		// 11. TODO call [teacherName] variable, assign value = Thomas, then print
		
		School obj1 = new School(); //Static Method to Instance Variable in Different Class
		obj1.teacherName = "Thomas";//Protected Variable in Different Class visible in the Same Package
		System.out.println(obj1.teacherName);
		
		// 12. TODO call [isGraded] variable, assign value = false, then print
		
		School.isGraded = false;            // Static Method to Static Variable in Different Class
		System.out.println(School.isGraded);//Protected Variable in Different Class visible in the Same Package
		
		// 13. TODO call method [getGender()]
		
		obj.getGender();//Static Method to Non-Static Method in Different Class
		                //Protected Variable in Different Class visible in the Same Package
		
		// 14. TODO call method [checkStatus()]
		
		Employee.checkStatus();//Static Method to Static Method in Different Class
                               //Protected Variable in Different Class visible in the Same Package
		
		// 15. TODO call method [getHighestExamScore()]
		
		obj1.getHighestExamScore(0, 0, "");//Static Method to Non-Static Method in Different Class
                                           //Protected Variable in Different Class visible in the Same Package
		                                   //Use same object for Class School
		// 16. TODO call method [addNum()]
		
		School.addNum(0, 0, 0.0,false,false);//Static Method to Static Method in Different Class
                                             //Protected Variable in Different Class visible in the Same Package

	}

}
