package programming;

import java.util.*;

public class greaterDigit {
	public static void printGreatervalue(int a, int b) {
		if(a==b) {
			System.out.print("Both are equal");
		}else if(a>b) {
			System.out.print(a);
		}else {
			System.out.print(b);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		printGreatervalue(a, b);
	}
}
