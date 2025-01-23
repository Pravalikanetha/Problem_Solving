package com.code.secondsprint;

public class RearrangeArrayElementsBySign {
	public static int[] rearrangeArray(int[] nums) {
		int[] positive = new int[nums.length/2];
		int[] negative = new int[nums.length/2];
		int p = 0;
		int n = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > 0) {
				positive[p++] = nums[i];
			}else {
				negative[n++] = nums[i];
			}
		}
		int[] rearranged = new int[nums.length];
		p=0; n=0;
		for (int i = 0; i < nums.length; i++) {
			if(i%2 == 0) {
				rearranged[i] = positive[p++];
			}else {
				rearranged[i] =negative[n++];
			}
		}
		return rearranged;
	}
	public static int[] rearranged(int[] nums) {
		int[] rearranged = new int[nums.length];
		int p = 0;
		int n = 1;
		for (int i = 0; i < rearranged.length; i++) {
			if(nums[i] > 0) {
				rearranged[p] = nums[i];
				if(i < rearranged.length-1) {
					p += 2;
				}
			}else {
				rearranged[n] = nums[i];
				if(i < rearranged.length) {
					n += 2;
				}
			}
		}
		return rearranged;
	}
	public static void main(String[] args) {
		int[] nums = {-1,1};
		int[] ans = rearranged(nums);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]);
			if(i < ans.length-1) {
				System.out.print(",");
			}
		}
	}
}
