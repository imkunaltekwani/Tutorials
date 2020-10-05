package org.kunal;

class Parent {
	public void display() {
		System.out.println("Hello Parent");
	}
}

class Child extends Parent {
	public void display() {
		System.out.println("Hello Child");
	}
}

class MethodOverriding {
	public static void main(String args[]) {
		Parent p = new Parent();
		Child c = new Child();
		
		p.display();
		c.display();
	}
}