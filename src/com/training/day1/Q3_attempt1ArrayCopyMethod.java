package com.training.day1;

public class Q3_attempt1ArrayCopyMethod {
public static int[] copyOf(int[] arr) {
	if(arr==null) {
		return null;
	}

	int [] arr1=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		arr1[i]=arr[i];
	}
	return arr1;
}


	public static void main(String[] args) {
		int[] arr = {1, 4, 5, 333, 55};
		int[] arr2 = new int[5];
		
		arr2 = copyOf(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
