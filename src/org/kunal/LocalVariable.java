package org.kunal;

public class LocalVariable {
	public void run() {
		int a = 5;
		int b = 3;
		int c = a + b;
		System.out.println(c);
	}
	
	public static void main(String args[]) {
		LocalVariable lv = new LocalVariable();
		lv.run();
	}
}