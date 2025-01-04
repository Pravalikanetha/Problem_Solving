package programming;

public class MoverZeroes {

	static void swap(int[] arr, int i , int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]= temp;
	}
	
	public static void main(String[] args) {
		//MOVING ALL ZEROES TO LAST
		int[] arr= {1, 0, 0, 1, 0, 1};
//		int n=arr.length;
//		int l=0, r=n-1;
//		
//		while(l<r) {
//			if(arr[l]==0) {
//				swap(arr, l, r);
//				l++;
//				r--;
//			}
//			if(arr[l]!=0) {
//				l++;
//			}
//			if(arr[r]==0) {
//				r--;
//			}
//		}
		//MOVING ALL ZEROES TO FIRST
//		int[] arr= {0,1,0,3,12};			
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0 && arr[j]!=0) {
				swap(arr, i, j);
			}
			if(arr[j]==0) {
				j++;
			}
		}
		//MOVING ALL ZEROES TO LAST
//		int[] arr= {0,1,0,3,12};
//		int j=0;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]!=0 && arr[j]==0) {
//				swap(arr, i, j);
//			}
//			if(arr[j]!=0) {
//				j++;
//			}
//		}
		//MOVING ALL ZEROES TO LAST
//		int count=0;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]!=0) {
//				arr[count++]=arr[i];
//			}
//		}
//		while(count<arr.length) {
//			arr[count++]=0;
//		}
		for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
		
	}

}
