package com.paresh.Threads;

class MyData {
	int value;
	boolean flage = true;
	
	synchronized public void set(int v) {
		while (flage != true) {
			try{wait();}catch (Exception e) {}
		} 
		value = v;
		flage = false;
		notify();
	}

	synchronized public int get() {
		int x = 0;
		while (flage != false) {
			try{wait();}catch (Exception e) {}
		} 
		
		x = value;
		flage = true;
		notify();
		return x;
	}

}

class Producer extends Thread {

	MyData myData;

	public Producer(MyData d) {
		myData = d;
	}

	@Override
	public void run() {
		int count = 1;
		while (true) {
			myData.set(count);
			System.out.println("Producer "+count);
			count++;
		}
	}
}

class Consumer extends Thread {

	MyData myData;

	public Consumer(MyData d) {
		myData = d;
	}

	@Override
	public void run() {
		int value;
		while (true) {
			value = myData.get();
			System.out.println("Consumer: "+value);
		}
	}
}

public class InterprocesssComunication {

	public static void main(String[] args) {

		MyData myData = new MyData();
		Producer producer = new Producer(myData);
		Consumer consumer = new Consumer(myData);
		
		producer.start();
		consumer.start();
	}

}
