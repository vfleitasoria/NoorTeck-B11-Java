package com.noorteck.java.day21;

public class DemoSB5 {
	
	public static void main(String[] args) {

		// String Builder

		StringBuilder sBuilder = new StringBuilder("JavaWorld");
        sBuilder.delete(2, 5);
		System.out.println(sBuilder);

		// String Buffer
		
		StringBuffer sBuffer = new StringBuffer("JavaWorld");
        sBuffer.delete(2, 5);
		System.out.println(sBuffer);

	}

}


