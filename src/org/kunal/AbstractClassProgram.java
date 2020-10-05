package org.kunal;

abstract class Shape {
	
	String shade;
	
	abstract int area();
	
	public abstract String toString();
	
	Shape(String shade) {
		this.shade = shade;
	}
}

class Rectangle extends Shape {
	int length;
	int width;
	
	Rectangle (String shade, int length, int width) {
		super(shade);
		this.length = length;
		this.width = width;
	}
	
	int area() {
		return length * width;
	}
	
	public String toString() {
		return "Rectangle Color is " +super.shade+ " and size " +area();
	}
}

public class AbstractClassProgram {
	public static void main(String args[]) {
		Shape s = new Rectangle("Blue", 3, 5);
		
		System.out.println(s.toString());
	}
}