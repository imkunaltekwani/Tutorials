package org.kunal;

public class TernaryOperator {
	public static void main(String args[]) {
		int a = 3, b = 5, c = 7, result;
		
		result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
		
		System.out.println(result);
	}
}
