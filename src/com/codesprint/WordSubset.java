package com.codesprint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordSubset {
	public static boolean isSubset(String word, String[] words2) {
		String[] sub = word.split("");
		
		HashMap<String, Integer> hm = new HashMap<>();
		for (int i = 0; i < sub.length; i++) {
			String s = sub[i];
			hm.put(s, hm.getOrDefault(s, 0)+1);
		}
		
		System.out.println(hm);
		for (String s : words2) {
			if(!hm.containsKey(s)) {
				return false;
			}
		}
		return true;
	}
	public static List<String> wordSubsets(String[] words1, String[] words2) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < words1.length; i++) {
			boolean flag = isSubset(words1[i], words2);
			if(flag) {
				list.add(words1[i]);
			}
		}
		return list;
	}
	public static void main(String[] args) {
		String[] words1 = {"amazon","apple","facebook","google","leetcode"};
		String[] words2 = {"e","oo"};
//		System.out.println(wordSubsets(words1,words2));
		System.out.println(isSubset("facebook", words2));
	}
}
