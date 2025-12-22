package com.paresh.Threads;
class World extends Thread{

	public void run(){
		for( ; ; ){
			System.out.println("World");
		}
	}
}

public class ThreadDemo{

	public static void main(String[] args) {
		World world = new World(); // New 
		world.start(); // Runnable --> Running

		for( ; ; ){
			System.out.println("Hello");
		}
	}
}
