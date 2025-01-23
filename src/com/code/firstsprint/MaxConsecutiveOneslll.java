package com.code.firstsprint;

public class MaxConsecutiveOneslll {
	public static int longestOnes(int[] nums, int k) {
		int max = Integer.MIN_VALUE;
		int l=0;
		int count = 0;
		for (int r = 0; r < nums.length; r++) {
			if(nums[r]==0) {
				count+=1;
			}
			while(count > k) {
				if(nums[l] == 0) {
					count--;
				}
				l++;
			}
			max = Math.max(max, r-l+1);
		}
		
		return max;
	}
	public static void main(String[] args) {
		int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2;
		System.out.println(longestOnes(nums, k));
	}
}






