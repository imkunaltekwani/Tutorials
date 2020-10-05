package org.kunal;

public class Program1 {
	
	String name;
	int age;
	
	public Program1 (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String toString() {
		return ("Dog name: " +this.name+ "\nAge: " +this.age);
	}
	
	public static void main(String args[]) {
		Program1 p = new Program1("Pug", 3);
		System.out.println(p.toString());
	}
}