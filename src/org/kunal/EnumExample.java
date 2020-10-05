package org.kunal;

public class EnumExample {
	enum Color {
		RED, BLUE, YELLOW;
	}
	
	public static void main(String args[]) {
		Color arr[] = Color.values();
		
		for (Color col : arr) {
			System.out.println(col+ " Index : " +col.ordinal());
		}
		
		System.out.println(Color.valueOf("RED"));
		
	}
}