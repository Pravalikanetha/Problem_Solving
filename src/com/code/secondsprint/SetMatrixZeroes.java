package com.code.secondsprint;

public class SetMatrixZeroes {
	
	public static void ithRow(int[][] matrix, int i ) {
		int rows = matrix[0].length;
		for (int j = 0; j < rows; j++) {
			if(matrix[i][j] != 0) {
				matrix[i][j] = -1;
				System.out.print("i->"+i);
			}
		}
	}
	public static void jthRow(int[][] matrix, int j) {
		int cols = matrix.length;
		for (int i = 0; i < cols; i++) {
			if(matrix[i][j] != 0) {
				matrix[i][j] = -1;
				System.out.println("j->"+j);
			}
		}
	}
	public static void setZeroes(int[][] matrix) {
		int rows = matrix.length;
	    int cols = matrix[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if(matrix[i][j]==0) {
					System.out.println(i+" "+j);
					ithRow(matrix, i);
					jthRow(matrix, j);
				}
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if(matrix[i][j] == -1) {
					matrix[i][j] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		setZeroes(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
				if(j < matrix[i].length-1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
	}
}
