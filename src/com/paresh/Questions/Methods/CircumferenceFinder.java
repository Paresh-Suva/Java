package com.paresh.Methods;

import java.util.Scanner;

public class CircumferenceFinder {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);

		System.out.print("Enter Radius Of Circle: ");
		float Radius = Sc.nextFloat();
		
		CircumferenceFind(Radius);
		Sc.close();
	}
	public static float CircumferenceFind(float Radius) {
		float Circumference= 2.0f* 3.14f * Radius;
		System.out.println("Circumference Of Circle Is: "+Circumference);
		return 0;
	}
}
