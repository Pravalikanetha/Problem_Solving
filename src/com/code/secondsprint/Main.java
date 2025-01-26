package com.code.secondsprint;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		MyThread thread1 = new MyThread();
		
		MyRunnable runable1 = new MyRunnable();
		Thread thread2 = new Thread(runable1);
		thread2.start();
		thread1.setDaemon(true);
		thread2.setDaemon(true);
		thread1.join(4000);
		thread1.start();
	}
}
