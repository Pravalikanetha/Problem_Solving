package programming;
import java.util.*;
public class PrefixSum {
	static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	static int[] makePrefix(int[] arr) {
		int n=arr.length;
//		int[] pref= new int[n];
//		pref[0]=arr[0];
		
		for(int i=1; i<n; i++) {
			arr[i]=arr[i-1]+ arr[i];
		}
		
		return arr;
	}
	static int[] makeSurfix(int[] arr) {
		int n=arr.length;
//		int[] pref= new int[n];
//		pref[0]=arr[0];
		
		for(int i=n-2; i>=0; i--) {
			arr[i]=arr[i]+ arr[i+1];
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter "+ n +" elements");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("InputArray");
		printArray(arr);
		
		int[] pref = makePrefix(arr);
		printArray(pref);//1 4 9 11 13
		
//		int[] suf = makeSurfix(arr);
//		printArray(suf);//13 12 9 4 2 
		
	}

}