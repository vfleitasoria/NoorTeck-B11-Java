package com.noorteck.java.day32;

public class ADemo {
	
	public static void main(String[]args) {
		
		//Parent Reference
		Ahmed obj;
		System.out.println("***************From Ahmed Class***************");
		obj = new Ahmed();
		obj.speakMode();
		obj.behaveMode();
		obj.topicToTalkList();
		System.out.println("***************From Child Class***************");
		obj = new AChild();
		obj.speakMode();
		obj.behaveMode();
		obj.topicToTalkList();
		System.out.println("***************From AFriend Class***************");
		obj = new AFriend();
		obj.speakMode();
		obj.behaveMode();
		obj.topicToTalkList();
		System.out.println("***************From ARealMadridFan Class***************");
		obj = new ARealMadridFan();
		obj.speakMode();
		obj.behaveMode();
		obj.topicToTalkList();
		System.out.println("***************From AStudent Class***************");
		obj = new AStudent();
		obj.speakMode();
		obj.behaveMode();
		obj.topicToTalkList();
		
		
		
		
		
	}

}
