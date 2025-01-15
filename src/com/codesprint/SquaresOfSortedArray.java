package com.codesprint;

public class SquaresOfSortedArray {
	public static void rev(int[] nums) {
		int i=0;
		int j= nums.length-1;
		while(i<j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
		}
	}
	public static int[] sortedSquares(int[] nums) {
		int[] sorted = new int[nums.length];
		int l=0,i=0;
		int r=nums.length-1;
		while (l<=r) {
			int left =  Math.abs(nums[l]);
			int right = Math.abs(nums[r]);
			if(left>right) {
				sorted[i++] = left*left;
				l++;
			}else {
				sorted[i++] = right*right;
				r--;
			}
		}
		rev(sorted);
		return sorted;
	}
	public static int[] sorted(int[] nums) {
		int[] sorted = new int[nums.length];
		int l=0;
		int i=0;
		int r=nums.length-1;
		while (l<=r) {
			if(Math.abs(nums[l])>Math.abs(nums[r])) {
				sorted[i++] = nums[l]*nums[l];
				l++;
			}else {
				sorted[i++] = nums[r]*nums[r];
				r--;
			}
		}
		return sorted;
	}
	public static void main(String[] args) {
		int[] nums = {-4,-1,0,3,10};
		int[] ans = sortedSquares(nums);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]);
			if(i<ans.length-1) {
				System.out.print(",");
			}
		}
	}
}
