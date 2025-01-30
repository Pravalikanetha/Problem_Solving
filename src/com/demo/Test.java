package com.demo;

import java.io.IOException;

import com.demo.service.Operation;

public class Test {
	
	public static void main(String[] args) {
		try {
			Operation op = (num1, num2) ->{
				if(num2 == 0) {
					throw new IOException("Can't divide with " + num1 + " by "+num2);
				}
				return num1+num2;
			};
			System.out.println(op.print(10, 0));
		}catch(Exception exception) {
			System.out.println(exception);
		}
	}

}
















