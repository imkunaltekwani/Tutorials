package org.kunal;

import java.util.*;

public class StringBuilderConstructor {
	public static void main(String args[]) {
	
	StringBuilder sb = new StringBuilder();
	
	sb.append("Go");
	System.out.println(sb);
	
	StringBuilder sb2 = new StringBuilder("Get Set Go");
	
	System.out.println(sb2.toString());
	
	
	StringBuilder sb3 = new StringBuilder(10);
	
	System.out.println(sb3.capacity());
		
	StringBuilder sb4 = new StringBuilder(sb2);
	
	System.out.println(sb4.toString());
	}
}
