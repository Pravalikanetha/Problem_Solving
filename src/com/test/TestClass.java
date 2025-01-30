package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestClass {
	public static void main(String[] args) {
		String s = "Hi";
		String s1 = "Hi";
		String s2 = new String(s1);
		System.out.println(s == s2);
		System.out.println(s.equals(s2));
		
		
		String[] arr = {"A", "B", "C"};
		ArrayList<String> list = new ArrayList<>(Arrays.asList("1", "2", "3"));
		
		ArrayList<String> list1 = new ArrayList<>();
		Collections.addAll(list1, arr);
		System.out.println(list1 +" "+ list);
 	}
}
