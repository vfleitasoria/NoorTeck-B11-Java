package com.noorteck.java.day8;

public class CozaLozaForLoop1 {
	public static void main(String args[]) {

		String coza = "Coza";
		String loza = "Loza";
		String woza="Woza";
		String cozaloza = "CozaLoza";
		String wozaloza="WozaLoza";
		
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				System.out.println(coza);
			}else if(i%5 == 0) {
				System.out.println(loza);
			}else if (i%7 == 0) {
				System.out.println(woza);
				
			}else if (i%3==0 && i%5==0){
			   System.out.println(cozaloza);
			   
			   } else if (i%5==0 && i%7==0){
			   System.out.println(wozaloza);
			   
			   }else {
			
			System.out.println(i);}
		}
			
			
			}}
			
		
	
