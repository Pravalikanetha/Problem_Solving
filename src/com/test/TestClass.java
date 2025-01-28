package com.test;

public class TestClass extends Demo implements Phone,Test{

	@Override
	public void add() {
		
	}

	@Override
	public void message() {
		Test.super.message();
	}
	public static void main(String[] args) {
		TestClass test = new TestClass();
		test.message();
	}

}
