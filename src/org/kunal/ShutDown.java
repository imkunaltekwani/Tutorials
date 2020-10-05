package org.kunal;

public class ShutDown {
	public static void main(String args[]) {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				System.out.println("Shutdown Hook is Running");
			}
		});
		System.out.println("Application Terminate");
	}
}