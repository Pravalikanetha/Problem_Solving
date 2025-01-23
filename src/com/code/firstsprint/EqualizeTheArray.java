package com.code.firstsprint;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class EqualizeTheArray {
	public static int equalizeArray(List<Integer> arr) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i : arr) {
			hm.put(i, hm.getOrDefault(i, 0)+1);
		}
		System.out.println(hm);
		int max = Integer.MIN_VALUE;
		for(int i : hm.keySet()) {
			int num = hm.get(i);
			if(num>max) {
				max = num;
			}
		}
		System.out.println(arr.size()+" "+max);
		return arr.size()-max;
	}
	public static int equalize(List<Integer> arr) {
		Collections.sort(arr);
		int min = Integer.MAX_VALUE;
		int count = 0;
		int element = arr.get(0);
		if(arr.size()==1) { return 0;}
		for (int i = 0; i < arr.size(); i++) {
			count++;
			if(arr.get(i)!=element) {
				count=1;
				element = arr.get(i);
			}
			min = Math.min(arr.size()-count, min);
//			System.out.println(element+" "+count+" "+(arr.size()-count));
		}

		return min;
	}
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1,2,2,3); // 1,2,3,3,3
		System.out.println(equalize(arr));
	}
}
