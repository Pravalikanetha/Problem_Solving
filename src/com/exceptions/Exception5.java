package com.exceptions;

public class Exception5 {
	public static void main(String[] args) {
		try {
			System.out.println("Exception");
		}
		catch(Exception e) { // Partially checked exception
			System.out.println(e);
		}
		
		try {
			System.out.println("Arithmetic Exception");
		}
		catch(ArithmeticException e) { // unchecked exception
//			even though try block code never throws ArithmeticException
//			it wont give compilation exception because it's unchecked Exception
			System.out.println(e);
		}
		
//		try {
//			System.out.println("hello");
//		}
//		catch(IOException e) { // checked exception 
//			gives compilation exception because it's a checked Exception with  
//			try block code never throws IOException exception
//			System.out.println(e);
//		}
		
		try {
			Thread.sleep(1000);
			System.out.println("thread");
		}
		catch(InterruptedException e) { // checked exception
			System.out.println(e);
		}
		
		try {
			System.out.println("Error");
		}
		catch(Error e) { // unchecked exception
			System.out.println(e);
		}
	}
}
