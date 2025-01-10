package com.codeSprint;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInArray {
	public static List<String> stringMatching(String[] words) {
		List<String> sub = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			isSubString(words, sub, i);
		}
		return sub;
	}
	public static void isSubString(String[] words, List<String> sub, int i) {
		for (int j = 0; j < words.length; j++) {
			if(words[i].equals(words[j])) {
				continue;
			}
			if(!sub.contains(words[j]) && words[i].contains(words[j])) {
				sub.add(words[j]);
			}
		}
	}
	public static void main(String[] args) {
		String[] words = {"blue","bl", "bl"};
		System.out.println(stringMatching(words));
	}
}
