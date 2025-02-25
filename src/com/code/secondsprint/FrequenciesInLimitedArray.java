package com.code.secondsprint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FrequenciesInLimitedArray {
	public static List<Integer> frequencyCount(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= arr.length; i++) {
			if(hm.containsKey(i)) {
				list.add(hm.get(i));
			}else {
				list.add(0);
			}
		}
		return list;
	}
	public static void main(String[] args) {
		int[] arr = {1}; 
		System.out.println(frequencyCount(arr));
	}
}
