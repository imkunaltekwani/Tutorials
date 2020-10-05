package org.kunal;

public class SwitchStatement {
	public static void main(String args[]) {
		String sub = "Science";
		
		switch (sub) {
		
		case "Maths":
			System.out.println("Maths");
			break;
		
		case "Science":
			System.out.println("Science");
			break;
			
			default : 
				System.out.println("Invalid Entry");
		}
	}
}