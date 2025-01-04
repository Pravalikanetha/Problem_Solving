package programming;
//for positive array
public class LongestSubArrayWithSumKPositive {

	public static void main(String[] args) {
		int A[] = {1, -1, 5, -2, 3};
		int N = A.length;
		int K = 3;
		int l = 0;
		int temp=0;
		int max=0;
		for(int r=0; r<N; r++) {
			temp+=A[r];
			
			while(temp>=K) {
				temp-=A[l];
				l++;
			}
			max=Math.max(max, r-l+1);
		}
		
		System.out.println(max);
	}

}
