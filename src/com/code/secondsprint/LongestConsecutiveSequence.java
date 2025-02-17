package com.code.secondsprint;

import java.util.HashSet;

public class LongestConsecutiveSequence {
	public static int longestConsecutive(int[] nums) {
		if(nums.length == 0) return 0;
		HashSet<Integer> hs = new HashSet<>();
		for (Integer integer : nums) {
			hs.add(integer);
		}
		int count = 0;
		for (int integer : hs) {
			if(!hs.contains(integer-1)) {
				int currCount = 1;
				int currNum = integer;
				while(hs.contains(currNum+1)) {
					currCount++;
					currNum++;
				}
				count = Math.max(currCount, count);
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] nums = {9,1,-3,2,4,8,3,-1,6,-2,-4,7};
		System.out.println(longestConsecutive(nums));
	}
}
