package org.kunal;

class Fruits {
	String name;
	int pics;
	
	Fruits (String name, int pics) {
		this.name = name;
		this.pics = pics;
	}
	
	public String toString() {
		return ("Fruit Name: " +name+ "\nNo. of Pices : " +pics);
	}
}

class Apple extends Fruits {
	
	int price;
	
	Apple (String name, int pics, int price) {
		super(name, pics);
		this.price = price;
	}
	public String toString() {
		return (super.toString()+ "\nPrice: Rs." +price);
	}
}

public class InheritanceProgram {
	public static void main(String args[]) {
		Fruits f = new Fruits("Mango", 12);
		System.out.println(f.toString());
		Apple a = new Apple("Apple", 12, 250);
		System.out.println(a.toString());
	}
}