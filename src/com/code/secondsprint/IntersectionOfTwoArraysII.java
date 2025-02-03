package com.code.secondsprint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArraysII {
	public static int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i : nums2) {
			hm.put(i, hm.getOrDefault(i, 0)+1);
		}
		List<Integer> list = new ArrayList<>();
		int i=0;
		while(i<nums1.length) {
			boolean num = hm.containsKey(nums1[i]);
			if(num) {
				list.add(nums1[i]);
				hm.put(nums1[i], hm.get(nums1[i])-1);
				if(hm.get(nums1[i]) == 0) {
					hm.remove(nums1[i]);
				}
				i++;
			}
			else {
				i++;
			}
		}
		int[] ans = new int[list.size()];
		for (int j = 0; j < list.size(); j++) {
			ans[j] = list.get(j);
		}
		return ans;
 	}
	public static void main(String[] args) {
		int[] nums1 = {};
		int[] nums2 = {};
		int[] ans = intersect(nums1, nums2);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
		
//		intersect(nums1, nums2);
	}
}
