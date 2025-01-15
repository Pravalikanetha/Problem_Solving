package com.codeSprint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class MinimumIndexSumOfTwoLists {
	public static String[] findRestaurant(String[] list1, String[] list2) {
		HashMap<String, Integer> hm = new HashMap<>();
		List<String> list = new ArrayList<>();
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list2.length; j++) {
				if(Objects.equals(list1[i], list2[j])) {
					hm.put(list2[j], i+j);
				}
			}
		}
		System.out.println(hm);
		int min = Integer.MAX_VALUE;
		for(String s : hm.keySet()) {
			int i = hm.get(s);
			if(i<min) {
				min = i;
			}
		}
		System.out.println("min->"+min);
		for(String s : hm.keySet()) {
			int i = hm.get(s);
			if(i==min) {
				list.add(s);
			}
		}
		return list.toArray(new String[list.size()]);
	}
	public static void main(String[] args) {
		String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
		String[] theString = findRestaurant(list1, list2);
		for (int i = 0; i < theString.length; i++) {
			System.out.print("list -> "+theString[i]);
		}
	}
}
