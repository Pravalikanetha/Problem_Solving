package programming;
//import java.util.*;
public class SecondLargest {

	public static void main(String[] args) {
		int[] arr= {12, 3, 1, 10, 34, 100};
//		Arrays.sort(arr);
//		int second = (arr.length)-2;
//		System.out.print(arr[second]);
//		for(int i=0; i<arr.length; i++) {
//			Arrays.sort(arr);
//			int second = (arr.length)-1;
//			System.out.print(second);
//		}
		int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=max){
                max=arr[i];
            }
        }
        System.out.print(max);

	}

}
