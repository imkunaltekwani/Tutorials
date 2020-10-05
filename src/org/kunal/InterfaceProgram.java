package org.kunal;

import java.lang.*;
import java.util.*;
import java.io.*;


interface Book {
	abstract public void line();
}

interface SingleLine extends Book {
	public void singleline();
}

interface Size extends SingleLine {
	public void size();
}

class Stall implements Size {
	
	public void line() {
		System.out.println("Book");
	}
	
	public void singleline() {
		System.out.println("Single Line");
	}
	
	public void size() {
		System.out.println("A4 Size");
	}
	
}

public class InterfaceProgram {
	public static void main(String args[]) {
		Stall s = new Stall();
		s.line();
		s.singleline();
		s.size();
	}
}