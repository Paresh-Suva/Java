package com.paresh.Threads;

public class ThreadBasic extends Thread {
	
	public static void main(String[] args) {
		
		// Printing Thread Name
		String threadName = Thread.currentThread().getName();
		System.out.println("Current Thread Name: " + threadName);
		
		// New name of thread 
		Thread.currentThread().setName("NewThreadName");

		// Printing thread priority		
		int priority = Thread.currentThread().getPriority();
		System.out.println("Default Priority Of Thread: " + priority);

		// Changing thread priority
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		System.out.println("New Priority Of Thread: " + Thread.currentThread().getPriority());

		
		Thread currentThread = Thread.currentThread();
		System.out.println("Current Thread Execution: " + currentThread);

		// Checking thread is alive means is it present in any state other than terminated
		boolean isThreadAlive = Thread.currentThread().isAlive();
		System.out.println("Is Thread Is Alive ?? => " + isThreadAlive);

		// Check thread state
		Thread.State state = Thread.currentThread().getState();
		System.out.println("State Of Thread: " + state);
	}
}
