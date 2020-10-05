package org.kunal;

enum Signal {
	RED("STOP"), GREEN("GO"), ORANGE("GO SLOW");
	
	private String action;
	
	public String getAction() {
		return this.action;
	}
	
	private Signal (String action) {
		this.action = action;
	}
}

public class EnumExample3 {
	public static void main(String args[]) {
		Signal[] s = Signal.values();
		for(Signal s1 : s) {
			System.out.println(s1.name()+ " Indicates " +s1.getAction());
		}
		
	}
}