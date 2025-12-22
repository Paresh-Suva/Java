package com.paresh.Static;

class Counter{
	// Static Variable: Sheared with all object.
	static int Increment = 0;
	
	public Counter() {
		Increment++;
	}
	
	// Static Method
	static public void Display() {
		System.out.println("Value Of Static Variable: "+Increment);
	}
	
	public void Name() {
		System.out.println("Hello");
	}
	
}

public class StaticDemo {
	
	static {
		System.out.println("Hello I Am Static Block...");
	}
	public static void main(String[] args) {
		Counter Obj = new Counter(); // Increment = 1
		Counter Obj1 = new Counter(); // Increment = 2
		Counter Obj2 = new Counter(); // Increment = 3
		Counter Obj3 = new Counter(); // Increment = 4
		
		// Calling Static Method Without Object Of that Class
		Counter.Display();// Increment = 4
	}
	
}
