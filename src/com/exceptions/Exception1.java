package com.exceptions;

public class Exception1 {
	public static void main(String[] args) {
		try {
			System.out.println("1");
			System.exit(0);
			System.out.println("2");
//			int[] a = null;
//			System.out.println(a[0]);
			System.out.println("3");
		}
		catch(ArithmeticException e) {
			System.out.println(10/0);
			try {
			}
			catch(ArithmeticException ex) {
				System.out.println(ex);
			}
		}finally {
			System.out.println("5");
		}
		System.out.println(10+"6");
 	}
}
