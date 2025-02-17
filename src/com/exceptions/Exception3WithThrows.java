package com.exceptions;

public class Exception3WithThrows {
	public static void main(String[] args) throws InterruptedException {
		callingThread();
		System.out.println("padukunna sare na ");
	}

	static void callingThread() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
