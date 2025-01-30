package com.demo;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Test3 {
	public static void main(String[] args) {
		Supplier<LocalDateTime> operation = () -> LocalDateTime.now();
		
		LocalDateTime time = operation.get();
		System.out.println(time);
	}
}
