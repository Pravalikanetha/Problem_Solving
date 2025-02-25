package com.exceptions;

public class Exception4 extends RuntimeException {

	public static void main(String[] args) throws InterruptedException  {
		doStuff();
		throw new Exception4();
//		if it is a checkedException we have to handle like Exception, 
//		IOException etc with throws and throw to throw exception
	}

	public static void doStuff() throws InterruptedException {
		doMoreStuff();
	}

	public static void doMoreStuff() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("yess");
	}
}
