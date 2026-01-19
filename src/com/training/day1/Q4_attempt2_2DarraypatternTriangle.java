package com.training.day1;

public class Q4_attempt2_2DarraypatternTriangle {
	
	public static int[][] CreatePascalTriangle(int n){
		int row, col;
		int[][] PasArr = new int[n][n];
		
		
		for(row = 0; row < n; row++) {
			for(col = 0; col <= row; col++) {
				if(col == 0 || col == row) {
					PasArr[row][col] = 1;
				}
				else {
					PasArr[row][col] = PasArr[row - 1][col - 1] + PasArr[row -1][col];
				}
			}
		}
		
		return PasArr;
	}
	
	public static void Print2D(int[][] arr) {
		
		for(int row = 0; row < arr.length; row++) {
			for(int col =0; col <= row; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int n = 6;
		int[][] arr = new int[n][n];
		
		arr = CreatePascalTriangle(n);
		Print2D(arr);
		
	}

}
