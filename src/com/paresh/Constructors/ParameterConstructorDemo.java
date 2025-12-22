package com.paresh.Constructors;

class Addition{
	Addition(int A, int B){
		int Result = A + B;
		System.out.println("Addition Of "+A+" And "+B+" is: "+Result);
	}
}
public class ParameterConstructorDemo {
	
	public static void main(String[] args) {
		Addition obj = new Addition(10, 20);
		Demo d1 = new Demo();
		
	}
}
