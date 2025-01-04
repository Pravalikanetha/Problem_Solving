package programming;
//import java.util.*;
public class Patterns {
	public static void main(String[] args) {
		
//		int n=4,m=5;
		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=m; j++) {
//				if(i==1|| j==1|| i==n|| j==m) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
//		int n=4;
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		int n=4;
//		
//		for(int i=n; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		int n = 5;
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		int numbers = 1;
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(numbers+ " ");
//				numbers++;
//			}
//			System.out.println();
//		}
		
//		int n=5;
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i+1; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		int n=5;
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=i; j++) {
//				int sum=i+j;
//				if(sum%2==0) {
//					System.out.print("1");
//				}else {
//					System.out.print("0");
//				}
//			}
//			System.out.println();
//		} 
		
//		int n = 5;
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=n; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		int n = 5;
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int j=1; j<=5; j++) {
//				if(i==1|| j==1|| i==n|| j==n) {
//					System.out.print("&");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
//		int n = 5;
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print(" ");
//			}
//		
//			for(int j=1; j<=i; j++) {
//				System.out.print(i+ " ");
//			}
//			System.out.println();
//		}
//		int n=5;
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=i; j>=1; j--) {
//				System.out.print(j);
//			}
//			for(int j=2; j<=i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		int n=4;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=2; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=2; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		
//		for(int i=1; i<=10; i++) {
//			System.out.println(i*n);
//		}
		
//		for(int i=1; i<=4; i++) {
//			for(int j=1; j<=5; j++) {
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//		}
	}
}
