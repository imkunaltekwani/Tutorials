package org.kunal;

import java.util.Arrays;

public class ArraySort {
	public static void main(String args[]) {
		int[] arr = {3,1,2,11,5,21,7};
		Arrays.sort(arr);
		
		System.out.println("Array Sorting : " +Arrays.toString(arr));
	}
}