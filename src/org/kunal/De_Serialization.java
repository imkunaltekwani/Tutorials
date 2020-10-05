package org.kunal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Base implements Serializable {
	
	int i;
	
	Base(int i) {
		this.i = i;
	}
}

class Derived extends Base {
	
	int j;
	
	Derived(int i, int j) {
		
		super(i);
		this.j = j;
	}
}


public class De_Serialization {
	public static void main(String args[]) throws Exception {
		
		Derived c = new Derived(3, 5);
		
		System.out.println(c.i);
		System.out.println(c.j);
		
		FileOutputStream fos = new FileOutputStream("a.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(c);
		
		fos.close();
		oos.close();
		
		// Deserializing 
		
		FileInputStream fis = new FileInputStream("a.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Derived c1 = (Derived)ois.readObject();
		
		fis.close();
		ois.close();
		
		System.out.println(c1.i);
		System.out.println(c1.j);
		
	}
}
