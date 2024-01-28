package com.noorteck.java.day8;

public class HurricaneDoWhileLoop2 {

	public static void main(String[] args) {

		/**
		 * • ClassName: HurricaneWhileLoop Write a java program that loops through
		 * numbers from 100 - 200. In the loop body apply the logic that determines the
		 * Category Number and the Wind Speed. • If the number (100 - 200) falls the
		 * under the required Wind Speed o then print the Category Number and Wind
		 * Speed. • If the number does not fall under the required Wind Speed then don’t
		 * print anything.
		 * 
		 * Category Wind Speed 1 ------->101-103 2 ------->115-118 3 ------->130-136 4
		 * ------->154-155 5 ------->190-194
		 */

		int category = 0;
		int i = 100;

		while (i <= 200) {

			if (i >= 101 && i <= 103) {
				System.out.println("Category Number : 1 Windspeed: " + i);

			} else if (i >= 115 && i <= 118) {
				System.out.println("Category Number : 2 Windspeed: " + i);

			} else if (i >= 130 && i <= 136) {
				System.out.println("Category Number : 3 Windspeed: " + i);

			} else if (i >= 154 && i <= 155) {
				System.out.println("Category Number : 4 Windspeed: " + i);

			} else if (i >= 190 && i <= 194) {
				System.out.println("Category Number : 5 Windspeed: " + i);

			}
			i++;

		}
System.out.println("*************************");
int category1 = 0;
int x = 100;
do {



	if (x >= 101 && x <= 103) {
		System.out.println("Category Number : 1 Windspeed: " + i);

	} else if (x >= 115 && x <= 118) {
		System.out.println("Category Number : 2 Windspeed: " + i);

	} else if (x >= 130 && x <= 136) {
		System.out.println("Category Number : 3 Windspeed: " + i);

	} else if (x >= 154 && x <= 155) {
		System.out.println("Category Number : 4 Windspeed: " + i);

	} else if (x>= 190 && x <= 194) {
		System.out.println("Category Number : 5 Windspeed: " + i);

	}
	i++;}
	while (x <= 200);
	System.out.println(category1);}
	}
		
	


	
