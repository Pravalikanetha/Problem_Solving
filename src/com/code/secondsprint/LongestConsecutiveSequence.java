package com.code.secondsprint;

import java.util.HashMap;

public class LongestConsecutiveSequence {
	public static int longestConsecutive(int[] nums) {
		if(nums.length == 0) return 0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (Integer integer : nums) {
			hm.put(integer, hm.getOrDefault(integer, 0)+1);
		}
		int count = 1;
		int max = 0;
		
		for(int i : hm.keySet()) {
			if(hm.containsKey(i+1)){
				count+=1;
				System.out.println(i+1+" "+i);
			}
			else {
				count = 1;
			}
			max = Math.max(max, count);
		}
		System.out.println(hm);
		return max;
	}
	public static void main(String[] args) {
		int[] nums = {9,1,-3,2,4,8,3,-1,6,-2,-4,7};
		System.out.println(longestConsecutive(nums));
	}
}
