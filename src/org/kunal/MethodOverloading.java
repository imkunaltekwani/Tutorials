package org.kunal;

public class MethodOverloading {
	
	public String display(String a, String b) {
		return a + b;
	}
	
	public String display(String a, String b, String c) {
		return a + b + c;
	}
	
	public int display(int a, int b) {
		return a + b;
	}
	
	public static void main(String args[]) {
		
		MethodOverloading m = new MethodOverloading();
		
		System.out.println(m.display("Kunal ", "Tekwani"));
		System.out.println(m.display("Get ", "Set ", "Go"));
		System.out.println(m.display(3,5));
	}
}