package org.kunal;

import java.util.*;

public class LogicalOperator {
	public static void main(String args[]) {
		
		String s = "Kunal";
		String s1 = "Student@123";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter User Id");
		String uid = scan.next();
		
		System.out.println("Enter Password");
		String pd = scan.next();
		
		if((uid.equals(s) && pd.equals(s1)) || (uid.equals(s1) && pd.equals(s))) {
			System.out.println("Welcome User");
		}
		else {
			System.out.println("Invalid User");
		}
		
	}
}