package programming;

public class MaxConsecutive {

	public static void main(String[] args) {
		int[] nums = {1,0,1,1,0,1,1,1,0,1,1,1,1};
		int count =0;
		int max_count=0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==1) {
				count++;
				max_count=Math.max(max_count, count);
			}else {
				count=0;
			}
		}
		System.out.print(max_count);

	}

}
