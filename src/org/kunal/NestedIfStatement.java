package org.kunal;

public class NestedIfStatement {
	public static void main(String args[]) {
		int age = 25;
		int weight = 60;
		
		if(age > 18) {
			if(weight > 45) {
				System.out.println("Eligible for Voting");
			}
		}
		else {
			System.out.println("Not Eligible for Voting");
		}
	}
}
