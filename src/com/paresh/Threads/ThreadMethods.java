package com.paresh.Threads;

class MyThread0 extends Thread{
	public MyThread0(String Name) {
		super(Name);
	}
	 @Override
	 public void run() {
		 for(int i=0;i<5;i++) {
			 System.out.println(MyThread0.currentThread().getName()+"Running...");
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     Thread.yield();
		 }
	 }
}

public class ThreadMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread T1 = new Thread();
		
		String currentName = T1.currentThread().getName();
		System.out.println("Default Thread Name: "+currentName);
		
		T1.currentThread().setName("Paresh");
		String newName = T1.currentThread().getName();
		System.out.println("New Thread Name: "+newName);
		
		int defaultPriority = T1.getPriority();
		System.out.println("Default Thread Priority: "+defaultPriority);
		
		T1.currentThread().setPriority(Thread.MAX_PRIORITY);
		int newPriority = T1.currentThread().getPriority();
		System.out.println("New Thread Priority: "+newPriority);

		System.out.println("Current thread state: "+T1.getState());
		T1.start();
		System.out.println("Thread Is Alive After Start: "+T1.isAlive());
		// Waiting For Completing T1
		T1.join();
		System.out.println("Thread State: "+T1.getState());
		
		System.out.println("Thread Is Alive After Terminated: "+T1.isAlive());
		
		
		MyThread0 M1 = new MyThread0("Thread-1");
		MyThread0 M2 = new MyThread0("Thread-2");
		
		// System.out.println("Without Yield");
		// M1.start();
		// M2.start();
		
		System.out.println("\nWith Yield");
		M1.start();
		M2.start();
	}
}
