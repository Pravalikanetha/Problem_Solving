package com.exceptions;

public class Exception2 extends RuntimeException{
//	static ArithmeticException ex = new ArithmeticException();
//	public static void main(String[] args)  {
//		throw ex;
//	}
	
//	static ArithmeticException ex;
//	public static void main(String[] args)  {  
//		throw ex;
//	}
	
//	o/p Exception in thread "main" java.lang.NullPointerException: Cannot throw exception 
//						because "com.exceptions.Exception2.ex" is null
//	at com.exceptions.Exception2.main(Exception2.java:6)
	
	public static void main(String[] args)  {
		throw new Exception2();
	}
}
