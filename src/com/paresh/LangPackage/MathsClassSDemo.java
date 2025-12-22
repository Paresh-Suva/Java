package com.paresh.LangPackage;

public class MathsClassSDemo {
	public static void main(String[] args) {
		
		System.out.print("Absolute: ");
		System.out.println(Math.abs(-123));
		
		System.out.print("Cube Root: ");
		System.out.println(Math.cbrt(27));
		
		System.out.print("Decrement: ");
		System.out.println(Math.decrementExact(7));
		
		System.out.print("Exponent: ");
		System.out.println(Math.getExponent(2));
		
		System.out.print("Round Dividion: ");
		System.out.println(Math.floorDiv(50, 9));
		
		System.out.print("e Power x: ");
		System.out.println(Math.exp(1));
		
		System.out.print("Log base 10: ");
		System.out.println(Math.log10(12));
		
		System.out.print("Maximum: ");
		System.out.println(Math.max(100, 10));
		
		System.out.print("Tan: ");
		System.out.println(Math.tan(45*Math.PI/180));
		
		System.out.print("Convert to radian: ");
		System.out.println(Math.toRadians(90));
		
		System.out.print("Convert to degree: ");
		System.out.println(Math.toDegrees(90));
		
		System.out.print("Random: ");
		System.out.println(Math.random());
		
		System.out.print("Power: ");
		System.out.println(Math.pow(10, 2));
		
		System.out.print("Exact Power: ");
		System.out.println(Math.multiplyExact(100, 2000));
		
		System.out.print("Next float value: ");
		System.out.println(Math.nextAfter(12.5, 13));
		
	}
}
