package org.kunal;

class One {
	public void one() {
		System.out.println("Get");
	}
}

class Two extends One {
	public void two() {
		System.out.println("Set");
		System.out.println("Go");
	}
}

class SingleInheritance {
	public static void main(String args[]) {
		Two t = new Two();
		t.one();
		t.two();
	}
}