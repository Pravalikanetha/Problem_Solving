package programming;

public class LeftRightDifference {
	static void totalSum(int[] nums) {
        long[] left = new long[nums.length];
		long[] right = new long[nums.length];
		long[] output = new long[nums.length];
		int n = nums.length;
		
		left[0]=1;
		right[n-1]=1;
		
		
		for(int i=1; i<n; i++) {
			left[i] = left[i-1]*nums[i-1];
		}
		
		for(int i=n-2; i>=0; i--) {
			right[i] = right[i+1]*nums[i+1];
		}
		
		for(int i=0; i<n; i++) {
			output[i] = left[i]*right[i];
		}
		for(int i=0; i<n; i++) {
			System.out.print(output[i] + " ");
		}
    }
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		totalSum(nums);
	}

}
