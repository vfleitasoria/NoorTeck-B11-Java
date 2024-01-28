package com.noorteck.java.day21;

public class DemoSB2 {
	public static void main(String[] args) {

		// String Builder
		StringBuilder sBuilder = new StringBuilder("Java");

		sBuilder.reverse();
		System.out.println(sBuilder);// avaJ

		// String Buffer
		StringBuffer sBuffer = new StringBuffer("Program");

		sBuffer.reverse();
		System.out.println(sBuffer);// margorP

	}
}