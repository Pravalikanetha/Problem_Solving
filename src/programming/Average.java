package programming;

import java.util.*;

public class Average {
	public static void printAverage(int a, int b, int c) {
		int Average = (a+b+c)/3;
		
		System.out.print(Average);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		printAverage(a,b,c);
	}
}
