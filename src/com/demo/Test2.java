package com.demo;

import java.util.function.Consumer;

public class Test2 {
	public static void main(String[] args) {
		Consumer<Integer> operation = num -> System.out.print("Hello " + num);
		
		operation.accept(26);
	}
}
