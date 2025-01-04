package programming;

import java.util.Arrays;

public class TwoSum {
	static boolean twoSum(int[] arr, int x) {
		Arrays.sort(arr);
		int l = 0, r = arr.length - 1;
		while (l < r) {
			int sum = arr[l] + arr[r];
			if (sum == x)
				return true;
			if (sum < x)
				l++;
			else
				r--;
			System.out.println(l + " " + r + " " + sum);
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6 };
		int x = 10;
		boolean ans = twoSum(arr, x);
		System.out.println(ans);
	}

}
