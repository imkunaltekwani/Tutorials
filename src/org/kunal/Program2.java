package org.kunal;

import java.io.*;
import java.util.*;

public class Program2 {
	
	public static String reverseString(String str) {
		
		char ch[] = str.toCharArray();
		String rev = "";
		for(int i=ch.length-1; i>0; i--) {
			rev += ch[i];
		}
		return rev;
	}
	
	public static void main(String args[]) {
		
		String s1 = "Welcome";
		String s2 = "User";
		
		System.out.println(s1.concat(s2));
		System.out.println(Program2.reverseString("Welcome User"));
	}
}