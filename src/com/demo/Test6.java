package com.demo;

import java.util.function.BiConsumer;

public class Test6 {
	public static void main(String[] args) {
		BiConsumer<Integer,Integer> operation = (num,num1) -> System.out.print("Hello "+ (num+num1));
		
		operation.accept(26,3);
	}
}
