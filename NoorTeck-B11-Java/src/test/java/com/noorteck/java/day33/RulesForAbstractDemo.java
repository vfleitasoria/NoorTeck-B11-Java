package com.noorteck.java.day33;

public abstract class RulesForAbstractDemo {

//abstract final method --> Method cannot be abstract & final at the same time

	public abstract final void add();// Expected ERROR

//abstract private method --> Method cannot be abstract & private at the same time 

	private abstract void divide();// Expected ERROR

//abstract static method --> Method cannot be abstract & static at the same time 

public abstract static multiply();// Expected ERROR

}
/**
abstract class has a rule for the concrete method
	
	> concrete method MUST override the abstract method
	
	
abstract method --> must be overridden by the concrete class

final method --> prevents method overriding 

private method --> cannot be overridden & not visible outside the class

static method -->  cannot be overridden 

*/