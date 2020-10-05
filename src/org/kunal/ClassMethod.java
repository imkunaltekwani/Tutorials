package org.kunal;

import java.lang.reflect.Method;
import java.lang.reflect.Field;

class ClassMethod {
	public static void main(String args[]) {
		
		Student s1 = new Student();
		
		Class c = s1.getClass();
		System.out.println(c.getName());
		
		Method m[] = c.getDeclaredMethods();
		for(Method md : m) 
			System.out.println(md.getName());
		
		Field f[] = c.getDeclaredFields();
		for(Field fd : f)
			System.out.println(fd.getName());
	}
}


class Student {
	String name;
	int age;
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int setAge() {return age;}
	public void getAge() {this.age = age;}
	
}