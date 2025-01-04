package programming;

import java.util.HashMap;

public class IsAnagram {
	public static boolean isAnagram(String s, String t) {
		HashMap<Character, Integer> hm1 = new HashMap<>();
		HashMap<Character, Integer> hm2 = new HashMap<>();

		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			hm1.put(c, hm1.getOrDefault(c, 0)+1);
		}
		for(int i=0; i<t.length(); i++) {
			char c = t.charAt(i);
			hm2.put(c, hm2.getOrDefault(c, 0)+1);
		}
		if(hm1.equals(hm2)) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";

		System.out.println(isAnagram(s, t));
		
	}
}
