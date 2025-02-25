package com.code.secondsprint;

public class SquareRoot {
	static int floorSqrt(int n) {
		int low = 0; int ans = 1;
		int high = n;
		while(low <= high) {
			int mid =low+(high-low)/2;
			if((mid*mid) <= n) {
				low = mid+1;
				ans = mid;
			}else {
				high = mid-1;
			}
		}
		return ans;
	}
	static int floorSqrt2(int n) {
		int low = 0;
		int high = n;
		while(low <= high) {
			long mid =low + (high-low)/2;
			long val = (mid*mid);
			if(val <= n) {
				low = (int) (mid+1);
			}else {
				high = (int) (mid-1);
			}
		}
		return high;
	}
	public static void main(String[] args) {
		System.out.println(floorSqrt(1));
		System.out.println(floorSqrt(4));
		System.out.println(floorSqrt(9));
		System.out.println(floorSqrt(16));
		System.out.println(floorSqrt(25));
		System.out.println(floorSqrt(36));
		System.out.println(floorSqrt(49));
		System.out.println(floorSqrt(64));
		System.out.println(floorSqrt2(81));
		System.out.println(floorSqrt2(100));
	}
}
