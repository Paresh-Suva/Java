package com.paresh.OOPs;

class Students {
	String Name;
	int Number;

	// Default Constructor
	public Students() {
		System.out.println("Default Constructor......");
	}

	// Parameterized Constructor
	public Students(String Name, int Number) {
		super();
		this.Name = Name;
		this.Number = Number;
		System.out.println("This Is Parameterized Constructor......");
	}

	// Copy Constructor
	public Students(Students other) {
		this.Name = other.Name;
		this.Number = other.Number;
		System.out.println("This Is Copy Constructor......\n");

	}

	// Display Method
	public void Display() {
		System.out.println("Name: "+Name+" Number: "+Number);
	}
}

public class ConstructorDemo {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Students defaultConstructor = new Students();
		Students  parameterizedConstructor = new Students("Paresh", 01);
		Students copyConstructor = new Students(parameterizedConstructor);
		
		parameterizedConstructor.Display();
		copyConstructor.Display();
	}
}
