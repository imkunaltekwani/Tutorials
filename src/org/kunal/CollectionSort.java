package org.kunal;

import java.util.*;

public class CollectionSort {
	public static void main(String args[]) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(7);
		a.add(3);
		a.add(1);
		a.add(5);
		
		Collections.sort(a);
		
		System.out.println("Collection Sort : " +a);
		
	}
}
