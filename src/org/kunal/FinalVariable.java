package org.kunal;

class Dog {
	final String name;
	final int age;
	
	Dog (String breed, int value) {
		name = breed;
		age = value;
	}
}

public class FinalVariable {
	public static void main(String args[]) {
		Dog d1 = new Dog("Pug", 3);
		
		Dog d2 = new Dog("Bulldog", 5);
		
		System.out.println(d2.name+ " age is " +d2.age);
		
		System.out.println(d1.name+ " age is " +d1.age);
	}
}