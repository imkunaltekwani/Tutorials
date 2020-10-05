package org.kunal;

class Bound <T extends A> {
	
	private T obj;
	
	public Bound(T obj) {
		this.obj = obj;
	}
	
	public void run() {
		this.obj.display();
	}
}

class A {
	public void display() {
		System.out.println("Inside Super Class A");
	}
}

class B extends A {
	public void display() {
		System.out.println("Inside Sub Class B");
	}
}

class BoundedType {
	public static void main(String args[]) {
		Bound<A> ba = new Bound<A>(new A());
		ba.run();
		
		Bound<B> bb = new Bound<B>(new B());
		bb.run();
	}
}