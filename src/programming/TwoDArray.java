package programming;
import java.util.*;
public class TwoDArray {
	static void printMatrix(int[][] matrix) {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	static void transposeInPlace(int[][] matrix, int r, int c) {
		for(int i=0; i<c; i++) {
			for(int j=0; j<i; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}
//	static void reverseArray(int[] arr) {
//		int i=0, j=arr.length-1;
//		while(i<j) {
//			int temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//			i++;
//			j--;
//		}
//	}
//	static void rotate(int[][] matrix, int n) {
//		transposeInPlace(matrix, n, n);
//		for(int i=0; i<n; i++) {
//			reverseArray(matrix[i]);
//		}
//	}
	
//	static void Pascal(int[][] matrix, int n) {
//		int[][] ans = new int[n][];
//		for(int i=0; i<n; i++) {
//			ans[i] = new int[i+1];
//			ans[i][0] + ans[i][i]=0;
//			for(int j=1; j<i; j++) {
//				ans[i][j]=ans[i-1] + ans[i-1][j-1];
//			}
//		}
//	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("Enter numbers of rows and columns");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] matrix = new int[r][c];
		int total = r*c;
		
		System.out.println("Enter "+ total + " values");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Transpose of matrix");
		transposeInPlace(matrix, r, c);
//		System.out.println("clockwise rotation of matrix");
//		rotate(matrix, r);
		
		
		printMatrix(matrix);
	}
}
