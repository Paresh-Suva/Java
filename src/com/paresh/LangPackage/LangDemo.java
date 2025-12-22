package com.paresh.LangPackage;

import java.lang.*;

class MyObject{
	
	@Override
	public String toString(){
		return "This Is To String Method";
	}
	
	@Override
	public int hashCode() {
		
		return 100;
	}
	
	@Override
	public boolean equals(Object o) {
		return this.hashCode() == o.hashCode();
	}
}

public class LangDemo {
	public static void main(String[] args) {
		
		Object O1 = new Object();
		Object O2 = O1;
		Object O3 = new Object();
		
		// Indicates whether some other object is "equal to" this one.
		System.out.println(O1.equals(O2)); // true
		System.out.println(O1.equals(O3)); // false
		
		System.out.println(O1.hashCode()); // 925858445
		System.out.println(O2.hashCode()); // 925858445
		System.out.println(O3.hashCode()); // 798154996
		
		// Returns a string representation of the object.
		System.out.println(O1.toString()); // java.lang.Object@372f7a8d 
		
		/* Returns the runtime class of this Object. The returned Class object is 
		 * the object that is locked by static synchronized methods of the 
		 * represented class.
		 */
		System.out.println(O1.getClass()); // class java.lang.Object
	    System.out.println("---------------------------------------------");
	
	    MyObject myObject1 =  new MyObject();
	    MyObject myObject2 =  new MyObject();
	    
	    
	    System.out.println(myObject1.toString()); // This Is To String Method
	    
	    System.out.println(myObject1.hashCode()); // 100
	    System.out.println(myObject2.hashCode()); // 100
	    
	    System.out.println(myObject1.equals(myObject2)); // true
	    
	}
}
