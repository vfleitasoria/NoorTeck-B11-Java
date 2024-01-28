package com.noorteck.java.day15;

public class RecapStat1 {
	int courseID;
	int studentID;
	boolean isEnrolled;
	String title;
	char grade;
	String city;
	public static int departmentID;
	public static boolean isPass;
	public static String department;
	public static double price;
	public static String state;
	public static char gender;

	public void setCourseData() {
		// 1. TODO call [courseID] variable and assign value = 123;
		courseID=123;

		// 2. TODO call [studentID] variable and assign value = 4444;
		studentID=4444;

		// 3. TODO call [isEnrolled] variable and assign value = true;
		isEnrolled = true;

		// 4. TODO print the [courseID] variable
		System.out.println(courseID);

		// 5. TODO print the [studentID] variable
		System.out.println(studentID);

		// 6. TODO print the [isEnrolled] variable
		System.out.println(isEnrolled);

		// 7. TODO call method [register()]
		register("","",1);

	}

	public void setStudentData() {

		// 8. TODO call [isPass] variable and assign value = false;
		isPass=false;

		// 9. TODO call [department] variable and assign value = Computer Science;
		department="Computer Science";

		// 10. TODO call [departmentID] variable and assign value = 890;
		departmentID=890;

		// 11. TODO print the [isPass] variable
		System.out.println(isPass);

		// 12. TODO print the [department] variable
		System.out.println(department);

		// 13. TODO print the [departmentID] variable
		System.out.println(departmentID);

		// 14. TODO call method [purchase()]
		purchase("",0,0.0);

	}

	public static void setDepartmentData() {

		// 15. TODO call [title] variable and assign value = "Java Pro";
		RecapStat1 obj = new RecapStat1();
		obj.title="Java Pro";
		

		// 16. TODO call [grade] variable and assign value = 'C';
		RecapStat1 obj1 = new RecapStat1();
		obj1.grade='0';

		// 17. TODO call [city] variable and assign value = Reston;
		RecapStat1 obj2 = new RecapStat1();
		obj2.city="Reston";

		// 18. TODO print the [title] variable
		System.out.println(obj.title);

		// 19. TODO print the [grade] variable
		System.out.println(obj1.grade);

		// 20. TODO print the [city] variable
		System.out.println(obj2.city);

		// 21. TODO call method [register()]
		RecapStat1 obj3 = new RecapStat1();
		obj3.register("","",0);
		
	}

	public static void setSchoolData() {

		// 22. TODO call [price] variable and assign value = 10.99;
		
		price=10.99;

		// 23. TODO call [gender] variable and assign value = F;
		
		gender='f';

		// 24. TODO call [state] variable and assign value = Virginia;
		
		state ="Virginia";

		// 25. TODO print the [price] variable
		
		price=0.0;

		// 26. TODO print the [gender] variable
		System.out.println(gender);

		// 27. TODO print the [state] variable
		System.out.println(state);
		

		// 28. TODO call method [purchase()]
		purchase("",0,0.0);
	}

	public void register(String firstName, String lastName, int age) {

		// 29. TODO call method [setDepartmentData()]
		setDepartmentData();

		// 30. TODO call method [setStudentData()]
		setStudentData();

	}

	public static void purchase(String itemName, int quantity, double price) {
		// 31. TODO call method [setDepartmentData()]
		RecapStat1 obj = new RecapStat1();
		obj.setDepartmentData();

		// 32. TODO call method [setStudentData()]
		
		obj.setStudentData();
	}


}
