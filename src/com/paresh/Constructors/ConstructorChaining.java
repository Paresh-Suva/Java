package com.paresh.Constructors;

class Printer{
	public Printer() {
		this(1);
		System.out.println("Hello I Am 1st Constructor....");
	}
	
	public Printer(int i) {
		this("Paresh");
		System.out.println("Hello I Am 2nd Constructor....");
	}
	public Printer(String Name) {
		System.out.println("Hello I Am 3rd Constructor....");
	}
}
public class ConstructorChaining {
	public static void main(String[] args) {
		Printer Obj = new Printer();
	}
}
