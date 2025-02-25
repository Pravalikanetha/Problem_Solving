package com.code.secondsprint;

public class InsertionSort {
	public static void insertionSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int j = i;
			while(j>0 && arr[j-1]>arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {4, 1, 9};
		insertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i < arr.length-1) {
				System.out.print(", ");
			}
		}
	}
}
