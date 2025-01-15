package com.codesprint;

public class NextGreatestLetter {
	public static char nextGreatestLetter(char[] letters, char target) {
		int l = 0 ; 
		int r = letters.length-1 ; 
		while(l<=r) {
			int mid = l+(r-l)/2;
			if (letters[mid] <= target) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		System.out.println("l->"+l);
		System.out.println("r->"+r);
		if(l==letters.length) {
			return letters[0];
		}else {
			return letters[l];
		}
	}
	public static void main(String[] args) {
		char[] letters = {'c', 'f', 'j'};
		char target = 'a';
		System.out.println(nextGreatestLetter(letters,target));
	}
}
