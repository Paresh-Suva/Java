package com.paresh.Methods;

import java.util.Scanner;

public class AverageFinder {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		float First = Sc.nextFloat();
		System.out.print("Enter Second Number: ");
		float Second = Sc.nextFloat();
		System.out.print("ENter Third Number: ");
		float Third = Sc.nextFloat();

		float Result = Average(First, Second, Third);
		System.out.println("Average Is: " + Result);
		Sc.close();
	}

	public static float Average(float a, float b, float c) {
		float Avg = (a + b + c) / 3.0f;
		return Avg;
	}
}
