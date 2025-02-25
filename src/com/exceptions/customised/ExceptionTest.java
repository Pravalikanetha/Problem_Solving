package com.exceptions.customised;

import java.util.Scanner;

public class ExceptionTest {
	public static void checkAge(int age) {
		if(age>59) {
			throw new TooOldException("U can't marry at this old age");
		}else if(age<18) {
			throw new TooYoungException("U can't marry at this young age");
		}else {
			System.out.println("okay your eligible for marriage");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter 1: to check your age");
		while(true) {
			System.out.println("Enter 0: to exit");
			int input = scanner.nextInt();
			if(input == 1) {
				takeInput();
			} if(input == 0) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Exiting Program");
				System.out.println("bye byee.......");
				break;
			}else if(input!=0 && input!=1){
                System.out.println("Invalid choice. Please enter 1 or 0.");
            }
			System.out.println();
		}
	}

	public static void takeInput() {
		Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter your age: ");
        
        int age = scanner.nextInt();
		try {
			checkAge(age);
		}
		catch(RuntimeException e) {
			System.out.println(e.getClass().getName() +": "+ e.getMessage());
		}
	}
}
