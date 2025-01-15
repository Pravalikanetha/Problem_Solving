package com.codesprint;

import java.util.HashMap;
import java.util.Map;

public class DegreeOfTheArray {
	public static int findShortestSubArray(int[] nums) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		HashMap<Integer, Integer> first = new HashMap<>();
		HashMap<Integer, Integer> last = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
			if(!first.containsKey(nums[i])) {
				first.put(nums[i], i);
			}
			last.put(nums[i], i);
		}
		int maxValue = 0;
		for(Map.Entry<Integer, Integer> i : hm.entrySet()) {
			if(i.getValue()>maxValue) {
				maxValue = i.getValue();
			}
		}
		int maxLength = 0;
		int smallLength = Integer.MAX_VALUE;
		for (Map.Entry<Integer, Integer> i : hm.entrySet()) {
			if(i.getValue() == maxValue) {
				int num = i.getKey();
				maxLength = last.get(num) -  first.get(num);
				smallLength = Math.min(smallLength,maxLength);
			}
		}
		return smallLength+1;
	}
	public static void main(String[] args) {
		int[] nums = {1,3,2,2,3,1};
		System.out.println(findShortestSubArray(nums));
	}
}
