package com.paresh.Interface;

interface Papa{
	// int A;  --> Error You can't create instance variable of interface
	
   //	public void Display() {
   //		   --> Error: You can't create Concrete method in interface.
   //	}
	
	public void Display();
}

interface Mummy{
	
	public void Print();
}

class Child1 implements Papa, Mummy{
	
	@Override
	public void Display() {
		System.out.println("Hello, I Am Child One...");
	}
	
	@Override
	public void Print() {
		System.out.println("My Name Is: Apple");
	}
	
}
class Child2 implements Papa, Mummy{
	
	@Override
	public void Display() {
		System.out.println("Hello, I Am Child Two...");
	}
	
	@Override
	public void Print() {
		System.out.println("My Name Is: Banana");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		
		// Papa p1 = new Papa(); Error: You can't create object of interface
	    Papa obj1 = new Child1();
	    Mummy obj2 = new Child2();
	    
	    obj1.Display();
	    // obj1.Print(); error: Because Print Is Method Of Mummy class
	
	    Child1 child1 = new Child1();
	    Child2 child2 = new Child2();
	    
	    child1.Display();
	    child1.Print();
	    
	    child2.Display();
	    child2.Print();
	}
}
