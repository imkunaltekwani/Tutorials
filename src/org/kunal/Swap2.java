package org.kunal;

class Bike {
	String name;
	int num;
	
	Bike (String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	void print() {
		System.out.println("Bike Name : " +name+ " \nVehicle No : " +num);
	}
}

class Wrapper {
	Bike b;
	
	Wrapper(Bike b) {
		this.b = b;
	}
}

class Swap2 {
	public static void swap (Wrapper w1, Wrapper w2) {
		Bike temp = w1.b;
		w1.b = w2.b;
		w2.b = temp;
	}
	
	public static void main(String args[]) {
		Bike b1 = new Bike("KTM", 3511);
		Bike b2 = new Bike("Bullet", 1947);
		Wrapper w1 = new Wrapper(b1);
		Wrapper w2 = new Wrapper(b2);
		
		swap(w1,w2);
		
		w1.b.print();
		w2.b.print();
	}
}