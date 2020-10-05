package org.kunal;


enum Color {
	BLACK, ORANGE, PURPLE;
	
	private Color() {
		System.out.println("Constuctor Call : " +this.toString());
	}
}

public class EnumExample2 {
	public static void main(String args[]) {
		Color c1 = Color.BLACK;
		System.out.println(c1);
	}
}