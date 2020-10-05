package org.kunal;

import java.io.*;
import java.util.*;

public class StringBufferProgram {
	public static void main(String args[]) {
		
		StringBuffer sb = new StringBuffer("Get Set");
		
		int a = sb.length();
		int b = sb.capacity();
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.insert(3, " and");
		System.out.println(sb);
		
		sb.append(" Go");
		System.out.println(sb);
		
		sb.replace(3,7, " All");
		System.out.println(sb);
		
		sb.delete(3, 7);
		System.out.println(sb);
		
		sb.deleteCharAt(2);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
	}
}