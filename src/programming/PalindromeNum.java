package programming;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int size = sc.nextInt();
//		int arr[] = new int[size];
//		
//		for(int i=0; i<size; i++) {
//			arr[i] = sc.nextInt();
//		}
//		for(int i=0; i<size; i++) {
//			System.out.print(arr[i] + " ");
//		}
		System.out.print(isPalindrome(size));
	}
	public static boolean isPalindrome(int x) {

        int sum = 0, target = x;
        
        while(x > 0){
            int temp = x % 10;
            x = x / 10;
            sum = sum * 10 + temp;
        }
        return sum == target;
        
    }
	
}
