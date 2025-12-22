package com.paresh.Static;

class Vehicles{
	
	public Vehicles() {
		Car Obj = new Car();
		Obj.Display();
	}
	
	// Static Method
	static public void mileage() {
		System.out.println("15-20 KM...");
	}
	
	// Static Class
	static class Car{
		
		public void Display(){
			System.out.println("Hello, I am Satic Class Method....");
		}
	}
}

class Bike extends Vehicles{
	
	// ERROR: Static Method Can't be override
	 // public void mileage(){} 
	 
}


public class StaticClass {
	public static void main(String[] args) {
		Vehicles Obj = new Vehicles();
	}
}
