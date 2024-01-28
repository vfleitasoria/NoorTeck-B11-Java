package com.hw1;

public class TestClass4 {
	public void getStreetData() {

		// 1. TODO call [lastName] variable, assign value = Johnny, then print

		Employee obj = new Employee();
		obj.lastName = "Johny"; // Non-Static to Instance Variable in Different Class
		System.out.println(obj.lastName);// Expected ERROR Private Variable

		// 2. TODO call [state] variable, assign value = TX, then print

		Employee.state = "TX"; // Non-Static to Static Variable in Different Class
		System.out.println(Employee.state);// Expected ERROR Private Variable

		// 3. TODO call [courseID] variable, assign value = 123455, then print

		School obj1 = new School();// Non-Static to Instance Variable in Different Class
		obj1.courseID = 123455; // Expected ERROR Private Variable
		System.out.println(obj1.courseID);

		// 4. TODO call [isHomework] variable, assign value = true, then print

		School.isHomework = true; // Non-Static to Instance Variable in Different Class
		System.out.println(School.isHomework);// Expected ERROR Private Variable

		// 5. TODO call method [getFullName()]

		obj.getFullName();// Non-Static to Non-Static Method in Different Class
							// Use same object created for Class Employee
							// Expected ERROR Private Variable

		// 6. TODO call method [setState()]

		Employee.setState("", "");// Non-Static to Static Method in Different Class
									// Expected ERROR Private Variable

		// 7. TODO call method [getNumOfStudentsInClass()

		obj1.getNumOfStudentsInClass();// Non-Static to Non-Static Method in Different Class
										// Expected ERROR Private Variable

		// 8. TODO call method [getExamAnswer()]

		School.getExamAnswer();// Non-Static to Non-Static Method in Different Class
								// Expected ERROR Private Method
								// Use same object created for Class School

	}

	public static void getStreetInfo() {

		// 9. TODO call [lastName] variable, assign value = Cena, then print

		Employee obj = new Employee();// Static to Non-Static Method in Different Class
		obj.lastName = "Cena"; // Expected ERROR Private Variable
		System.out.println(obj.lastName);

		// 10. TODO call [state] variable, assign value = CA, then print

		Employee.state = "CA";// Static Method to Static Variable in Different Class
								// Expected ERROR Private Variable

		// 11. TODO call [courseID] variable, assign value = 7890, then print

		School obj1 = new School();// Static Method to Instance Variable in Different Class
		obj1.courseID = 7890; // Expected ERROR Private Variable
		System.out.println(obj1.courseID);

		// 12. TODO call [isHomework] variable, assign value = false, then print

		School.isHomework = false; // Static Method to Static Variable in Different Class
									// Expected ERROR Private Variable

		// 13. TODO call method [getFullName()]

		obj.getFullName();// Static Method to Non-Static Method in Different Class
							// Expected ERROR Private Variable
		
		// 14. TODO call method [setState()]

		Employee.setState("", "");// Static Method to Non-Static Method in Different Class
									// Expected ERROR Private Variable

		// 15. TODO call method [getNumOfStudentsInClass()]

		obj1.getNumOfStudentsInClass();// Static Method to Non-Static Method in Different Class
										// Expected ERROR Private Method
										// Use object created for School Class

		// 16. TODO call method [getExamAnswer()]

		School.getExamAnswer();// Static Method to Static Method in Different Class
								// Expected ERROR Private Method

	}

}
