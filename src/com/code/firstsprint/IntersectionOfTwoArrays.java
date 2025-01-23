package com.code.firstsprint;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
	public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        
        for(int i : nums1) {
        	set.add(i);
        }
        for(int i : nums2) {
        	if(set.contains(i)) {
        		resultSet.add(i);
        	}
        }
		int[] ans = new int[resultSet.size()];
		int idx = 0 ;
		for (int i : resultSet) {
			ans[idx++] = i;
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		int[] ans = intersection(nums1, nums2);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i] + " "+i);
		}
	}
}
