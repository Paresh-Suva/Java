package com.paresh.LangPackage;

/*
 * java.lang.Object
 *    |_ java.lang.Number
 *          |_ java.lang.Integer and so on
 */

public class WrapperDemo {
	public static void main(String[] args) {
		
		System.out.println(" Wrapper class demonstration");
		Integer I = new Integer(10);
		Integer  a = Integer.valueOf(10);
		Integer  b = 10;
		
		Byte c = 15;
     // Byte d = Byte.valueOf(15);  15--> Integer
		Byte d = Byte.valueOf("15"); // It calls string to byte conversion method
		Byte bb = 15;
		Byte e = Byte.valueOf(bb); // here bb us byte 
		
		Short f = Short.valueOf("123");
		
	 // Float g = Float.valueOf(12.4); // here 12.4 is double
		Float g = 12.4f;
		Float h = Float.valueOf(12.4f);
		Float i = Float.valueOf("12.4");
		
		Double j = 13.4;
		Double k = Double.valueOf(13.4);
		Double l = Double.valueOf("13.4");
		
		Character m = Character.valueOf('A');
		
		Boolean n = Boolean.valueOf(false);
		
		
		// Boxing--> o is box which contains 10.And p is object which wrap the o;
		Integer o = 10;
		Integer p = Integer.valueOf(o);  // Boxing
		Integer q = o; // Auto-Boxing
		
		
		// Unboxing--> r is object which refer to the 10 in heap.s is box which contains the 10.v
		Integer r = Integer.valueOf(10);
		Integer s = r.intValue(); // Unboxing
		Integer t = r; // Auto-Unboxing
	
	}
}
