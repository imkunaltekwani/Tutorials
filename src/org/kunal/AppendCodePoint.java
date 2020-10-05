package org.kunal;

public class AppendCodePoint {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Kunal");
		System.out.println("StringBuffer : " +sb);
		
		sb.appendCodePoint(84);
		System.out.println("After Append Code Point : " +sb);
	}
}