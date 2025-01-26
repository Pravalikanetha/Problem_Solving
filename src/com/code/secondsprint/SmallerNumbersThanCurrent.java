package com.code.secondsprint;

public class SmallerNumbersThanCurrent {
	public static int smallerNumbers(int[] nums, int num, int i) {
		int count = 0;
		for (int j = 0; j < nums.length; j++) {
			if(j!=i && nums[j] < num) {
				count+=1;
			}
		}
		return count;
	}
	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int[] smallerNumbers = new int[nums.length];
		int j = 0;
		for (int i = 0; i < smallerNumbers.length; i++) {
			smallerNumbers[j++] = smallerNumbers(nums, nums[i], i);
		}
		return smallerNumbers;
	}
	public static void main(String[] args) {
		int[] nums = {7,7,7,7};
		int[] ans = smallerNumbersThanCurrent(nums);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]);
			if(i < ans.length-1) System.out.print(",");
		}
	}
}
