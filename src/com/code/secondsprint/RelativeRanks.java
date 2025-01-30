package com.code.secondsprint;

import java.util.Arrays;
import java.util.HashMap;

public class RelativeRanks {
	public static String[] findRelativeRanks(int[] score) {
		String[] str= new String[score.length];
 		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < score.length; i++) {
			hm.put(score[i], i);
		}
		Arrays.sort(score);
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i]+",");
		}
		System.out.println();
		System.out.println(hm);
		int j = score.length-1;
		int num = 4;
		for (int i = 0; i < str.length; i++) {
			int ans = hm.get(score[j--]);
			if(j == score.length-2) {
				str[ans] = "Gold Medal";
			}else if(j == score.length-3){
				str[ans] = "Silver Medal";
			}else if(j == score.length-4) {
				str[ans] = "Bronze Medal";	
			}else {
				str[ans] = String.valueOf(num++);
			}
		}
		return str;
	}
	public static void main(String[] args) {
		int[] score = {10,3,8,9,4};
		String[] str = findRelativeRanks(score);
		for (int i = 0; i < score.length; i++) {
			System.out.print(str[i]+",");
		}
	}
}
