package programming;

import java.util.*;

public class eligibleAge {
	public static void isEligible(int age) {
		if(age < 18) {
			System.out.print("ur not allowed vote");
		}else {
			System.out.print("u can vote");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		isEligible(a);
	}
}
