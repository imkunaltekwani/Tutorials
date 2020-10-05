package org.kunal;

public class StringComparision {
	public static void main(String args[]) {
		String s = "Ram";
		String s1 = "Ram";
		String s2 = new String("Ram");
		String s3 = new String("Ram");
		String nulls1 = null;
		String nulls2 = null;
		
		System.out.println(s.equals(s1));
		System.out.println(s1.equals(s2));
		
		System.out.println(s == s1);
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(nulls1 == nulls2);
		
		System.out.println(s.compareTo(s1));
		
	}
}
