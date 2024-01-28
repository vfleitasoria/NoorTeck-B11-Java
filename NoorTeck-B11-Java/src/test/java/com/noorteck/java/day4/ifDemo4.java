package com.noorteck.java.day4;

public class ifDemo4 {

	public static void main(String args[]) {

		/**
		 * Favorite Numbers List Ahmed: 4 Faraz: 16 Cindy: 5 Vladimir: 50
		 * 
		 */

		int favNum = 1111;
		if (favNum == 4) {
			System.out.println("Ahmed's fav number...");
		} else if (favNum == 5) {
			System.out.println("Cindy's fav number...");
		} else if (favNum == 16) {
			System.out.println("Faraz's fav number...");
		} else if (favNum == 50) {
			System.out.println("Vladimir's fav number...");
		} else {
			System.out.println("Nobody fav number...");
		}

	}

}
