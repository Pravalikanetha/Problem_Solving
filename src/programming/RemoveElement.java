package programming;

//import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		int val = 2;
		int count =0;
		int[] arr = {0,1,2,3,0,4,2};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!= val) {
				arr[count]=arr[i];
				count++;
			}
		}
		for(int i=0; i<arr.length; i++) {
         System.out.print(arr[count]);
		}
         
//         for(int i=0; i<arr.length; i++) {
//        	 if(arr[i]==val) {
//        		 System.out.print(i);
//        	 }
//         }
	}

}
