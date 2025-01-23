package com.code.firstsprint;

import java.util.Arrays;

public class SurvivalOfTheFittestShow {
	public static int survival(int[] arr) {
		Arrays.sort(arr);

        int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
        	max = max - arr[i];
        }

        return Math.abs(max); 
	}
	public static void main(String[] args) {
		int[] arr = {10,8};
		System.out.println(survival(arr));
	}
}
