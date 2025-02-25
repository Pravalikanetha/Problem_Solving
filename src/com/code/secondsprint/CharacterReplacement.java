package com.code.secondsprint;

public class CharacterReplacement {
	public static void characterReplacement(String s, int k) {
		int[] freq = new int[26]; 
		int left = 0, maxFreq = 0, maxLength = 0;

		for (int right = 0; right < s.length(); right++) {
			char rightChar = s.charAt(right);
			freq[rightChar - 'A']++;
			System.out.println("[" + (rightChar - 'A') +"]");
			maxFreq = Math.max(maxFreq, freq[rightChar - 'A']);
			System.out.println("maxFreq :"+maxFreq);
			while ((right - left + 1) - maxFreq > k) {
				char leftChar = s.charAt(left);
				freq[leftChar - 'A']--;
				left++;
			}
			maxLength = Math.max(maxLength, right - left + 1);
		}

		for (int i = 0; i < freq.length; i++) {
			System.out.println("freq[" + i + "]"+ freq[i]);
		}
		System.out.println(maxLength);
	}
	public static void main(String[] args) {
		String s = "AACBABBCA";
		int k = 1;
		characterReplacement(s, k);
	}
}
