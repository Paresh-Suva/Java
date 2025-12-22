package com.paresh.Constructors;

class Hello{
	public Hello() {
		System.out.println("Hello...");
	}
}

class World extends Hello{
	public World() {
		System.out.println("World...");
	}
}
public class NewConstructor {

	public static void main(String[] args) {
		
		World world = new World();
				
		
		
	}
}
