package com.exceptions;

import java.sql.SQLException;

public class ExceptionClasses {
	public static void main(String[] args) {
		try {
			System.out.println(10/2 + " hello");
//			throw new FileNotFoundException("yayayayayayay");
			throw new SQLException("Database connection error");
		}
		catch(SQLException e) {
			System.out.println(e +": "+ e.getErrorCode());
		}
		catch(Exception e) {
			System.out.println("Caught " + e.getClass().getSimpleName() + ": " + e.getMessage());
		}
		finally {
			System.out.println("hi pilla kayalu, ni piththu");
		}
	}
}
