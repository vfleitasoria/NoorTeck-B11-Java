package com.hw1;

public class Employee {
	// instance variable
		public String firstName = "John";
		private String lastName = "Cena";
		protected char gender = 'M';
		int id = 123;

		// static variable
		public static String country = "USA";
		private static String state = "VA";
		protected static boolean isCitizen = true;
		double salary = 1111.11;

		// non-static method

		public void getJobID(String departmentName, int departmentID, String managerName, boolean isLate, double salary) {
			System.out.println("Job ID: 1234");
		}

		private void getFullName() {
			System.out.println("John Cena");
		}

		protected void getGender() {
			System.out.println("MALE");
		}

		void getManager(int empId, char gender, String dayOfTheWeek, double temperature) {
			System.out.println("Manager... ");
		}

		// static method
		public static void setCountryInfo(String country, int zipCode) {
			System.out.println("Country: " + country);
			System.out.println("ZipCode: " + zipCode);
		}

		private static void setState(String state, String city) {
			System.out.println("State: " + state);
			System.out.println("City: " + city);
		}

		protected static void checkStatus() {
			System.out.println("Status:");
		}

		static void getSalary() {
			System.out.println("Salary: ");
		}
}
	