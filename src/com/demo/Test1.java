package com.demo;

import java.util.function.Predicate;

public class Test1 {
	public static void main(String[] args) {
		Predicate<Integer> operation = num -> num>=0;
		
		boolean result = operation.test(26);
		System.out.println(result);
	}
}
