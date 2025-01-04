package programming;

import java.util.*;

public class Circumference {

		public static Double getcircumference(int radius) {
				return 2 * 3.14 * radius;
		}
		
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			
			System.out.print(getcircumference(a));
		}

}
