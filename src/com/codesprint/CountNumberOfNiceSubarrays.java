package com.codesprint;

public class CountNumberOfNiceSubarrays {
	public static int atMost(int[] nums, int k) {
		int l = 0;
		int count = 0;
		int max = 0;
		for (int r = 0; r < nums.length; r++) {
			if(nums[r]%2==1) {
				count++;
			}
			while(count>k) {
				if(nums[l]%2==1) {
					count--;
				}
				l++;
			}

			max = max+r-l+1;
		}
		return max;
	}
	public static int numberOfSubarrays(int[] nums, int k) {
		return atMost(nums, k)-atMost(nums,k-1);
	}
	public static void main(String[] args) {
		int[] nums = {1,1,2,1,1};
		int k = 3;
		System.out.println(numberOfSubarrays(nums, k));
	}
}
