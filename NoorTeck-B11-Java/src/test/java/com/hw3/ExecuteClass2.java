package com.hw3;

import com.hw1.Employee;
import com.hw1.School;
import com.hw1.TestClass1;
import com.hw1.TestClass2;
import com.hw1.TestClass3;
import com.hw1.TestClass4;
import com.hw2.DemoClass1;
import com.hw2.DemoClass2;
import com.hw2.DemoClass3;

public class ExecuteClass2 {

	public static void main(String[] args) {
		// 1. TODO call method [getExamAnswer()]

		// import com.hw1.TestClass1;
		School.getExamAnswer(); // EXPECTED ERROR due to access modifier - private on static method

		// 2. TODO call method [getCityInfo()]
		// import com.hw1.DemoClass3;
		DemoClass3.getCityInfo();

		// 3. TODO call method [getStateInfo()]

		TestClass3.getStateInfo();// import com.hw1.TestClass3;

		// 4. TODO call method [getSalary()]

		// import com.hw1.Employee;
		Employee.getSalary(); // EXPECTED ERROR due to access modifier - default on static method

		// 5. TODO call method [getStudentInfo()]

		// import com.hw1.DemoClass1;
		DemoClass1.getStudentInfo();

		// 6. TODO call method [addNum()]

		// import com.hw1.School;
		School.addNum(5, 10, 9.99, false, false); // EXPECTED ERROR due to access modifier - protected on static method

		// 7. TODO call method [getTeacherInfo()]
		
		TestClass1.getTeacherInfo();

		// 8. TODO call method [getDepartmentInfo()]

		// import com.hw1.DemoClass2;
		DemoClass2.getDepartmentInfo();

		// 9. TODO call method [getDifference()]

		School.getDifference(true, 'F', 0000, ""); // EXPECTED ERROR due to access modifier - default on static method

		// 10. TODO call method [getStreetInfo()]

		// import com.hw1.TestClass4;
		TestClass4.getStreetInfo();

		// 11. TODO call method [getCountryInfo()]

		// import com.hw1.TestClass2;
		TestClass2.getCountryInfo();

		// 12. TODO call method [checkStatus()]

		Employee.checkStatus(); // EXPECTED ERROR due to access modifier - protected on static method

	}

}