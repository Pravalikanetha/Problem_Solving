package com.code.secondsprint;

public class SelectionSort {
	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minimum = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[minimum]) {
					minimum = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[minimum];
			arr[minimum] = temp;
		}
	}
	public static void main(String[] args) {
		int[] arr = {4,0,5,8, 1, 3, 9, 7};
		selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i < arr.length-1) {
				System.out.print(",");
			}
		}
	}
}
