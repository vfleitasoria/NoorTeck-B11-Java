package com.noorteck.java.day15;

public class StaticRecap2 {
	// static method
		public static void getInfo() {

			// TODO call [isJavaFun] variable and assign value = true
			StaticRecap1.isJavaFun=true;
			

			// TODO call [totalAmount] variable and assign value = 1111
			StaticRecap1.totalAmount = 1111;
			
			

			// TODO print value of variable [isJavaFun]
			System.out.println(StaticRecap1.isJavaFun);
			

			// TODO print value of variable [totalAmount]
			System.out.println(StaticRecap1.totalAmount);

			// TODO call method [addNum()]
			StaticRecap1.addNum(1,2);

		}

		// non-static method
		public void statusUpdate() {

			// TODO call [month] variable and assign value = "January"
			StaticRecap1 obj = new StaticRecap1();
			obj.month = "January";

			// TODO call [iLikeJava] variable and assign value = "Java is life"
			StaticRecap1 obj1 = new StaticRecap1();
			obj1.iLikeJava ="Java is Life)";

			// TODO print value of variable [month]
			System.out.println(obj.month);

			// TODO print value of variable [iLikeJava]
			System.out.println(obj1.iLikeJava);

			// TODO call method [getCountry()]
			StaticRecap1 obj2 =new StaticRecap1();
			obj2.getCountry();
			
			
			
				

		}

		public static void main(String[] args) {

			// TODO call method [getInfo()]
			getInfo();
			
			
		}


}
