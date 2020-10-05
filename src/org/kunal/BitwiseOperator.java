package org.kunal;

public class BitwiseOperator {
	public static void main(String args[]) {
		
		int a = 0x0005; 
        int b = 0x0007;
		
        System.out.println(a & b);
        
        System.out.println(a ^ b);
        
        System.out.println(a | b);
        
        System.out.println(~a);
        
        System.out.println(a);
	}	
}
