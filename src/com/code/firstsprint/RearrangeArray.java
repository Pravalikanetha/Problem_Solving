package com.code.firstsprint;

public class RearrangeArray {
	public int[] rearrangeArray(int[] nums) {
		int[] arr = new int[nums.length];
		int pos = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>0) {
				arr[pos] = nums[i];
			}
			else if(nums[i]<0) {
				
			}
		}
		return arr;
	}
	public static void main(String[] args) {
//		int[] nums = {3,1,-2,-5,2,-4};
	}
}
