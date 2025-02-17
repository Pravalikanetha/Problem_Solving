package com.exceptions;

public class ExceptionExamples {
	public static void main(String[] args) {
		try {
			int[] arr = null;
			arr[0] = 1;
			System.out.println("stmt-1");
//			System.out.println(10/0);
			System.out.println(arr[1]);
		}
		catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ni avva array outof bound ayindhi chukoballey");
		} 
		catch(NullPointerException e) {
			System.out.println(e.getMessage());//Cannot store to int array because "arr" is null
		}
		System.out.println();
		System.out.println("Execution over");
	}
//	public static void main(String[] args) {
//		try {
//			System.out.println(10/0);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//			System.out.println(e);
//			System.out .println(e.toString());
//			System.out.println(e.getLocalizedMessage());
//		}
//	}
//	public static void main(String[] args) {
//		try {
//            int result = 10 / 0;
//            System.out.println("Result: " + result);
//        } catch (ArithmeticException e) {
//            System.out.println("Caught ArithmeticException: " + e.getMessage());
//        }
//
//        try {
//            throw new SQLException("Database connection error");
//        } catch (SQLException e) {
//            System.out.println("Caught SQLException: " + e.getMessage());
//        }

//        try {
//            FileReader file = new FileReader("non_existent_file.txt");
//        } catch (FileNotFoundException e) {
//            System.out.println("Caught FileNotFoundException: " + e.getMessage());
//        }
//        System.out.println();
//        try {
//            int value = 10 / 0;
//            System.out.println(value);
//
//            FileReader fr = new FileReader("unknown.txt");
//            throw new SQLException("Database connection error");
//            
//        } catch (ArithmeticException e) {
//            System.out.println("Caught ArithmeticException: " + e.getMessage());
//        } catch (FileNotFoundException e) {
//            System.out.println("Caught FileNotFoundException: " + e.getMessage());
//        } catch (SQLException e) {
//            System.out.println("Caught SQLException: " + e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Caught " + e.getClass().getSimpleName() + ": " + e.getMessage());
//        }
//	}
}
