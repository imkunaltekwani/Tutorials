package org.kunal;

class Birds {
	String name;
	String food;
}

public class InstanceVariable {
	public static void main(String args[]) {
		Birds b1 = new Birds();
		
		b1.name = "Eagle";
		b1.food = "Fish";
		
		Birds b2 = new Birds();
		
		b2.name = "Parrot";
		b2.food = "Rice";
		
		System.out.println(b1.name+ " eat " +b1.food);
		System.out.println(b2.name+ " eat " +b2.food);
		
	}

}
