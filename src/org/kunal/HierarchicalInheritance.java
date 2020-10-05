package org.kunal;

class MilkProducts {
	public void products() {
		System.out.println("Milk Products");
	}
}
class Butter extends MilkProducts {
	public void butter() {
		System.out.println("Butter");
	}
}

class Cheese extends MilkProducts {
	public void cheese() {
		System.out.println("Cheese");
	}
}

class Ghee extends MilkProducts {
	public void ghee() {
		System.out.println("Ghee");
	}
}

class HierarchicalInheritance {
	public static void main(String args[]) {
		MilkProducts mp = new MilkProducts();
		Butter b = new Butter();
		Cheese c = new Cheese();
		Ghee g = new Ghee();
		
		mp.products();
		b.butter();
		c.cheese();
		g.ghee();
	}
}