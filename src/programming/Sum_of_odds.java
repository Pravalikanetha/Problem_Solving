package programming;

import java.util.*;

public class Sum_of_odds {
	public static void SumOfOdds(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			if(i%2 != 0) {
				sum= sum +i;
			}
		}
		System.out.print(sum);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		SumOfOdds(a);
	}
}
