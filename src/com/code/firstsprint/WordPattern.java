package com.code.firstsprint;

import java.util.HashMap;

public class WordPattern {
	public static boolean wordPattern(String pattern, String s) {
		String[] splitting = s.split(" ");
		if(pattern.length() != splitting.length) {
			return false;
		}
		HashMap<Character, String> hm = new HashMap<>();
		for (int i = 0; i < pattern.length(); i++) {
			char c = pattern.charAt(i);
			String str = splitting[i];
			if(!hm.containsKey(c) && !hm.containsValue(str)) {
				hm.put(c,str);
			}
			if (hm.containsKey(c)) {
			    if (!hm.get(c).equals(str)) {
			        return false;
			    }
			} else {
			    if (hm.containsValue(str)) {
			        return false;
			    }
			}
			
		}
		System.out.println(hm);
		return true;
	}
	public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
	public static void main(String[] args) {
//		String pattern = "abah"; 
	//	String s = "dog cat dog cat";
//		boolean p = wordPattern(pattern, s);
//		System.out.println(p);
		System.out.println(strStr("amazon", "zon"));
 	}

}
