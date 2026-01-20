package com.training.day1;

public class Q4_attempt12DarraypatternTriangle {
	public static void main(String[] args) {
		int matrix1[][]=new int[8][8];
		   for(int i=0;i<8;i++) {
			   for(int j=0;j<i;j++) {
					   matrix1[i][j]=j+1;
				   
			   }
		   }
		   for(int i=0;i<8;i++) {
			   for(int j=0;j<i;j++) {
				  System.out.print(matrix1[i][j]+" ");
			   }System.out.println();
		   }
		   
	}
   
}
