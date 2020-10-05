package org.kunal;

class Demo {
	private String name;
	private int num;
	
	public String getName() {
		return name;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
}

public class EncapsulationProgram {
	public static void main(String args[]) {
		Demo d = new Demo();
		d.setName("Kunal");
		d.setNum(7);
		
		Demo d1 = new Demo();
		d1.setName("Sid");
		d1.setNum(11);
		
		System.out.println("Name: " +d.getName()+ "\nNumber: " +d.getNum());
		System.out.println("Name: " +d1.getName() + "\nNumber: " +d1.getNum());
	}
}