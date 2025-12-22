package com.paresh.Threads;

// Daemon Thread: Running in background. JVM Not Wait For Daemon Thread

class MyThread1 extends Thread{
	
	@Override
	public void run() {
		
		while(true) {
			
			System.out.println("Hey There....");
		}
	}
	
}
public class ThreadDaemon {
	public static void main(String[] args) {

		MyThread1 M1 = new MyThread1();
		M1.setDaemon(true);// Daemon Thread
		
		MyThread1 M2 = new MyThread1();
		M2.start();
		M1.start();
		System.out.println("Main Thread Done...");
	}
}
