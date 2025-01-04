package programming;

public class FloorInASortedArray {
	static int findFloor(int[] arr, int k) {
        int l = 0;
        int r = arr.length-1;
        while(l<=r) {
        	int mid=l+(r-l)/2;
        	if(arr[mid]==k) {
        		return mid;
        	}
        	else if(arr[mid]>k) {
        		r=mid-1;
        	}else {
        		l=mid+1;
        	}
        }
        
        return r;
    }
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 8, 10, 11, 12, 19};
		int[] arr2 = {1, 2, 8};
		int k = 1;
		System.out.println(findFloor(arr2, k));
	}
}
