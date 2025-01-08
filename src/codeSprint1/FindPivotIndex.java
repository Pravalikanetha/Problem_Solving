package codeSprint1;

public class FindPivotIndex {
	public static int pivot(int[] nums) {
		int[] arr = new int[nums.length];
		arr[0] = nums[0];
		for(int i=1; i<nums.length; i++) {
			arr[i] = nums[i] + arr[i-1];
		}
		
		int[] arr1 = new int[nums.length];
		arr1[nums.length-1] = nums[nums.length-1];
		for (int i = nums.length-2; i >= 0; i--) {
			arr1[i] = nums[i] + arr1[i+1];
		}
		for (int i = 0; i < arr1.length; i++) {
			if(arr[i]==arr1[i]) {
				return i;
			}
		}
		return -1;
	}
	public static int pivotIndex(int[] nums) {
	    int totalSum = 0, leftSum = 0;

	    // Calculate the total sum of the array
	    for (int num : nums) {
	        totalSum += num;
	    }

	    // Iterate through the array to find the pivot index
	    for (int i = 0; i < nums.length; i++) {
	        // If the left sum equals the right sum, return the current index
	        if (leftSum == totalSum - leftSum - nums[i]) {
	            return i;
	        }
	        // Update left sum
	        leftSum += nums[i];
	    }

	    return -1; // No pivot index found
	}

	public static void main(String[] args) {
		int[] nums = {1,7,3,6,5,6};
		int pivot = pivotIndex(nums);
//		System.out.println(pivot);
		int ans = pivot(nums);
		System.out.println(ans);
	}
}
