package com.noorteck.java.day15;

public class RecapStat2 {
	public void getCourseData() {
		// 1. TODO call [courseID] variable and assign value = 786;
		RecapStat1 obj = new RecapStat1();
		obj.courseID = 786;

		// 2. TODO call [title] variable and assign value = "Biology";
		
		obj.title="Biology";

		// 3. TODO print the [courseID] variable
		System.out.println(obj.courseID);

		// 4. TODO print the [title] variable
		System.out.println(obj.title);
	}

	public void getStudentData() {

		// 5. TODO call [departmentID] variable and assign value = 454;
		RecapStat1.departmentID = 454;
		
		// 6. TODO call [department] variable and assign value = Math;
		RecapStat1.department="Math";

		// 7. TODO print the [departmentID] variable
		System.out.println(RecapStat1.departmentID);

		// 8. TODO print the [department] variable
		System.out.println(RecapStat1.department);

	}

	public void getSchoolData() {
		// 9. TODO call method [register()]
		RecapStat1 obj = new RecapStat1();
		obj.register("", "", 0);

		// 10. TODO call method [setStudentData()]
		
		obj.setStudentData();

		// 11. TODO call method [setCourseData()]
		
		obj.setCourseData();

	}

	public void getDepartmentData() {
		// 12. TODO call method [purchase()]
		RecapStat1.purchase("",0,0.0);


		// 13. TODO call method [setDepartmentData()]
		RecapStat1.setDepartmentData();

		// 14. TODO call method [setSchoolData()]
		RecapStat1.setSchoolData();

	}



}
