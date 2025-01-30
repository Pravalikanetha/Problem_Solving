package com.demo;

import java.util.function.BiPredicate;

public class Test5 {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> operation = (num,num1) -> num>num1;
		
		boolean result = operation.test(30, 5);
		System.out.println(result);
	}
}
