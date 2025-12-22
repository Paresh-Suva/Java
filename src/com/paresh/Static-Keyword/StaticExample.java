package com.paresh.Static;

class Truck{
	
	static int Price = 0;
	
	public static void Display() {
		System.out.println("Intial Value Of Static Variable: "+Price);// 0
		Price =10;
		System.out.println("Intial Value Of Static Variable: "+Price);// 10
	}
}
public class StaticExample {

	public static void main(String[] args) {
		Truck Obj = new Truck();
		Obj.Display();// 0 and 10
		System.out.println(Truck.Price);// 10
	}
}
