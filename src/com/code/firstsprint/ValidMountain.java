package com.code.firstsprint;

public class ValidMountain {
	public static boolean validMountainArray(int[] arr) {
		if(arr.length<3 || arr[0] >= arr[1] || arr[arr.length-2] <= arr[arr.length-1]) {
			return false;
		}
		int mountainPoint = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] == arr[i+1]){
				return false;
			}else if(arr[i] > arr[i+1] && i!=0 && i != arr.length-1) {
				mountainPoint = i;
				break;
			}
		}
		int l = mountainPoint;
		while(l<arr.length-1) {
			if(arr[l] == arr[l+1] || arr[l] < arr[l+1]) {
				return false;
			}
			l++;
		}
		return true;
	}
	public static void main(String[] args) {
		int[] arr = {0,2,3,5,3,2,1};
		System.out.println(validMountainArray(arr));
	}
}
