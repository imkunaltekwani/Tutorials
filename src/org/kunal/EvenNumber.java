package org.kunal;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String args[]) {
		int i;
		
		Scanner s = new Scanner(System.in); {
			int n = s.nextInt();
			System.out.println("Enter Number : " +n);
			
			for(i=0; i<n; i++) {
				if(i%2==0) {
					System.out.println(+i);
				}
			}
		}
	}
}