package com.code.secondsprint;

public class SortArrayByParity {
	public static void swap(int[] nums, int l , int r) {
		int temp = nums[l];
		nums[l] = nums[r];
		nums[r] = temp;
	}
	public static int[] sortArrayByParity(int[] nums) {
 		int l = 0;
		int r = nums.length-1;
		while(l<=r) {
			if(nums[l]%2==1 && nums[r]%2==0) {
				swap(nums, l, r);
				l++;
				r--;
			} else {
				if(nums[l]%2==0) l++;
				if(nums[r]%2==1) r--;
			}
		}
		return nums;
	}
	public static void main(String[] args) {
		int[] nums = {1,3,5,7};
		int[] arr = sortArrayByParity(nums);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i < nums.length-1) {
				System.out.print(",");
			}
		}
	}
}
