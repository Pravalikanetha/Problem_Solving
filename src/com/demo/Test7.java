package com.demo;

import java.io.IOException;
import java.util.function.BiFunction;

public class Test7 {
	
	public static void main(String[] args) {
		try {
			BiFunction<Integer, Integer, Integer> op = (num1, num2) ->{
				try {
					if(num2 == 0) {
						throw new IOException("Can't divide with " + num1 + " by "+num2);
					}
					return num1+num2;
				}catch(IOException exception) {
					throw new RuntimeException(exception.getMessage());
				}
			};
			System.out.println(op.apply(8, 0));
		}catch(Exception exception) {
			System.out.println(exception);
		}
	}

}
















