package programming;

public class SubArrayWithVariableSize {

	public static void main(String[] args) {
		int[] nums = {1,5,2,1,6,1,2,9};
		int n=nums.length;
		int max= 0;
		int temp=0;
		int k=10;
		int l=0;
		
		for(int r=0; r<n; r++) {
			temp+=nums[r];
			
			while(temp>k) {
				temp=temp-nums[l];
				l++;
			}
			max=Math.max(max, r-l+1);
		}
		
		System.out.print(max);
	}

}
