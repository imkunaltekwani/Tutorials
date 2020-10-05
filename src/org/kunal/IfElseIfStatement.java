package org.kunal;

public class IfElseIfStatement {
	public static void main(String args[]) {
		int marks = 90;
		
		if (marks > 95) {
			System.out.println("Grade A+");
		}
		
		else if (marks > 90) {
			System.out.println("Grade A");
		}
		
		else if (marks > 75) {
			System.out.println("Grade B");
		}
		
		else if (marks > 60) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Grade D");
		}
	}
}
