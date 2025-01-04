package programming;

public class RotateArray {
	public static void printArray(int[] nums) {
		int n=nums.length;
		for(int i=0; i<n; i++) {
			System.out.print(nums[i]+ " ");
		}
		System.out.println();
	}
//	
//	public static void reverse(int[] nums, int S, int E) {
//        while(S < E){
//            int temp=nums[S];
//            nums[S]=nums[E];
//            nums[E]=temp;
//
//            S++;
//            E--;
//        }
//    }
//    public static void rotate(int[] nums, int k) {
//        int n=nums.length;
//        k=k%n;
//        reverse(nums, 0, n-1);
//        reverse(nums, 0,k-1);
//        reverse(nums, k, n-1);
//        
//        reverse(nums, 0, n-2);
//        reverse(nums, 0, n-1);
//        nums[n-1]=nums[0];
//        
//    }
	static void reverse(int[] arr, int l, int r) {
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    static void rotateArr(int arr[], int d, int n) {
        n = arr.length-1;
        d=d%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0,d-1);
        reverse(arr, d, n);
    }
    public static void main(String[] args) {
		int[] nums = {12,22,3,4,5,4,2,2,4,3,5,6,7,2,2,7,7,77,0,5,4,4,4,2,2};
		int n=nums.length;
		int k=21;
		
//		for(int i=n-k; i<n; i++) {
//			System.out.print(nums[i]+ " ");
//		}
//		for(int i=0; i<n-k; i++) {
//			System.out.print(nums[i]+ " ");
//		}
//		nums[0]=nums[n-1];
//		//num[count++] nums[i];
//		for(int i=0; i<n-1; i++) {
//			System.out.print(nums[i]+ " ");
//		}
		rotateArr(nums,k, n);
		printArray(nums);
	}
}
