package com.test;

import java.util.ArrayList;

public interface Test {
	void add();
	default void message() {
		System.out.println("This is test");
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		System.out.println(arr.get(1));
	}
}
