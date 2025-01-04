package programming;

public class SubArrayAverageOrEqualToThreshold {
	public static void bruteForce(int[] arr) {
		int k =3; 
		int threshold=6;int ans=0;
		for(int i=0; i<=arr.length-k; i++) {
			int max =0;
			for(int j=i; j<i+k; j++) {
				max=max+arr[j];
				System.out.print(j+" ");
			}
			System.out.println("max->"+max);
			if(max>=threshold) {
				ans++;
			}
		}
		System.out.print(ans);
	}
	public static void slidingwindow(int[] arr) {
		int k = 3;
		int ans = 0;
		int threshold = 6;
		int temp = 0;
		int l=0;
		for(int r=0; r<arr.length; r++) {
			temp=temp+arr[r];
			
			if(r-l==k) {
				temp = temp - arr[l];
				l++;
			}
			
			if(r-l+1==k) {
//				ans=Math.max(ans, temp);
//				if(temp>=ans) {
//					ans=temp;
//				}
//				if(temp>=threshold) {
//					ans++;
//				}
				if(temp/k>=threshold) {
					ans++;
				}
				System.out.println("->"+temp);
			}
		}
		System.out.println(ans);
	}
	public static void EqualToThreshold(int[] arr) {
		int k = 3;
		int ans = 0;
		int threshold = 5;
		int temp = 0;
		int l=0;
		for(int r=0; r<arr.length; r++) {
			temp=temp+arr[r];
			
			if(r-l==k) {
				temp = temp - arr[l];
				l++;
			}
			if(r-l+1==k) {
				if(temp/k>=threshold) {
					ans++;
				}
			}
		}
		System.out.print(ans);
	}
	public static void main(String[] args) {
		int[] arr = {3,2,3,1,1};
		slidingwindow(arr);
	}

}
























