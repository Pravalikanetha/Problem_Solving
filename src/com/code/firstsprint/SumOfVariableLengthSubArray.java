package com.code.firstsprint;

public class SumOfVariableLengthSubArray {
	public static int variableLengthSum(int[] nums, int left, int right) {
		int sum = 0;
        for (int i = left; i <= right; i++) {
			sum = sum + nums[i];
		}
        return sum;
    }
	public static int subarraySum(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			int max = Math.max(0, i - nums[i]);
			sum = sum + variableLengthSum(nums, max, i);
		}
		return sum;
    }
	public static void main(String[] args) {
		int[] nums = {2,3,1};
		System.out.println(subarraySum(nums));
	}
}
