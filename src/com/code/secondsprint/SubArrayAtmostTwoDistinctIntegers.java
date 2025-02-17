package com.code.secondsprint;

import java.util.HashMap;

public class SubArrayAtmostTwoDistinctIntegers {
	public static int totalElements(Integer[] arr) {
		int max = 0;
		int l = 0;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			 hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
			 
			 while(hm.size()>2) {
				 hm.put(arr[l], hm.get(arr[l])-1);
				 if(hm.get(arr[l]) == 0) {
					 hm.remove(arr[l]);
				 }
				 l++;
			 }
			 max = Math.max(max, i-l+1);
		}
		
		return max;
	}
	public static void main(String[] args) {
		Integer[] arr= {3, 1, 2, 2, 2, 2};
		System.out.println(totalElements(arr));
	}
}
