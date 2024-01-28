package com.noorteck.java.day8;

public class HurricaneForLoop1 {
	public static void main(String args[]) {
/** Write a Java program that loops through numbers from 100 --> 200.
 * In the loop body apply the logic that determines the Category Number and Wind Speed
 * 
 * If the number (100-->200)falls the under the required Wind Speed
 *         *Then print the Category Number and Wind Speed.
 * If the number does not fall under the required Wind Speed then don't print anything.
 */
		int category = 0;
		

		for (int i = 101; i <= 200; i++) {

			if (i >= 101 && i <= 103) {
				category = 1;
				i++;

			} else if (i > 115 && i <= 118) {
				category = 2;
				i++;

			} else if (i > 130 && i <= 136) {
				category = 3;
				i++;

			} else if (i > 154 && i <= 155) {
				category = 4;
				i++;

			} else if (i > 190 && i <= 194) {
				category = 5;
				i++;

			} else {
				continue;

			}
			System.out.println("Category" + " " +":"+ category + " " + "Windspeed" +" "+":"+ i);

		}

	}

}
