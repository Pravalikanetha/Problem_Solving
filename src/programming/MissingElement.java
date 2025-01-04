package programming;

public class MissingElement {

	public static void main(String[] args) {
		int[] arr= {1};
		int n = 2, a=0;
		int sum=(n*(n+1))/2;
		for(int i=0; i<arr.length; i++) {
			sum=sum-arr[i];
		}
		System.out.print(sum-a);
	}

}
//int sum = sum=(n*(n+1))/2;
//for(int i=0; i<arr.length; i++) {
//	sum=sum-arr[i];
//}
//return sum;