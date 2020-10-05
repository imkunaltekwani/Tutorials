package org.kunal;

import java.io.*;
import java.util.*;

public class StringProgram {
	public static void main(String args[]) {
		
		String s1 = "Get Set Go";
		String s2 = "On Your Mark, ";
		String s3 = "get set go";
		
		System.out.println(s1.toLowerCase());
		
		System.out.println(s2.toUpperCase());
		
		System.out.println(s1.trim());
		
		System.out.println(s2.concat(s1));
		
		System.out.println(s1.charAt(5));
		
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.equalsIgnoreCase(s3));
		
		System.out.println(s1.lastIndexOf("e"));
		
		System.out.println(s1.indexOf("et", 3));
		
		System.out.println(s1.indexOf("Go"));
		
		System.out.println(s1.substring(4, 7));
		
		System.out.println(s1.substring(3));
		
		System.out.println(s1.length());
		
		System.out.println(s1.replace('G', 'K'));
		
		System.out.println(s1.compareTo(s3));
	}
}
