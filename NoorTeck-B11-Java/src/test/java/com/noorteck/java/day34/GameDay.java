package com.noorteck.java.day34;

public class GameDay extends GameDay2 implements Soccer {

	@Override
	public void setCup() {
		System.out.println("Football");
	}

	@Override
	public void setWorldCup() {
		System.out.println("World Cup");
	}

}
