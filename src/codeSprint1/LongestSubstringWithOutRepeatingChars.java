package codeSprint1;

import java.util.HashSet;

public class LongestSubstringWithOutRepeatingChars {
	public static int lengthOfLongestSubstring(String s) {
		HashSet<Character> hs = new HashSet<>();
		int l = 0;
		int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(!hs.contains(c)) {
				hs.add(c);
			}else {
				while(hs.contains(c)) {
					hs.remove(s.charAt(l));
					l++;
				}
				hs.add(c);
			}
			max = Math.max(max, i-l+1);
		}
        return max;
    }
	public static void main(String[] args) {
		String s = "ahahahahhvvcvcvcvb";
		System.out.println(lengthOfLongestSubstring(s));
	}

}
