package com.demo;

import java.util.function.BiFunction;

public class Test4 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> operation = (num, num1) -> num+num1;
		
		int result = operation.apply(3, 3);
		System.out.println(result);
	}
}
