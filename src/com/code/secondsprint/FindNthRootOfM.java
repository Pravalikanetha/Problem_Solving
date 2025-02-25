package com.code.secondsprint;

public class FindNthRootOfM {
	public static int nthRoot(int n, int m) {
		int low = 0;
		int high = m;
		int ans = -1;
		while(low<=high) {
			int mid = low + (high-low)/2;
			int val = (int) Math.pow(mid, n);
			if(val == m) {
				ans = mid;
				break;
			}else if(val > m){
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		
		return ans;
	}
	public static void main(String[] args) {
		System.out.println(nthRoot(4, 69));
	}
}
