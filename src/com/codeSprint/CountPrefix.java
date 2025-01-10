package com.codeSprint;

import java.util.HashMap;

public class CountPrefix {
	public static int prefixCount(String[] words, String pref) {
		int count = 0 ; 
		for (int i = 0; i < words.length; i++) {
			if(words[i].startsWith(pref)) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String[] words = {"leetcode","win","loops","success"};
		String pref = "at";
//		System.out.println(prefixCount(words, pref));
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(2, 1);
		hm.put(1, 2);
		hm.put(3, 1);
		hm.forEach((hello,hi)-> System.out.println(hello +":"+hi));
	}
}
