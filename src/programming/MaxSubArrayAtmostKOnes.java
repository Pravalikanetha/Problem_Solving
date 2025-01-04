package programming;

public class MaxSubArrayAtmostKOnes {

	public static void main(String[] args) {
		int[] arr = {0,1,3,1,1,6,7,2,1,0,1};
		int  k=2;
		int count=0;
		int max=0;
		int l =0;
		for(int r=0; r<arr.length; r++) {
			if(arr[r]==1) {
				count++;
			}
			while(count>k) {
				if(arr[l]==1) {     
					count--;
				}
				l++;
			}
			max=Math.max(max, r-l+1);
		}
		System.out.print("Maximum SubArray Atmost K 1's-> ");
		System.out.print(max); 
	}

}
