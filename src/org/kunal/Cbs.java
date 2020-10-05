package org.kunal;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Cbs {
	public static void main(String args[]) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(3);
		a.add(5);
		a.add(1);
		a.add(11);
		a.add(7);
		
		int key = 7;
		int res = Collections.binarySearch(a, key);
		if(res >=0) {
			System.out.println(key+ " Index is " +res);
		}
	}
}