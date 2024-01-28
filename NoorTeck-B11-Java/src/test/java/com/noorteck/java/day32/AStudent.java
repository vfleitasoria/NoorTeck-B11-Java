package com.noorteck.java.day32;

public class AStudent extends Ahmed {
	
	@Override
	public void speakMode() {
		System.out.println("Confused & muted...");
	}
	
	@Override
	public void behaveMode() {
		System.out.println("Still confused, try to understand ");
	}
	
	
	@Override
	public void topicToTalkList() {
		System.out.println("Java...");
	}
}


