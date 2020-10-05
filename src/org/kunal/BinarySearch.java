package org.kunal;

import java.util.Arrays;


public class BinarySearch {
	public static void main(String args[]) {
		int arr[] = {11,5,3,7,21};
		Arrays.sort(arr);
		
		int key = 7;
		int res = Arrays.binarySearch(arr, key); 
		if(res > 0) {
			System.out.println(key+ " Index is " +res);
		}
	}
}