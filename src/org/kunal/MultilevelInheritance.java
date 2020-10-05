package org.kunal;

class Bank {
	public void account() {
		System.out.println("ICICI Bank");
	}
}

class Finterest extends Bank {
	public void finterest() {
		System.out.println("FD ROI - 7%");
	}
}

class Rinterest extends Finterest {
	public void Rinterest() {
		System.out.println("RD ROI - 5%");
	}
}


class MultilevelInheritance {
	public static void main(String args[]) {
		Rinterest r = new Rinterest();
		r.account();
		r.finterest();
		r.Rinterest();
	}
}