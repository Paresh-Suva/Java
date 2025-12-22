package com.paresh.Recursion;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int Number = scanner.nextInt();
		scanner.close();
		
		Factorial(Number);
	}
	public static int Factorial(int Number) {
		if(Number==1 || Number==1) {
			return 1;
		}
		
		int Result = Number * Factorial((Number-1));
		return Result;
		
	}
}

