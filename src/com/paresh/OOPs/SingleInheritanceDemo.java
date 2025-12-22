package com.paresh.OOPs;
class parent01{
	void Method1(){
		System.out.println("This Is Parent Class Method: ");
	}
	void Method2(){
		System.out.println("This Is Parent Class Method But Invoke By Child Class: ");
	}
}
class child01 extends parent01{
	void Display(){
		System.out.println("This Is Child Class Method:");
		Method2();
	}
}
class SingleInheritanceDemo{
	public static void main(String[] args){
		parent01 P1 = new parent01();
		P1.Method1();
		
		child01 C1 = new child01();
		C1.Display();
		
	}
}
