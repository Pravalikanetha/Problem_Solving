package com.code.secondsprint;

public class DeletionColumnToMakeSorted {
	public static int minDeletionSize(String[] strs) {
		int count = 0;
		for (int i = 0; i < strs[0].length(); i++) {
			for (int j = 0; j < strs.length-1; j++) {
				if(strs[j].charAt(i) > strs[j+1].charAt(i)) {
					count+=1;
					break;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String[] strs = {"rrjk","furt","guzm"};
		System.out.println(minDeletionSize(strs));
		System.out.println(strs[1].charAt(3) > strs[1+1].charAt(3));
	}
}
