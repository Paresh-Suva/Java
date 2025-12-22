package com.paresh.Methods;

import java.util.Scanner;

public class SumOfOddBetweenTwoNumber {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.print("Enter A Number: ");
		int Number= Sc.nextInt();
		
		int Sum=Addition(Number);
		System.out.println("Sum Of ODD Number Between "+Number+" Is "+Sum);
		Sc.close();
	}
	public static int Addition(int Number) {
		int i=1;
		int Result=0;
		while (i<=Number) {
			Result = Result+i;
			i=i+2;
		}
		return Result;
	}
}
