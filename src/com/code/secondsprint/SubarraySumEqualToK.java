package com.code.secondsprint;

public class SubarraySumEqualToK {
	public static int subarraySum(int[] nums, int k) {
		int l = 0;
		int sum = 0;
		int max= 0;
		for (int i = 0; i < nums.length; i++) {
			sum+=nums[i];
			while(sum>k) {
				System.out.println(sum);
				sum-=nums[l];
				l++;
			}
			
			if(sum==k) {
				max++;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] nums = {1,2,3,-8,3,-2,1};
		int k = 10; 
		System.out.println(subarraySum(nums, k));
	}
}
