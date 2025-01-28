package com.test;

public interface Phone {
	void add();
	default void message() {
		System.out.println("This is phone");
	}
}
