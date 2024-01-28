package com.noorteck.java.day8;

public class CozaLozaForLoop2 {
	public static void main(String args[]) {

		String coza = "Coza";
		String loza = "Loza";
		String cozaloza = "CozaLoza";
		int i = 1;
		while (i <= 50) {
			System.out.println(i);
			i++;

			if (i % 3 == 0) {
				System.out.println(coza);
			} else if (i % 5 == 0) {
				System.out.println(loza);
			} else if (i % 7 == 0) {
				System.out.println(cozaloza);
			}

		}
	}

}
