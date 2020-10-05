package org.kunal;

class Car {
	int num;
	
	Car(int num) {
		this.num = num;
	}
}

public class Swap {
	public static void swap (Car c1, Car c2) {
		int temp = c1.num;
		c1.num = c2.num;
		c2.num = temp;
	}
	
	public static void main(String args[]) {
		Car c1 = new Car(3);
		Car c2 = new Car(5);
		swap (c1,c2);
		
		System.out.println(c1.num);
		
		System.out.println(c2.num);
	}
}