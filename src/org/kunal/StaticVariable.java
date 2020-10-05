package org.kunal;

class Emp {
	public static String name;
	public static int age;
}

public class StaticVariable {
	public static void main(String args[]) {
		Emp.name = "Kunal";
		Emp.age = 24;
		
		System.out.println(Emp.name+ " age is " +Emp.age);
	}
}