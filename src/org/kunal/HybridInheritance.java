package org.kunal;

import java.lang.*;
import java.util.*;
import java.io.*;


class News {
	public void news() {
		System.out.println("The Hindu Express");
	}
}

interface Newspaper  {
	public void newspaper();
}

interface Application extends Newspaper {
	public void app();
}

class Medium implements Application, Newspaper {
	public void medium() {
		System.out.println("TRP");
	}

	public void newspaper() {
		System.out.println("1 Lakh Copies");
	}
	
	public void app() {
		System.out.println("20 Millions Download");
	}
}

	
public class HybridInheritance {
	public static void main(String args[]) {
		News n = new News();
		Medium md = new Medium();
		n.news();
		md.newspaper();
		md.app();
		md.medium();
	}
}
