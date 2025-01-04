package programming;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] nums= {-1,0,3,5,9,12};
		int target=9,n=nums.length;
		int l=0,r=n-1;
		
		while(l<=r) 
		{
			int mid=l+(r-l)/2;
			if(nums[mid]==target) {
				System.out.print(mid);
			}else if(nums[mid]>target) {
				r=mid-1;
			}else{
				l=mid+1;
			}
		}
		System.out.print(false);
	}

}
