package com.hw1;

public class School {
	public String courseName;
	private int courseID;
	protected String teacherName;
	int numOfStudent;

	public static char grade;
	private static boolean isHomework;
	protected static boolean isGraded;
	static int averageGrade;

	// non-static method
	public void getAverageExam(String studentName, int exam1, int exam2, int exam3) {
		double result = 0;
		result = (exam1 + exam2 + exam3) / 3;
		System.out.println("Student : " + studentName);
		System.out.println("Average Exam Score; " + result);

	}

	protected void getHighestExamScore(int exam1, int exam2, String studentName) {
		double result = 0;
		if (exam1 > exam2) {
			result = exam1;
		} else {
			result = exam2;
		}
		System.out.println(studentName + " Highest Exam score: " + result);
	}

	private int getNumOfStudentsInClass() {
		int result = 10;
		return result;
	}

	String getTeacherList() {
		String result = "NONE";
		return result;
	}

	public static void getGrade(String firstName, String lastName, double temperature) {
		System.out.println("Grade: A....");
	}

	protected static void addNum(int a, int b, double c, boolean isLate, boolean isTest) {
		System.out.println("Random text from addNum()....");
	}

	static void getDifference(boolean isPassed, char gender, int zipCode, String schoolName) {
		System.out.println("Difference method... ");
	}

	private static void getExamAnswer() {
		System.out.println("Exam Answers should stay private... ");
	}
}
	
	