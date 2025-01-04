package programming;
//import java.util.Arrays;
public class MostConsecutivelll {

	public static void main(String[] args) {
		int[] nums = {1,1,0,1,0,1,0,0};
		
		int  k=2;
		int count=0;
		int max=0;
		int l =0;
		for(int r=0; r<nums.length; r++) {
			if(nums[r]==0) {
				count++;
			}
			while(count>k) {
				//System.out.println(r);
				if(nums[l]==0) {     
					count--;
				}
				l++;
			}
			max=Math.max(max, r-l+1);
		}
		System.out.println(max);
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
	}

}
