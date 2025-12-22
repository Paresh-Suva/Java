package com.paresh.Threads;

class Test extends Thread {

	public Test(String Name) {
		super(Name);
		setPriority(MAX_PRIORITY);
	}
}

class Unknown extends Thread {

	@Override
	public void run() {

		int count = 0;
		while (true) {

			System.out.println(count++);
//			try {
//					Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				System.out.println(e);
//			}
		}
	}
}

class YieldDemo extends Thread{
	
	@Override
	public void run() {
		int count=1;
		while (true) {
			System.out.println(count++ +" My Thread");
		}
	}
}

public class ConstructorOfThread {

	public static void main(String[] args) throws  Exception {

		/*
		 * Test T1 = new Test("My Thread 1");
		 * 
		 * System.out.println("ID: " + T1.getId()); 
		 * System.out.println("Name: " +T1.getName()); 
		 * System.out.println("Priority: " + T1.getPriority());
		 * System.out.println("State: " + T1.getState()); 
		 * System.out.println("Alive: " +
		 * T1.isAlive()); 
		 * System.out.println("--------------------------\n");
		 */
		
		/*
		 * Unknown U1 = new Unknown(); 
		 * U1.start(); 
		 * U1.interrupt();
		 */
		
		/*
		 * Unknown U2 = new Unknown(); 
		 * U2.setDaemon(true); 
		 * U2.start(); // No Output //
		 * try {Thread.sleep(100);} catch (Exception e) {}
		 */
		
		/*
		 * Unknown U3 = new Unknown();
		 * U3.setDaemon(true); 
		 * U3.start(); 
		 * Thread mainThread = Thread.currentThread(); 
		 * mainThread.join();
		 */
		
		YieldDemo Y1 = new YieldDemo();
		Y1.start();
		
		int count=1;
		while (true) {
			System.out.println(count++ +" Main");
			Thread.yield();
		}
		
	}
}
