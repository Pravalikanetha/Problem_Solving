package com.codeSprint;

public class SingleNonDuplicate {
	public static int single(int[] nums) {
		int n = nums.length;
		if(n==1) return nums[0];

		for(int i=0; i<n; i++){
			if(i==0){
				if(nums[i]!=nums[i+1]) return nums[i];
			}else if(i==n-1){
				if(nums[i]!=nums[i-1]) return nums[i];
			}else{
				if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1]) return nums[i];
			}
		}
		return 0;
	}
	public static int singleNonDuplicate(int[] nums) {
		int n = nums.length;
		int l = 1 ;
		int r = n-2;
		if(n==1) return nums[0];
		if(nums[l]!=nums[l-1]) return nums[l-1];
		if(nums[r]!=nums[n-1]) return nums[n-1];
		while(l<=r) {
			int mid = l+(r-l)/2;
			if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) 
				return nums[mid];
			if(mid%2==1 && nums[mid]==nums[mid-1] || mid%2==0 && nums[mid]==nums[mid+1]) {
				l=mid+1;
			}else {
				r=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] nums = {1};
		System.out.println(singleNonDuplicate(nums));
		
	}
}
